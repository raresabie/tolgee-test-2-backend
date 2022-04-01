package io.tolgee.service.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJR\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2$\b\u0002\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c\u0012\u0004\u0012\u00020#\u0018\u00010!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0017J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010(\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0017J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0017J\u001a\u00101\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0016J\u0012\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020,H\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001c2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u00107\u001a\u0004\u0018\u0001002\u0006\u00108\u001a\u00020,H\u0016J\u0012\u00109\u001a\u0004\u0018\u00010:2\u0006\u00108\u001a\u00020,H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u0002000\u001c2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010<\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0016J\u0012\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020,H\u0016J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u001c2\u0006\u00108\u001a\u00020,H\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020*0\u001c2\u0006\u0010+\u001a\u00020,H\u0016J\u001e\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u00104\u001a\u00020,2\u0006\u0010E\u001a\u00020FH\u0016J\u0018\u0010G\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00020:0C2\u0006\u0010+\u001a\u00020,2\u0006\u0010I\u001a\u00020,2\u0006\u0010E\u001a\u00020FH\u0016J:\u0010J\u001a\b\u0012\u0004\u0012\u00020K0C2\u0006\u00108\u001a\u00020,2\u0006\u0010E\u001a\u00020F2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u001a\u0010)\u001a\u00020#2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010Q\u001a\u00020RH\u0017J\"\u0010)\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010Q\u001a\u00020RH\u0017J\u0010\u0010S\u001a\u00020#2\u0006\u0010/\u001a\u00020TH\u0016J\u0016\u0010U\u001a\u00020#2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020,0WH\u0016J\u0018\u0010X\u001a\u00020#2\u0006\u0010/\u001a\u0002002\u0006\u0010Y\u001a\u00020MH\u0016J\u0018\u0010Z\u001a\u00020#2\u0006\u0010[\u001a\u00020>2\u0006\u0010Y\u001a\u00020MH\u0016J\u0010\u0010\\\u001a\u00020*2\u0006\u0010)\u001a\u00020*H\u0016J\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u001cH\u0016J\u0016\u0010a\u001a\u00020#2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020d0cH\u0016J\u001e\u0010e\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010^2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002030cH\u0016J\u0016\u0010f\u001a\u00020#2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020*0cH\u0016J\u001c\u0010h\u001a\b\u0012\u0004\u0012\u0002060^2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002060cH\u0016J\u0010\u0010j\u001a\u0002032\u0006\u0010k\u001a\u000203H\u0016J\u0010\u0010l\u001a\u0002062\u0006\u0010m\u001a\u000206H\u0016J\u0016\u0010n\u001a\u00020#2\f\u0010o\u001a\b\u0012\u0004\u0012\u0002000WH\u0016J\u0016\u0010p\u001a\u00020#2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020>0\u001cH\u0016J\u001a\u0010r\u001a\u00020#2\u0006\u0010s\u001a\u0002002\b\u0010t\u001a\u0004\u0018\u00010TH\u0017J\u0010\u0010u\u001a\u0004\u0018\u00010**\u0004\u0018\u00010*H\u0012R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006v"}, d2 = {"Lio/tolgee/service/dataImport/ImportService;", "", "importRepository", "Lio/tolgee/repository/dataImport/ImportRepository;", "importFileRepository", "Lio/tolgee/repository/dataImport/ImportFileRepository;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "projectHolder", "Lio/tolgee/security/project_auth/ProjectHolder;", "importFileIssueRepository", "Lio/tolgee/repository/dataImport/issues/ImportFileIssueRepository;", "importLanguageRepository", "Lio/tolgee/repository/dataImport/ImportLanguageRepository;", "importKeyRepository", "Lio/tolgee/repository/dataImport/ImportKeyRepository;", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "importTranslationRepository", "Lio/tolgee/repository/dataImport/ImportTranslationRepository;", "importFileIssueParamRepository", "Lio/tolgee/repository/dataImport/issues/ImportFileIssueParamRepository;", "keyMetaService", "Lio/tolgee/service/KeyMetaService;", "currentDateProvider", "Lio/tolgee/component/CurrentDateProvider;", "(Lio/tolgee/repository/dataImport/ImportRepository;Lio/tolgee/repository/dataImport/ImportFileRepository;Lio/tolgee/security/AuthenticationFacade;Lio/tolgee/security/project_auth/ProjectHolder;Lio/tolgee/repository/dataImport/issues/ImportFileIssueRepository;Lio/tolgee/repository/dataImport/ImportLanguageRepository;Lio/tolgee/repository/dataImport/ImportKeyRepository;Lorg/springframework/context/ApplicationContext;Lio/tolgee/repository/dataImport/ImportTranslationRepository;Lio/tolgee/repository/dataImport/issues/ImportFileIssueParamRepository;Lio/tolgee/service/KeyMetaService;Lio/tolgee/component/CurrentDateProvider;)V", "addFiles", "", "Lio/tolgee/exceptions/ErrorResponseBody;", "files", "Lio/tolgee/dtos/dataImport/ImportFileDto;", "messageClient", "Lkotlin/Function2;", "Lio/tolgee/dtos/dataImport/ImportStreamingProgressMessageType;", "", "project", "Lio/tolgee/model/Project;", "userAccount", "Lio/tolgee/model/UserAccount;", "deleteImport", "import", "Lio/tolgee/model/dataImport/Import;", "projectId", "", "authorId", "deleteLanguage", "language", "Lio/tolgee/model/dataImport/ImportLanguage;", "find", "findFile", "Lio/tolgee/model/dataImport/ImportFile;", "fileId", "findKeys", "Lio/tolgee/model/dataImport/ImportKey;", "findLanguage", "languageId", "findLanguageView", "Lio/tolgee/model/views/ImportLanguageView;", "findLanguages", "findOrThrow", "findTranslation", "Lio/tolgee/model/dataImport/ImportTranslation;", "translationId", "findTranslations", "getAllByProject", "getFileIssues", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/ImportFileIssueView;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getNotExpired", "getResult", "userId", "getTranslationsView", "Lio/tolgee/model/views/ImportTranslationView;", "onlyConflicts", "", "onlyUnresolved", "search", "", "forceMode", "Lio/tolgee/service/dataImport/ForceMode;", "onExistingLanguageRemoved", "Lio/tolgee/model/Language;", "onExistingTranslationsRemoved", "translationIds", "", "resolveAllOfLanguage", "override", "resolveTranslationConflict", "translation", "save", "saveAllFileIssueParams", "", "Lio/tolgee/model/dataImport/issues/ImportFileIssueParam;", "params", "saveAllFileIssues", "issues", "", "Lio/tolgee/model/dataImport/issues/ImportFileIssue;", "saveAllFiles", "saveAllImports", "imports", "saveAllKeys", "keys", "saveFile", "importFile", "saveKey", "entity", "saveLanguages", "entries", "saveTranslations", "translations", "selectExistingLanguage", "importLanguage", "existingLanguage", "removeIfExpired", "data"})
@org.springframework.transaction.annotation.Transactional()
@org.springframework.stereotype.Service()
public class ImportService {
    private final io.tolgee.repository.dataImport.ImportRepository importRepository = null;
    private final io.tolgee.repository.dataImport.ImportFileRepository importFileRepository = null;
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    private final io.tolgee.security.project_auth.ProjectHolder projectHolder = null;
    private final io.tolgee.repository.dataImport.issues.ImportFileIssueRepository importFileIssueRepository = null;
    private final io.tolgee.repository.dataImport.ImportLanguageRepository importLanguageRepository = null;
    private final io.tolgee.repository.dataImport.ImportKeyRepository importKeyRepository = null;
    private final org.springframework.context.ApplicationContext applicationContext = null;
    private final io.tolgee.repository.dataImport.ImportTranslationRepository importTranslationRepository = null;
    private final io.tolgee.repository.dataImport.issues.ImportFileIssueParamRepository importFileIssueParamRepository = null;
    private final io.tolgee.service.KeyMetaService keyMetaService = null;
    private final io.tolgee.component.CurrentDateProvider currentDateProvider = null;
    
    public ImportService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.dataImport.ImportRepository importRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.dataImport.ImportFileRepository importFileRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.project_auth.ProjectHolder projectHolder, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.dataImport.issues.ImportFileIssueRepository importFileIssueRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.dataImport.ImportLanguageRepository importLanguageRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.dataImport.ImportKeyRepository importKeyRepository, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.dataImport.ImportTranslationRepository importTranslationRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.dataImport.issues.ImportFileIssueParamRepository importFileIssueParamRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.KeyMetaService keyMetaService, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.CurrentDateProvider currentDateProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public java.util.List<io.tolgee.exceptions.ErrorResponseBody> addFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.dtos.dataImport.ImportFileDto> files, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, ? super java.util.List<? extends java.lang.Object>, kotlin.Unit> messageClient, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void selectExistingLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage importLanguage, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Language existingLanguage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.Import save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.ImportFile saveFile(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportFile importFile) {
        return null;
    }
    
    /**
     * Returns import when not expired.
     * When expired import is found, it is removed
     */
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.Import getNotExpired(long projectId, long authorId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.dataImport.Import find(long projectId, long authorId) {
        return null;
    }
    
    private io.tolgee.model.dataImport.Import removeIfExpired(io.tolgee.model.dataImport.Import $this$removeIfExpired) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.Import findOrThrow(long projectId, long authorId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportLanguage> findLanguages(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportKey> findKeys(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778) {
        return null;
    }
    
    public void saveLanguages(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.dataImport.ImportLanguage> entries) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportTranslation> findTranslations(long languageId) {
        return null;
    }
    
    public void saveTranslations(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.dataImport.ImportTranslation> translations) {
    }
    
    public void onExistingLanguageRemoved(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language) {
    }
    
    public void saveAllImports(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.dataImport.Import> imports) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<io.tolgee.model.dataImport.ImportFile> saveAllFiles(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.dataImport.ImportFile> files) {
        return null;
    }
    
    public void onExistingTranslationsRemoved(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> translationIds) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.ImportLanguageView> getResult(long projectId, long userId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.dataImport.ImportLanguage findLanguage(long languageId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.views.ImportLanguageView findLanguageView(long languageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.ImportTranslationView> getTranslationsView(long languageId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, boolean onlyConflicts, boolean onlyUnresolved, @org.jetbrains.annotations.Nullable()
    java.lang.String search) {
        return null;
    }
    
    public void deleteImport(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void deleteImport(long projectId, long authorId) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void deleteLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage language) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.dataImport.ImportTranslation findTranslation(long translationId) {
        return null;
    }
    
    public void resolveTranslationConflict(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportTranslation translation, boolean override) {
    }
    
    public void resolveAllOfLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage language, boolean override) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.dataImport.ImportFile findFile(long fileId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.ImportFileIssueView> getFileIssues(long fileId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportKey> saveAllKeys(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.dataImport.ImportKey> keys) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.ImportKey saveKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportKey entity) {
        return null;
    }
    
    public void saveAllFileIssues(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.dataImport.issues.ImportFileIssue> issues) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.Import> getAllByProject(long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssueParam> saveAllFileIssueParams(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.dataImport.issues.ImportFileIssueParam> params) {
        return null;
    }
}