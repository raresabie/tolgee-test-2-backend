package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J&\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010\u00010+H\u0012J\u0010\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020/H\u0016J\u0016\u00100\u001a\u00020\'2\f\u00101\u001a\b\u0012\u0004\u0012\u00020/02H\u0016J\u0010\u00103\u001a\u00020\'2\u0006\u00104\u001a\u00020/H\u0016J\u0010\u00105\u001a\u00020\'2\u0006\u00106\u001a\u00020/H\u0016J\u0016\u00107\u001a\u00020\'2\f\u00101\u001a\b\u0012\u0004\u0012\u00020/02H\u0016J\u0018\u00108\u001a\u00020\'2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020,H\u0016J\u0010\u0010<\u001a\u00020\'2\u0006\u0010(\u001a\u00020=H\u0017J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00020=0?2\u0006\u00109\u001a\u00020:2\u0006\u0010@\u001a\u00020AH\u0016J\u0012\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010=2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010C\u001a\u00020=2\u0006\u0010.\u001a\u00020/H\u0016J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020=0E2\u0006\u00104\u001a\u00020/H\u0016J\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020H0G2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020KH\u0017J.\u0010L\u001a\b\u0012\u0004\u0012\u00020=0M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020A0M2\u0006\u0010O\u001a\u00020P2\b\u00109\u001a\u0004\u0018\u00010:H\u0012J8\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010,0R2\u0006\u00106\u001a\u00020/2\b\u0010S\u001a\u0004\u0018\u00010T2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010MH\u0016J\u0018\u0010V\u001a\u00020=2\u0006\u00109\u001a\u00020:2\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010V\u001a\u00020=2\u0006\u0010W\u001a\u00020/2\u0006\u00104\u001a\u00020/H\u0016J,\u0010X\u001a\b\u0012\u0004\u0012\u00020/0E2\u0006\u00106\u001a\u00020/2\u0006\u0010Y\u001a\u00020Z2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020A0MH\u0016J&\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0G2\u0006\u00109\u001a\u00020:2\u0006\u0010]\u001a\u00020A2\u0006\u0010J\u001a\u00020KH\u0016J0\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0G2\u0006\u0010^\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010]\u001a\u00020A2\u0006\u0010J\u001a\u00020KH\u0016J\u001a\u0010_\u001a\u0004\u0018\u00010\\2\u0006\u00109\u001a\u00020:2\u0006\u0010]\u001a\u00020AH\u0016J*\u0010`\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00010R2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020,0M2\u0006\u00106\u001a\u00020/H\u0017J4\u0010a\u001a\b\u0012\u0004\u0012\u00020b0G2\u0006\u00106\u001a\u00020/2\u0006\u0010J\u001a\u00020K2\u0006\u0010Y\u001a\u00020c2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020A0MH\u0016JS\u0010d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0f\u0012\u0004\u0012\u00020h0e2\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010M2\b\u00106\u001a\u0004\u0018\u00010/2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020j2\b\u0010l\u001a\u0004\u0018\u00010,H\u0017\u00a2\u0006\u0002\u0010mJ\u0010\u0010n\u001a\u00020=2\u0006\u0010(\u001a\u00020=H\u0016J\u0016\u0010o\u001a\u00020\'2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020=0qH\u0016J2\u0010r\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020=0R2\u0006\u00109\u001a\u00020:2\u0014\u0010s\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010,0RH\u0017J\u0018\u0010t\u001a\u00020=2\u0006\u0010(\u001a\u00020=2\u0006\u0010u\u001a\u00020vH\u0016J\"\u0010w\u001a\u00020=2\u0006\u00109\u001a\u00020:2\u0006\u0010@\u001a\u00020A2\b\u0010x\u001a\u0004\u0018\u00010,H\u0016J$\u0010w\u001a\u00020=2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010,2\b\u0010x\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010y\u001a\u0004\u0018\u00010=2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020,H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001a@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020 @WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006z"}, d2 = {"Lio/tolgee/service/TranslationService;", "", "translationRepository", "Lio/tolgee/repository/TranslationRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "importService", "Lio/tolgee/service/dataImport/ImportService;", "translationsSocketIoModule", "Lio/tolgee/socketio/ITranslationsSocketIoModule;", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "translationCommentService", "Lio/tolgee/service/TranslationCommentService;", "applicationEventPublisher", "Lorg/springframework/context/ApplicationEventPublisher;", "(Lio/tolgee/repository/TranslationRepository;Ljavax/persistence/EntityManager;Lio/tolgee/service/dataImport/ImportService;Lio/tolgee/socketio/ITranslationsSocketIoModule;Lorg/springframework/context/ApplicationContext;Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/service/TranslationCommentService;Lorg/springframework/context/ApplicationEventPublisher;)V", "<set-?>", "Lio/tolgee/service/KeyService;", "keyService", "getKeyService", "()Lio/tolgee/service/KeyService;", "setKeyService", "(Lio/tolgee/service/KeyService;)V", "Lio/tolgee/service/LanguageService;", "languageService", "getLanguageService", "()Lio/tolgee/service/LanguageService;", "setLanguageService", "(Lio/tolgee/service/LanguageService;)V", "Lio/tolgee/service/ProjectService;", "projectService", "getProjectService", "()Lio/tolgee/service/ProjectService;", "setProjectService", "(Lio/tolgee/service/ProjectService;)V", "addToMap", "", "translation", "Lio/tolgee/model/views/SimpleTranslationView;", "map", "", "", "deleteAllByKey", "id", "", "deleteAllByKeys", "ids", "", "deleteAllByLanguage", "languageId", "deleteAllByProject", "projectId", "deleteByIdIn", "deleteIfExists", "key", "Lio/tolgee/model/key/Key;", "languageTag", "dismissAutoTranslated", "Lio/tolgee/model/translation/Translation;", "find", "Ljava/util/Optional;", "language", "Lio/tolgee/model/Language;", "findBaseTranslation", "get", "getAllByLanguageId", "", "getHistory", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/dtos/query_results/TranslationHistoryView;", "translationId", "pageable", "Lorg/springframework/data/domain/Pageable;", "getKeyTranslations", "", "languages", "project", "Lio/tolgee/model/Project;", "getKeyTranslationsResult", "", "path", "Lio/tolgee/dtos/PathDTO;", "languageTags", "getOrCreate", "keyId", "getSelectAllKeys", "params", "Lio/tolgee/dtos/request/translation/TranslationFilters;", "getTranslationMemorySuggestions", "Lio/tolgee/model/views/TranslationMemoryItemView;", "targetLanguage", "baseTranslationText", "getTranslationMemoryValue", "getTranslations", "getViewData", "Lio/tolgee/model/views/KeyWithTranslationsView;", "Lio/tolgee/dtos/request/translation/GetTranslationsParams;", "getViewDataOld", "Lio/tolgee/dtos/response/ViewDataResponse;", "Ljava/util/LinkedHashSet;", "Lio/tolgee/dtos/response/KeyWithTranslationsResponseDto;", "Lio/tolgee/dtos/response/translations_view/ResponseParams;", "limit", "", "offset", "search", "(Ljava/util/Set;Ljava/lang/Long;IILjava/lang/String;)Lio/tolgee/dtos/response/ViewDataResponse;", "save", "saveAll", "entities", "", "setForKey", "translations", "setState", "state", "Lio/tolgee/model/enums/TranslationState;", "setTranslation", "text", "setUntranslatedStateIfExists", "data"})
@org.springframework.transaction.annotation.Transactional()
@org.springframework.stereotype.Service()
public class TranslationService {
    private final io.tolgee.repository.TranslationRepository translationRepository = null;
    private final javax.persistence.EntityManager entityManager = null;
    private final io.tolgee.service.dataImport.ImportService importService = null;
    private final io.tolgee.socketio.ITranslationsSocketIoModule translationsSocketIoModule = null;
    private final org.springframework.context.ApplicationContext applicationContext = null;
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final io.tolgee.service.TranslationCommentService translationCommentService = null;
    private final org.springframework.context.ApplicationEventPublisher applicationEventPublisher = null;
    public io.tolgee.service.LanguageService languageService;
    public io.tolgee.service.KeyService keyService;
    public io.tolgee.service.ProjectService projectService;
    
    public TranslationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.TranslationRepository translationRepository, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.ImportService importService, @org.jetbrains.annotations.NotNull()
    io.tolgee.socketio.ITranslationsSocketIoModule translationsSocketIoModule, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationCommentService translationCommentService, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.LanguageService getLanguageService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setLanguageService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.LanguageService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.KeyService getKeyService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setKeyService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.KeyService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.ProjectService getProjectService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setProjectService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @org.springframework.transaction.annotation.Transactional()
    public java.util.Map<java.lang.String, java.lang.Object> getTranslations(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> languageTags, long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.translation.Translation> getAllByLanguageId(long languageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.String, java.lang.String> getKeyTranslationsResult(long projectId, @org.jetbrains.annotations.Nullable()
    io.tolgee.dtos.PathDTO path, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> languageTags) {
        return null;
    }
    
    private java.util.Set<io.tolgee.model.translation.Translation> getKeyTranslations(java.util.Set<? extends io.tolgee.model.Language> languages, io.tolgee.model.Project project, io.tolgee.model.key.Key key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation getOrCreate(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation getOrCreate(long keyId, long languageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.translation.Translation> find(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.translation.Translation find(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    public io.tolgee.dtos.response.ViewDataResponse<java.util.LinkedHashSet<io.tolgee.dtos.response.KeyWithTranslationsResponseDto>, io.tolgee.dtos.response.translations_view.ResponseParams> getViewDataOld(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> languageTags, @org.jetbrains.annotations.Nullable()
    java.lang.Long projectId, int limit, int offset, @org.jetbrains.annotations.Nullable()
    java.lang.String search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.KeyWithTranslationsView> getViewData(long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.translation.GetTranslationsParams params, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.Language> languages) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.Long> getSelectAllKeys(long projectId, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.translation.TranslationFilters params, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.Language> languages) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation setTranslation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.Nullable()
    java.lang.String languageTag, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation setTranslation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public java.util.Map<java.lang.String, io.tolgee.model.translation.Translation> setForKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> translations) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public org.springframework.data.domain.Page<io.tolgee.dtos.query_results.TranslationHistoryView> getHistory(long translationId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    public void deleteIfExists(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.lang.String languageTag) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.translation.Translation setUntranslatedStateIfExists(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.lang.String languageTag) {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private void addToMap(io.tolgee.model.views.SimpleTranslationView translation, java.util.Map<java.lang.String, java.lang.Object> map) {
    }
    
    public void deleteByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids) {
    }
    
    public void deleteAllByProject(long projectId) {
    }
    
    public void deleteAllByLanguage(long languageId) {
    }
    
    public void deleteAllByKeys(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids) {
    }
    
    public void deleteAllByKey(long id) {
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.translation.Translation> entities) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation setState(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationState state) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.translation.Translation findBaseTranslation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.views.TranslationMemoryItemView getTranslationMemoryValue(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.TranslationMemoryItemView> getTranslationMemorySuggestions(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.TranslationMemoryItemView> getTranslationMemorySuggestions(@org.jetbrains.annotations.NotNull()
    java.lang.String baseTranslationText, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void dismissAutoTranslated(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation) {
    }
}