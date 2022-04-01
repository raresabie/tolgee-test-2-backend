package io.tolgee.service.export.exporters

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.tolgee.dtos.request.export.ExportParams
import io.tolgee.model.enums.TranslationState
import io.tolgee.service.export.dataProvider.ExportKeyView
import io.tolgee.service.export.dataProvider.ExportTranslationView
import io.tolgee.testing.assertions.Assertions.assertThat
import net.javacrumbs.jsonunit.assertj.assertThatJson
import org.junit.jupiter.api.Test
import java.io.InputStream

class JsonFileExporterTest {

  @Suppress("UNCHECKED_CAST")
  @Test
  fun `it scopes and handles collisions`() {
    val data = generateTranslationsForKeys(listOf("a.a.a.a", "a.a", "a.a.a", "a.b.b", "a.c.c", "b", "b.b"))
    val exported = JsonFileExporter(data, ExportParams()).produceFiles()
    val json = exported.getFileTextContent("/en.json")
    val parsed = jacksonObjectMapper()
      .readValue<Map<String, Any>>(json)

    val a = (parsed["a"] as Map<String, String>)
    val aa = a["a"]
    val aaa = a["a.a"]
    val aaaa = a["a.a.a"]
    val b = parsed["b"]
    val bb = parsed["b.b"]

    listOf(aa, aaa, aaaa, b, bb).forEach {
      assertThat(it).isEqualTo("text")
    }
  }

  @Suppress("UNCHECKED_CAST")
  @Test
  fun `it scopes to files`() {
    val data = generateTranslationsForKeys(listOf("a.a.a", "a", "a.a"))
    val exported = JsonFileExporter(
      data,
      ExportParams().apply {
        splitByScope = true
        splitByScopeDepth = 2
      }
    ).produceFiles()

    val ajson = exported.getFileTextContent("/en.json")
    assertThatJson(ajson) {
      node("a").isEqualTo("text")
    }
    val aajson = exported.getFileTextContent("a/en.json")
    assertThatJson(aajson) {
      node("a").isEqualTo("text")
    }
    val aaajson = exported.getFileTextContent("a/a/en.json")
    assertThatJson(aaajson) {
      node("a").isEqualTo("text")
    }
  }

  @Suppress("UNCHECKED_CAST")
  @Test
  fun `it returns result in the same order as it comes from DB`() {
    val keys = listOf("a", "b", "c", "d", "e", "f")
    val data = generateTranslationsForKeys(keys)
    val exported = JsonFileExporter(
      data,
      ExportParams()
    ).produceFiles()
    val parsed: LinkedHashMap<String, String> = exported.parseFileContent("/en.json")
    assertThat(parsed.keys.toList()).isEqualTo(keys)
  }

  @Suppress("UNCHECKED_CAST")
  @Test
  fun `it is formatted`() {
    val keys = listOf("a", "b")
    val data = generateTranslationsForKeys(keys)
    val exported = JsonFileExporter(
      data,
      ExportParams()
    ).produceFiles()
    assertThat(exported.getFileTextContent("/en.json")).contains("\n").contains("  ")
  }

  private fun Map<String, InputStream>.getFileTextContent(fileName: String): String {
    return this[fileName]!!.bufferedReader().readText()
  }

  private inline fun <reified T> Map<String, InputStream>.parseFileContent(fileName: String): T {
    return jacksonObjectMapper().readValue(this.getFileTextContent(fileName))
  }

  private fun generateTranslationsForKeys(keys: List<String>): List<ExportTranslationView> {
    return keys.sorted().map { keyName ->
      val key = ExportKeyView(1, keyName)
      val trans = ExportTranslationView(1, "text", TranslationState.TRANSLATED, key, "en")
      key.translations["en"] = trans
      trans
    }
  }
}
