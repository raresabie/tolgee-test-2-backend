package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020L0K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020N0KH\u0016J\u001c\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010TH\u0017J\u0010\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0017J\u0010\u0010Y\u001a\u00020V2\u0006\u0010Z\u001a\u00020[H\u0017J\u0018\u0010\\\u001a\u00020P2\u0006\u0010Z\u001a\u00020[2\u0006\u0010Q\u001a\u00020]H\u0017J\u0012\u0010^\u001a\u0004\u0018\u00010P2\u0006\u0010Z\u001a\u00020[H\u0016J\u001e\u0010_\u001a\b\u0012\u0004\u0012\u00020P0`2\u0006\u0010W\u001a\u00020X2\u0006\u0010a\u001a\u00020TH\u0016J\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00020P0`2\u0006\u0010c\u001a\u00020[H\u0016J(\u0010b\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010c\u001a\u00020[2\u0006\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010XH\u0016J\u0016\u0010g\u001a\b\u0012\u0004\u0012\u00020h0`2\u0006\u0010S\u001a\u00020TH\u0016J\u0012\u0010i\u001a\u0004\u0018\u00010j2\u0006\u0010Z\u001a\u00020[H\u0017J \u0010k\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010XH\u0016J\u001c\u0010l\u001a\u00020X2\u0006\u0010W\u001a\u00020X2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010XH\u0016J\u0010\u0010n\u001a\u00020P2\u0006\u0010Z\u001a\u00020[H\u0016J\u001e\u0010o\u001a\u00020p2\u0006\u0010Q\u001a\u00020R2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020p0`H\u0012J\u0012\u0010o\u001a\u0004\u0018\u00010p2\u0006\u0010r\u001a\u00020[H\u0017J\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020t0`2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020[0vH\u0016J\u001c\u0010w\u001a\b\u0012\u0004\u0012\u00020P0`2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020[0vH\u0016J\u0010\u0010x\u001a\u00020L2\u0006\u0010Z\u001a\u00020[H\u0017J\u0010\u0010y\u001a\u00020P2\u0006\u0010z\u001a\u00020PH\u0016J\u0010\u0010{\u001a\u00020V2\u0006\u0010z\u001a\u00020PH\u0017J\u0010\u0010|\u001a\u00020P2\u0006\u0010z\u001a\u00020PH\u0017J\u001d\u0010}\u001a\b\u0012\u0004\u0012\u00020P0~2\r\u0010\u007f\u001a\t\u0012\u0004\u0012\u00020P0\u0080\u0001H\u0017J\u001b\u0010\u0081\u0001\u001a\u00020V2\u0006\u0010z\u001a\u00020P2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0017J\u0019\u0010\u0084\u0001\u001a\u00020V2\u0006\u0010r\u001a\u00020[2\u0006\u0010c\u001a\u00020[H\u0017J\u001a\u0010\u0085\u0001\u001a\u00020V2\u0006\u0010r\u001a\u00020[2\u0007\u0010\u0086\u0001\u001a\u00020[H\u0017J\u0013\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020XH\u0016R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001a@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020 @WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020&@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020,@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u00103\u001a\u0002022\u0006\u0010\u0013\u001a\u000202@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u0002082\u0006\u0010\u0013\u001a\u000208@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010?\u001a\u00020>2\u0006\u0010\u0013\u001a\u00020>@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010E\u001a\u00020D2\u0006\u0010\u0013\u001a\u00020D@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008a\u0001"}, d2 = {"Lio/tolgee/service/ProjectService;", "", "projectRepository", "Lio/tolgee/repository/ProjectRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "screenshotService", "Lio/tolgee/service/ScreenshotService;", "organizationRoleService", "Lio/tolgee/service/OrganizationRoleService;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "slugGenerator", "Lio/tolgee/util/SlugGenerator;", "userAccountService", "Lio/tolgee/service/UserAccountService;", "avatarService", "Lio/tolgee/service/AvatarService;", "(Lio/tolgee/repository/ProjectRepository;Ljavax/persistence/EntityManager;Lio/tolgee/service/ScreenshotService;Lio/tolgee/service/OrganizationRoleService;Lio/tolgee/security/AuthenticationFacade;Lio/tolgee/util/SlugGenerator;Lio/tolgee/service/UserAccountService;Lio/tolgee/service/AvatarService;)V", "<set-?>", "Lio/tolgee/service/ApiKeyService;", "apiKeyService", "getApiKeyService", "()Lio/tolgee/service/ApiKeyService;", "setApiKeyService", "(Lio/tolgee/service/ApiKeyService;)V", "Lio/tolgee/service/dataImport/ImportService;", "importService", "getImportService", "()Lio/tolgee/service/dataImport/ImportService;", "setImportService", "(Lio/tolgee/service/dataImport/ImportService;)V", "Lio/tolgee/service/KeyService;", "keyService", "getKeyService", "()Lio/tolgee/service/KeyService;", "setKeyService", "(Lio/tolgee/service/KeyService;)V", "Lio/tolgee/service/LanguageService;", "languageService", "getLanguageService", "()Lio/tolgee/service/LanguageService;", "setLanguageService", "(Lio/tolgee/service/LanguageService;)V", "Lio/tolgee/service/machineTranslation/MtServiceConfigService;", "mtServiceConfigService", "getMtServiceConfigService", "()Lio/tolgee/service/machineTranslation/MtServiceConfigService;", "setMtServiceConfigService", "(Lio/tolgee/service/machineTranslation/MtServiceConfigService;)V", "Lio/tolgee/service/OrganizationService;", "organizationService", "getOrganizationService", "()Lio/tolgee/service/OrganizationService;", "setOrganizationService", "(Lio/tolgee/service/OrganizationService;)V", "Lio/tolgee/service/PermissionService;", "permissionService", "getPermissionService", "()Lio/tolgee/service/PermissionService;", "setPermissionService", "(Lio/tolgee/service/PermissionService;)V", "Lio/tolgee/service/SecurityService;", "securityService", "getSecurityService", "()Lio/tolgee/service/SecurityService;", "setSecurityService", "(Lio/tolgee/service/SecurityService;)V", "Lio/tolgee/service/TranslationService;", "translationService", "getTranslationService", "()Lio/tolgee/service/TranslationService;", "setTranslationService", "(Lio/tolgee/service/TranslationService;)V", "addPermittedLanguagesToProjects", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/ProjectWithLanguagesView;", "projectsPage", "Lio/tolgee/model/views/ProjectView;", "createProject", "Lio/tolgee/model/Project;", "dto", "Lio/tolgee/dtos/request/project/CreateProjectDTO;", "userAccount", "Lio/tolgee/model/UserAccount;", "deleteAllByName", "", "name", "", "deleteProject", "id", "", "editProject", "Lio/tolgee/dtos/request/project/EditProjectDTO;", "find", "findAllByNameAndUserOwner", "", "userOwner", "findAllInOrganization", "organizationId", "pageable", "Lorg/springframework/data/domain/Pageable;", "search", "findAllPermitted", "Lio/tolgee/dtos/response/ProjectDTO;", "findDto", "Lio/tolgee/dtos/cacheable/ProjectDto;", "findPermittedPaged", "generateSlug", "oldSlug", "get", "getOrCreateBaseLanguage", "Lio/tolgee/model/Language;", "createdLanguages", "projectId", "getProjectsStatistics", "Lio/tolgee/dtos/query_results/ProjectStatistics;", "projectIds", "", "getProjectsWithFetchedLanguages", "getView", "refresh", "project", "removeAvatar", "save", "saveAll", "", "projects", "", "setAvatar", "avatar", "Ljava/io/InputStream;", "transferToOrganization", "transferToUser", "userId", "validateSlugUniqueness", "", "slug", "data"})
@org.springframework.stereotype.Service()
@org.springframework.transaction.annotation.Transactional()
public class ProjectService {
    private final io.tolgee.repository.ProjectRepository projectRepository = null;
    private final javax.persistence.EntityManager entityManager = null;
    private final io.tolgee.service.ScreenshotService screenshotService = null;
    private final io.tolgee.service.OrganizationRoleService organizationRoleService = null;
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    private final io.tolgee.util.SlugGenerator slugGenerator = null;
    private final io.tolgee.service.UserAccountService userAccountService = null;
    private final io.tolgee.service.AvatarService avatarService = null;
    public io.tolgee.service.KeyService keyService;
    public io.tolgee.service.OrganizationService organizationService;
    public io.tolgee.service.LanguageService languageService;
    public io.tolgee.service.TranslationService translationService;
    public io.tolgee.service.dataImport.ImportService importService;
    public io.tolgee.service.machineTranslation.MtServiceConfigService mtServiceConfigService;
    public io.tolgee.service.SecurityService securityService;
    public io.tolgee.service.PermissionService permissionService;
    public io.tolgee.service.ApiKeyService apiKeyService;
    
    public ProjectService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.ProjectRepository projectRepository, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ScreenshotService screenshotService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.OrganizationRoleService organizationRoleService, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade, @org.jetbrains.annotations.NotNull()
    io.tolgee.util.SlugGenerator slugGenerator, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.UserAccountService userAccountService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.AvatarService avatarService) {
        super();
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
    public io.tolgee.service.OrganizationService getOrganizationService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setOrganizationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.OrganizationService p0) {
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
    public io.tolgee.service.TranslationService getTranslationService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setTranslationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.dataImport.ImportService getImportService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setImportService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.ImportService p0) {
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
    public io.tolgee.service.SecurityService getSecurityService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setSecurityService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.SecurityService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.PermissionService getPermissionService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setPermissionService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.PermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.ApiKeyService getApiKeyService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setApiKeyService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.ApiKeyService p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.cache.annotation.Cacheable(cacheNames = {"projects"}, key = "#id")
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.dtos.cacheable.ProjectDto findDto(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Project find(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.views.ProjectWithLanguagesView getView(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#result.id")
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Project createProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.project.CreateProjectDTO dto, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#result.id")
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Project editProject(long id, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.project.EditProjectDTO dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.dtos.response.ProjectDTO> findAllPermitted(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.Project> findAllInOrganization(long organizationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.ProjectWithLanguagesView> findAllInOrganization(long organizationId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    java.lang.String search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.ProjectWithLanguagesView> addPermittedLanguagesToProjects(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Page<io.tolgee.model.views.ProjectView> projectsPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.dtos.query_results.ProjectStatistics> getProjectsStatistics(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> projectIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.Project> getProjectsWithFetchedLanguages(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> projectIds) {
        return null;
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#id")
    @org.springframework.transaction.annotation.Transactional()
    public void deleteProject(long id) {
    }
    
    /**
     * If base language is missing on project it selects language with lowest id
     * It saves updated project and returns project's new baseLanguage
     */
    @org.jetbrains.annotations.Nullable()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#projectId")
    public io.tolgee.model.Language getOrCreateBaseLanguage(long projectId) {
        return null;
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, allEntries = true)
    public void deleteAllByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#project.id")
    @org.springframework.transaction.annotation.Transactional()
    public void removeAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#project.id")
    @org.springframework.transaction.annotation.Transactional()
    public void setAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.io.InputStream avatar) {
    }
    
    public boolean validateSlugUniqueness(@org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String generateSlug(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String oldSlug) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.ProjectWithLanguagesView> findPermittedPaged(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    java.lang.String search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, allEntries = true)
    public java.util.List<io.tolgee.model.Project> saveAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.Project> projects) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#result.id")
    public io.tolgee.model.Project save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project refresh(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    private io.tolgee.model.Language getOrCreateBaseLanguage(io.tolgee.dtos.request.project.CreateProjectDTO dto, java.util.List<? extends io.tolgee.model.Language> createdLanguages) {
        return null;
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#projectId")
    public void transferToOrganization(long projectId, long organizationId) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projects"}, key = "#projectId")
    public void transferToUser(long projectId, long userId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.Project> findAllByNameAndUserOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userOwner) {
        return null;
    }
}