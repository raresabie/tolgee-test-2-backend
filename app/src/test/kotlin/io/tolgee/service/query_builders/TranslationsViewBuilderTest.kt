package io.tolgee.service.query_builders

import io.tolgee.AbstractSpringTest
import io.tolgee.development.testDataBuilder.data.TranslationsTestData
import io.tolgee.dtos.request.translation.GetTranslationsParams
import io.tolgee.testing.assertions.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest

@SpringBootTest
class TranslationsViewBuilderTest : AbstractSpringTest() {
  @Test
  fun `returns correct page size and page meta`() {
    val testData = prepareLotOfData()
    val result = TranslationsViewBuilder.getData(
      applicationContext = applicationContext,
      projectId = testData.project.id,
      languages = setOf(testData.englishLanguage, testData.germanLanguage),
      PageRequest.of(0, 10),
    )
    assertThat(result.content).hasSize(10)
    assertThat(result.totalElements).isGreaterThan(90)
  }

  @Test
  fun `selects languages`() {
    val testData = prepareLotOfData()
    val result = TranslationsViewBuilder.getData(
      applicationContext = applicationContext,
      projectId = testData.project.id,
      languages = setOf(testData.englishLanguage),
      PageRequest.of(
        0, 10,
      )
    )
    assertThat(result.content[1].translations).doesNotContainKey("de")
  }

  @Test
  fun `searches in data`() {
    val testData = prepareLotOfData()
    val result = TranslationsViewBuilder.getData(
      applicationContext = applicationContext,
      projectId = testData.project.id,
      languages = setOf(testData.englishLanguage),
      PageRequest.of(0, 10),
      params = GetTranslationsParams().apply {
        search = "A tr"
      }
    )
    assertThat(result.content.first().translations["en"]?.text).isEqualTo("A translation")
    assertThat(result.totalElements).isEqualTo(1)
  }

  @Test
  fun `returns correct comment counts`() {
    val testData = generateCommentStatesTestData()

    val result = TranslationsViewBuilder.getData(
      applicationContext = applicationContext,
      projectId = testData.project.id,
      languages = setOf(testData.germanLanguage),
      PageRequest.of(0, 10),
      params = GetTranslationsParams()
    )

    val key = result.content.find { it.keyName == "commented_key" }!!
    assertThat(key.translations["de"]?.commentCount).isEqualTo(4)
    assertThat(key.translations["de"]?.unresolvedCommentCount).isEqualTo(2)
  }

  private fun generateCommentStatesTestData(): TranslationsTestData {
    val testData = TranslationsTestData()
    testData.addCommentStatesData()
    testDataService.saveTestData(testData.root)
    return testData
  }

  private fun prepareLotOfData(): TranslationsTestData {
    val testData = TranslationsTestData()
    testData.generateLotOfData()
    testDataService.saveTestData(testData.root)
    return testData
  }
}
