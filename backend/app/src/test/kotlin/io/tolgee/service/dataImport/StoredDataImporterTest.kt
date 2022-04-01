package io.tolgee.service.dataImport

import io.tolgee.AbstractSpringTest
import io.tolgee.development.testDataBuilder.data.ImportTestData
import io.tolgee.exceptions.BadRequestException
import io.tolgee.testing.assertions.Assertions.assertThat
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class StoredDataImporterTest : AbstractSpringTest() {
  lateinit var storedDataImporter: StoredDataImporter
  lateinit var importTestData: ImportTestData

  @BeforeEach
  fun setup() {
    importTestData = ImportTestData()
    storedDataImporter = StoredDataImporter(applicationContext!!, importTestData.import)
  }

  @Test
  fun `it successfully imports valid data`() {
    importTestData.translationWithConflict.override = true
    importTestData.setAllResolved()
    testDataService.saveTestData(importTestData.root)
    storedDataImporter.doImport()
    translationService.find(importTestData.translationWithConflict.conflict!!.id)!!.let {
      assertThat(it.text).isEqualTo(importTestData.translationWithConflict.text)
    }
    val overriddenTranslation = translationService.find(importTestData.translationWithConflict.conflict!!.id)!!
    val keptTranslation = importTestData.root.data.projects[0].data.translations[1].self
    assertThat(overriddenTranslation.text).isEqualTo(importTestData.translationWithConflict.text)
    assertThat(keptTranslation.text).isEqualTo("What a text")
  }

  @Test
  fun `it throws bad request`() {
    testDataService.saveTestData(importTestData.root)
    Assertions.assertThatExceptionOfType(BadRequestException::class.java).isThrownBy {
      storedDataImporter.doImport()
    }
  }

  @Test
  fun `it checks for conflicts again`() {
    importTestData.setAllResolved()
    val projectBuilder = importTestData.root.data.projects[0]
    importTestData.root.data.projects[0].addTranslation {
      language = projectBuilder.data.languages[0].self
      key = projectBuilder.data.keys[4].self
      text = "Old translation text"
    }

    importTestData.importBuilder.data.importFiles[0].data.importTranslations[4].self {
      resolve()
    }

    testDataService.saveTestData(importTestData.root)
    Assertions.assertThatExceptionOfType(BadRequestException::class.java).isThrownBy {
      storedDataImporter.doImport()
    }
  }

  @Test
  fun `it force replaces translations`() {
    storedDataImporter = StoredDataImporter(applicationContext!!, importTestData.import, ForceMode.OVERRIDE)
    testDataService.saveTestData(importTestData.root)
    storedDataImporter.doImport()
    val overriddenTranslation = translationService.find(importTestData.translationWithConflict.conflict!!.id)!!
    val forceOverriddenTranslationId = importTestData.root.data.projects[0].data.translations[1].self.id
    val forceOverriddenTranslation = translationService.find(forceOverriddenTranslationId)!!
    assertThat(overriddenTranslation.text).isEqualTo(importTestData.translationWithConflict.text)
    assertThat(forceOverriddenTranslation.text).isEqualTo("Imported text")
  }

  @Test
  fun `it imports metadata`() {
    importTestData.addKeyMetadata()
    testDataService.saveTestData(importTestData.root)
    storedDataImporter = StoredDataImporter(applicationContext!!, importTestData.import, ForceMode.OVERRIDE)
    testDataService.saveTestData(importTestData.root)
    storedDataImporter.doImport()
    entityManager.flush()
    entityManager.clear()
    val key1 = entityManager.merge(importTestData.root.data.projects[0].data.keys[2].self)
    entityManager.refresh(key1)
    entityManager.refresh(key1.keyMeta)

    val comments = key1.keyMeta?.comments
    assertThat(comments).hasSize(3)
    assertThat(comments!![0].text).isEqualTo("Hello I am first comment (I exist)")
    assertThat(comments[1].text).isEqualTo("Hello I am second comment (I dont exist)")
    assertThat(comments[2].text).isEqualTo("One more")
    val references = key1.keyMeta?.codeReferences
    assertThat(references).hasSize(2)
    assertThat(references!![0].path).isEqualTo("./code/exist.extension")
    assertThat(references[0].line).isEqualTo(10)
  }

  @Test
  fun `it force keeps translations`() {
    importTestData.translationWithConflict.override = true
    importTestData.translationWithConflict.resolve()
    storedDataImporter = StoredDataImporter(applicationContext!!, importTestData.import, ForceMode.KEEP)
    testDataService.saveTestData(importTestData.root)
    storedDataImporter.doImport()
    val overriddenTranslation = translationService.find(importTestData.translationWithConflict.conflict!!.id)!!
    val forceKeptTranslationId = importTestData.root.data.projects[0].data.translations[1].self.id
    val forceKeptTranslation = translationService.find(forceKeptTranslationId)!!
    assertThat(overriddenTranslation.text).isEqualTo(importTestData.translationWithConflict.text)
    assertThat(forceKeptTranslation.text).isEqualTo("What a text")
  }
}
