package io.tolgee.api.v2.hateoas.translations

import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.hateoas.RepresentationModel
import org.springframework.hateoas.server.core.Relation

@Suppress("unused")
@Relation(collectionRelation = "keys", itemRelation = "key")
open class SetTranslationsResponseModel(
  @Schema(description = "Id of key record")
  val keyId: Long,

  @Schema(description = "Name of key", example = "this_is_super_key")
  val keyName: String,

  @Schema(
    description = "Translations object containing values updated in this request",
    example = "{\"en\": {\"id\": 100000003, \"text\": \"This is super translation!\" }}"
  )
  val translations: Map<String, TranslationModel>
) : RepresentationModel<SetTranslationsResponseModel>()
