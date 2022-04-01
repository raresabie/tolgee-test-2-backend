package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\bH\u0017J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0017J\u0016\u0010\u0019\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0017J\u0018\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\bH\u0017J\u001a\u0010%\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\'\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lio/tolgee/service/TranslationCommentService;", "", "translationCommentRepository", "Lio/tolgee/repository/translation/TranslationCommentRepository;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "(Lio/tolgee/repository/translation/TranslationCommentRepository;Lio/tolgee/security/AuthenticationFacade;)V", "create", "Lio/tolgee/model/translation/TranslationComment;", "dto", "Lio/tolgee/dtos/request/translation/comment/ITranslationCommentDto;", "translation", "Lio/tolgee/model/translation/Translation;", "author", "Lio/tolgee/model/UserAccount;", "entity", "createAll", "", "entities", "", "delete", "deleteByIds", "ids", "", "", "deleteByTranslationIdIn", "translationIds", "find", "id", "get", "getPaged", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "setState", "state", "Lio/tolgee/model/enums/TranslationCommentState;", "update", "Lio/tolgee/dtos/request/translation/comment/TranslationCommentDto;", "updatedBy", "data"})
@org.springframework.stereotype.Service()
public class TranslationCommentService {
    private final io.tolgee.repository.translation.TranslationCommentRepository translationCommentRepository = null;
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    
    public TranslationCommentService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.translation.TranslationCommentRepository translationCommentRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.translation.TranslationComment create(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.translation.comment.ITranslationCommentDto dto, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount author) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.translation.TranslationComment find(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.TranslationComment get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.translation.TranslationComment update(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.translation.comment.TranslationCommentDto dto, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.TranslationComment entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.translation.TranslationComment setState(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.TranslationComment entity, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationCommentState state) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.translation.TranslationComment> getPaged(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void delete(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.TranslationComment entity) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void deleteByIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.TranslationComment create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.TranslationComment entity) {
        return null;
    }
    
    public void createAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.translation.TranslationComment> entities) {
    }
    
    public void deleteByTranslationIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> translationIds) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.TranslationComment update(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.TranslationComment entity, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount updatedBy) {
        return null;
    }
}