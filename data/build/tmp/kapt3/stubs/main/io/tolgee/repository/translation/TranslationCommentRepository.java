package io.tolgee.repository.translation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/repository/translation/TranslationCommentRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/translation/TranslationComment;", "", "deleteAllByIdIn", "", "ids", "", "deleteAllByTranslationIdIn", "translationIds", "", "getPagedByTranslation", "Lorg/springframework/data/domain/Page;", "translation", "Lio/tolgee/model/translation/Translation;", "pageable", "Lorg/springframework/data/domain/Pageable;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface TranslationCommentRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.translation.TranslationComment, java.lang.Long> {
    
    public abstract void deleteAllByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select tc from TranslationComment tc where tc.translation = :translation")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.translation.TranslationComment> getPagedByTranslation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    public abstract void deleteAllByTranslationIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> translationIds);
}