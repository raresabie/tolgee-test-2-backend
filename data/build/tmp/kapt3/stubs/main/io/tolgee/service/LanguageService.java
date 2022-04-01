package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u0017\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!H\u0017J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\'2\u0006\u0010 \u001a\u00020!H\u0017J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190)2\u0006\u0010$\u001a\u00020!H\u0016J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020!0-H\u0016J \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190)2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190)2\u0006\u00102\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u00101\u001a\b\u0012\u0004\u0012\u00020\u00190)2\b\u00102\u001a\u0004\u0018\u0001002\u0006\u0010 \u001a\u00020!H\u0016J$\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\'2\f\u00104\u001a\b\u0012\u0004\u0012\u000200052\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00190\'2\u0006\u0010 \u001a\u00020!H\u0016J&\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\'2\u000e\u00108\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\'2\u0006\u0010 \u001a\u00020!H\u0016J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00190:2\u0006\u0010 \u001a\u00020!2\u0006\u0010;\u001a\u00020<H\u0016J\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010>2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190-H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006?"}, d2 = {"Lio/tolgee/service/LanguageService;", "", "languageRepository", "Lio/tolgee/repository/LanguageRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "projectService", "Lio/tolgee/service/ProjectService;", "permissionService", "Lio/tolgee/service/PermissionService;", "(Lio/tolgee/repository/LanguageRepository;Ljavax/persistence/EntityManager;Lio/tolgee/service/ProjectService;Lio/tolgee/service/PermissionService;)V", "<set-?>", "Lio/tolgee/service/machineTranslation/MtServiceConfigService;", "mtServiceConfigService", "getMtServiceConfigService", "()Lio/tolgee/service/machineTranslation/MtServiceConfigService;", "setMtServiceConfigService", "(Lio/tolgee/service/machineTranslation/MtServiceConfigService;)V", "Lio/tolgee/service/TranslationService;", "translationService", "getTranslationService", "()Lio/tolgee/service/TranslationService;", "setTranslationService", "(Lio/tolgee/service/TranslationService;)V", "createLanguage", "Lio/tolgee/model/Language;", "dto", "Lio/tolgee/dtos/request/LanguageDto;", "project", "Lio/tolgee/model/Project;", "deleteAllByProject", "", "projectId", "", "(Ljava/lang/Long;)V", "deleteLanguage", "id", "editLanguage", "findAll", "", "findById", "Ljava/util/Optional;", "findByIdIn", "", "ids", "", "findByName", "name", "", "findByTag", "tag", "findByTags", "tags", "", "getImplicitLanguages", "getLanguagesForTranslationsView", "languages", "getPaged", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "saveAll", "", "data"})
@org.springframework.stereotype.Service()
public class LanguageService {
    private final io.tolgee.repository.LanguageRepository languageRepository = null;
    private final javax.persistence.EntityManager entityManager = null;
    private final io.tolgee.service.ProjectService projectService = null;
    private final io.tolgee.service.PermissionService permissionService = null;
    public io.tolgee.service.TranslationService translationService;
    public io.tolgee.service.machineTranslation.MtServiceConfigService mtServiceConfigService;
    
    public LanguageService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.LanguageRepository languageRepository, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService projectService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.PermissionService permissionService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.TranslationService getTranslationService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setTranslationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.machineTranslation.MtServiceConfigService getMtServiceConfigService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setMtServiceConfigService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.machineTranslation.MtServiceConfigService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Language createLanguage(@org.jetbrains.annotations.Nullable()
    io.tolgee.dtos.request.LanguageDto dto, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void deleteLanguage(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Language editLanguage(long id, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.LanguageDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.Language> getImplicitLanguages(long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public java.util.Set<io.tolgee.model.Language> findAll(long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.Language> findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.Language> findByTag(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.Language> findByTag(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.Language> findByTags(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> tags, long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.Language> getLanguagesForTranslationsView(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> languages, long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.Language> findByName(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    public void deleteAllByProject(@org.jetbrains.annotations.Nullable()
    java.lang.Long projectId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<io.tolgee.model.Language> saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.Language> languages) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.Language> getPaged(long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.Language> findByIdIn(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> ids) {
        return null;
    }
}