package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/service/TranslationMemoryService;", "", "translationsService", "Lio/tolgee/service/TranslationService;", "(Lio/tolgee/service/TranslationService;)V", "getAutoTranslatedValue", "Lio/tolgee/model/views/TranslationMemoryItemView;", "key", "Lio/tolgee/model/key/Key;", "targetLanguage", "Lio/tolgee/model/Language;", "suggest", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "baseTranslationText", "", "data"})
@org.springframework.stereotype.Service()
public class TranslationMemoryService {
    private final io.tolgee.service.TranslationService translationsService = null;
    
    public TranslationMemoryService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationService translationsService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.views.TranslationMemoryItemView getAutoTranslatedValue(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.TranslationMemoryItemView> suggest(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.TranslationMemoryItemView> suggest(@org.jetbrains.annotations.NotNull()
    java.lang.String baseTranslationText, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
}