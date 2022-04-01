package io.tolgee.api.v2.hateoas.key

import io.swagger.v3.oas.annotations.media.Schema
import io.tolgee.api.v2.hateoas.invitation.TagModel
import io.tolgee.api.v2.hateoas.screenshot.ScreenshotModel
import io.tolgee.api.v2.hateoas.translations.TranslationModel
import org.springframework.hateoas.RepresentationModel
import org.springframework.hateoas.server.core.Relation
import java.io.Serializable

@Suppress("unused")
@Relation(collectionRelation = "keys", itemRelation = "key")
open class KeyWithDataModel(
  @Schema(description = "Id of key record")
  val id: Long,
  @Schema(description = "Name of key", example = "this_is_super_key")
  val name: String,

  @Schema(
    description = "Translations object containing values updated in this request",
    example = "{\"en\": {\"id\": 100000003, \"text\": \"This is super translation!\" }}"
  )
  val translations: Map<String, TranslationModel>,

  @Schema(description = "Tags of key")
  val tags: Set<TagModel>,

  @Schema(description = "Screenshots of the key")
  val screenshots: List<ScreenshotModel>
) : RepresentationModel<KeyWithDataModel>(), Serializable
