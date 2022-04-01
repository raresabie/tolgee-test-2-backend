package io.tolgee.events

import io.tolgee.model.Project
import org.springframework.context.ApplicationEvent

open class MachineTranslationEvent(
  source: Any,
  /**
   * The text which is going to be translated
   */
  val textToTranslate: String,
  /**
   * The project containing translation
   */
  val project: Project,
  /**
   * The total price of translation in credits, which was expected
   */
  val expectedSumPrice: Int
) : ApplicationEvent(source)
