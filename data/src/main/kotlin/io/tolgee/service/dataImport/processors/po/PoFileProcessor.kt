package io.tolgee.service.dataImport.processors.po

import com.ibm.icu.util.ULocale
import io.tolgee.exceptions.ImportCannotParseFileException
import io.tolgee.exceptions.PoParserException
import io.tolgee.model.dataImport.ImportLanguage
import io.tolgee.service.dataImport.processors.FileProcessorContext
import io.tolgee.service.dataImport.processors.ImportFileProcessor
import io.tolgee.service.dataImport.processors.messageFormat.FormatDetector
import io.tolgee.service.dataImport.processors.messageFormat.SupportedFormat
import io.tolgee.service.dataImport.processors.messageFormat.ToICUConverter
import io.tolgee.service.dataImport.processors.po.data.PoParsedTranslation
import io.tolgee.service.dataImport.processors.po.data.PoParserResult

class PoFileProcessor(
  override val context: FileProcessorContext
) : ImportFileProcessor() {

  lateinit var languageId: String
  lateinit var parsed: PoParserResult
  var poParser: PoParser = PoParser(context)

  override fun process() {
    try {
      parsed = poParser()
      languageId = parsed.meta.language ?: languageNameGuesses[0]
      context.languages[languageId] = ImportLanguage(languageId, context.fileEntity)

      parsed.translations.forEach { poTranslation ->
        val keyName = poTranslation.msgid.toString()

        if (poTranslation.msgidPlural.isNotEmpty()) {
          addPlural(poTranslation)
          return@forEach
        }
        if (poTranslation.msgid.isNotBlank() && poTranslation.msgstr.isNotBlank()) {
          val icuMessage = getToIcuConverter(poTranslation)
            .convert(poTranslation.msgstr.toString())
          context.addTranslation(keyName, languageId, icuMessage)

          poTranslation.meta.references.forEach { reference ->
            val split = reference.split(":")
            val file = split.getOrNull(0)
            val line = split.getOrNull(1)?.toIntOrNull()
            file?.let {
              context.addKeyCodeReference(keyName, it, line?.toLong())
            }
          }
          if (poTranslation.meta.extractedComments.isNotEmpty()) {
            val extractedComments = poTranslation.meta.extractedComments.joinToString(" ")
            context.addKeyComment(keyName, extractedComments)
          }

          if (poTranslation.meta.translatorComments.isNotEmpty()) {
            val translatorComments = poTranslation.meta.translatorComments.joinToString(" ")
            context.addKeyComment(keyName, translatorComments)
          }
        }
      }
    } catch (e: PoParserException) {
      throw ImportCannotParseFileException(context.file.name, e.message)
    }
  }

  private fun addPlural(poTranslation: PoParsedTranslation) {
    val plurals = poTranslation.msgstrPlurals?.map { it.key to it.value.toString() }?.toMap()
    plurals?.let {
      val icuMessage = ToICUConverter(ULocale(languageId), getMessageFormat(poTranslation), context)
        .convertPoPlural(plurals)
      context.addTranslation(poTranslation.msgidPlural.toString(), languageId, icuMessage)
    }
  }

  private fun getToIcuConverter(poTranslation: PoParsedTranslation): ToICUConverter {
    return ToICUConverter(ULocale(languageId), getMessageFormat(poTranslation), context)
  }

  private fun getMessageFormat(
    poParsedTranslation: PoParsedTranslation,
  ): SupportedFormat {
    poParsedTranslation.meta.flags.forEach {
      SupportedFormat.findByFlag(it)
        ?.let { found -> return found }
    }
    return detectedFormat
  }

  private val detectedFormat by lazy {
    val messages = parsed.translations.flatMap { poParsed ->
      if (poParsed.msgidPlural.isNotBlank() && !poParsed.msgstrPlurals.isNullOrEmpty())
        poParsed.msgstrPlurals!!.values.asSequence().map { it.toString() }
      else
        sequence {
          yield(poParsed.msgstr.toString())
        }
    }

    FormatDetector(messages.toList())()
  }
}
