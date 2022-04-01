package io.tolgee.service

import io.tolgee.dtos.request.translation.comment.ITranslationCommentDto
import io.tolgee.dtos.request.translation.comment.TranslationCommentDto
import io.tolgee.exceptions.NotFoundException
import io.tolgee.model.UserAccount
import io.tolgee.model.enums.TranslationCommentState
import io.tolgee.model.translation.Translation
import io.tolgee.model.translation.TranslationComment
import io.tolgee.repository.translation.TranslationCommentRepository
import io.tolgee.security.AuthenticationFacade
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TranslationCommentService(
  private val translationCommentRepository: TranslationCommentRepository,
  private val authenticationFacade: AuthenticationFacade
) {
  @Transactional
  fun create(
    dto: ITranslationCommentDto,
    translation: Translation,
    author: UserAccount
  ): TranslationComment {
    return TranslationComment(
      text = dto.text,
      state = dto.state,
      translation = translation
    ).let {
      it.author = author
      create(it)
    }
  }

  fun find(id: Long): TranslationComment? {
    return translationCommentRepository.findById(id).orElse(null)
  }

  fun get(id: Long): TranslationComment {
    return find(id) ?: throw NotFoundException()
  }

  @Transactional
  fun update(dto: TranslationCommentDto, entity: TranslationComment): TranslationComment {
    entity.text = dto.text
    entity.state = dto.state
    return this.update(entity)
  }

  @Transactional
  fun setState(entity: TranslationComment, state: TranslationCommentState): TranslationComment {
    entity.state = state
    return this.update(entity)
  }

  fun getPaged(translation: Translation, pageable: Pageable): Page<TranslationComment> {
    return translationCommentRepository.getPagedByTranslation(translation, pageable)
  }

  @Transactional
  fun delete(entity: TranslationComment) {
    deleteByIds(listOf(entity.id))
  }

  @Transactional
  fun deleteByIds(ids: List<Long>) {
    return translationCommentRepository.deleteAllByIdIn(ids)
  }

  fun create(entity: TranslationComment): TranslationComment {
    return translationCommentRepository.save(entity)
  }

  fun createAll(entities: Collection<TranslationComment>) {
    translationCommentRepository.saveAll(entities)
  }

  fun deleteByTranslationIdIn(translationIds: Collection<Long>) {
    translationCommentRepository.deleteAllByTranslationIdIn(translationIds)
  }

  fun update(
    entity: TranslationComment,
    updatedBy: UserAccount = authenticationFacade.userAccountEntity
  ): TranslationComment {
    return translationCommentRepository.save(entity)
  }
}
