package io.tolgee.component.machineTranslation.providers

import com.google.cloud.translate.Translate
import io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
class GoogleTranslationProvider(
  private val googleMachineTranslationProperties: GoogleMachineTranslationProperties,
  private val translate: Translate?
) : AbstractMtValueProvider() {
  override val isEnabled: Boolean
    get() = !googleMachineTranslationProperties.apiKey.isNullOrEmpty()

  override fun translateViaProvider(text: String, sourceTag: String, targetTag: String): String? {
    return translateService.translate(
      text,
      Translate.TranslateOption.sourceLanguage(sourceTag),
      Translate.TranslateOption.targetLanguage(targetTag),
      Translate.TranslateOption.format("text")
    ).translatedText
  }

  override fun calculateProviderPrice(text: String): Int {
    return text.length * 100
  }

  private val translateService by lazy {
    translate ?: throw IllegalStateException("Google Translate is not injected")
  }

  override val supportedLanguages = arrayOf(
    "af",
    "sq",
    "am",
    "ar",
    "hy",
    "az",
    "eu",
    "be",
    "bn",
    "bs",
    "bg",
    "ca",
    "ceb",
    "ny",
    "zh-CN",
    "zh-TW",
    "co",
    "hr",
    "cs",
    "da",
    "nl",
    "en",
    "eo",
    "et",
    "tl",
    "fi",
    "fr",
    "fy",
    "gl",
    "ka",
    "de",
    "el",
    "gu",
    "ht",
    "ha",
    "haw",
    "iw",
    "hi",
    "hmn",
    "hu",
    "is",
    "ig",
    "id",
    "ga",
    "it",
    "ja",
    "jw",
    "kn",
    "kk",
    "km",
    "rw",
    "ko",
    "ku",
    "ky",
    "lo",
    "la",
    "lv",
    "lt",
    "lb",
    "mk",
    "mg",
    "ms",
    "ml",
    "mt",
    "mi",
    "mr",
    "mn",
    "my",
    "ne",
    "no",
    "or",
    "ps",
    "fa",
    "pl",
    "pt",
    "pa",
    "ro",
    "ru",
    "sm",
    "gd",
    "sr",
    "st",
    "sn",
    "sd",
    "si",
    "sk",
    "sl",
    "so",
    "es",
    "su",
    "sw",
    "sv",
    "tg",
    "ta",
    "tt",
    "te",
    "th",
    "tr",
    "tk",
    "uk",
    "ur",
    "ug",
    "uz",
    "vi",
    "cy",
    "xh",
    "yi",
    "yo",
    "zu",
    "he",
    "zh"
  )
}
