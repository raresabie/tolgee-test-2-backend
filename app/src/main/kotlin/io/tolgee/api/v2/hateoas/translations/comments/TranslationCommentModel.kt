package io.tolgee.api.v2.hateoas.translations.comments

import io.swagger.v3.oas.annotations.media.Schema
import io.tolgee.api.v2.hateoas.user_account.UserAccountModel
import io.tolgee.model.enums.TranslationCommentState
import org.springframework.hateoas.RepresentationModel
import org.springframework.hateoas.server.core.Relation
import java.util.*

@Suppress("unused")
@Relation(collectionRelation = "translationComments", itemRelation = "translationComment")
open class TranslationCommentModel(
  @Schema(description = "Id of translation comment record")
  val id: Long,

  @Schema(description = "Text of comment")
  val text: String,

  @Schema(description = "State of translation")
  val state: TranslationCommentState,

  @Schema(description = "User who created the comment")
  val author: UserAccountModel,

  @Schema(description = "Date when it was created")
  val createdAt: Date,

  @Schema(description = "Date when it was updated")
  val updatedAt: Date,
) : RepresentationModel<TranslationCommentModel>()
