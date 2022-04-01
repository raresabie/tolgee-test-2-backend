package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u001e\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020)H\u0016J,\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\b\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001e\u0010.\u001a\u00020$2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000&2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0016J\u001e\u00101\u001a\u00020$2\u0006\u0010 \u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00020!05H\u0016J\u0018\u00106\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u00107\u001a\u00020\u001fH\u0016J\u001c\u00108\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!H\u0012J\u001a\u00109\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010\"\u001a\u00020!H\u0017R\u0014\u0010\u0007\u001a\u00020\b8RX\u0092\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006:"}, d2 = {"Lio/tolgee/service/SecurityService;", "", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "languageService", "Lio/tolgee/service/LanguageService;", "(Lio/tolgee/security/AuthenticationFacade;Lio/tolgee/service/LanguageService;)V", "activeUser", "Lio/tolgee/dtos/cacheable/UserAccountDto;", "getActiveUser", "()Lio/tolgee/dtos/cacheable/UserAccountDto;", "<set-?>", "Lio/tolgee/service/ApiKeyService;", "apiKeyService", "getApiKeyService", "()Lio/tolgee/service/ApiKeyService;", "setApiKeyService", "(Lio/tolgee/service/ApiKeyService;)V", "Lio/tolgee/service/PermissionService;", "permissionService", "getPermissionService", "()Lio/tolgee/service/PermissionService;", "setPermissionService", "(Lio/tolgee/service/PermissionService;)V", "Lio/tolgee/service/UserAccountService;", "userAccountService", "getUserAccountService", "()Lio/tolgee/service/UserAccountService;", "setUserAccountService", "(Lio/tolgee/service/UserAccountService;)V", "checkAnyProjectPermission", "Lio/tolgee/model/Permission$ProjectPermissionType;", "projectId", "", "userId", "checkApiKeyScopes", "", "scopes", "", "Lio/tolgee/model/enums/ApiScope;", "apiKey", "Lio/tolgee/model/ApiKey;", "project", "Lio/tolgee/model/Project;", "user", "Lio/tolgee/model/UserAccount;", "checkLanguageTagPermissions", "tags", "", "checkLanguageTranslatePermission", "translation", "Lio/tolgee/model/translation/Translation;", "languageIds", "", "checkProjectPermission", "requiredPermission", "getProjectPermission", "grantFullAccessToRepo", "data"})
@org.springframework.stereotype.Service()
public class SecurityService {
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    private final io.tolgee.service.LanguageService languageService = null;
    public io.tolgee.service.ApiKeyService apiKeyService;
    public io.tolgee.service.PermissionService permissionService;
    public io.tolgee.service.UserAccountService userAccountService;
    
    @org.springframework.beans.factory.annotation.Autowired()
    public SecurityService(@org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.LanguageService languageService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.ApiKeyService getApiKeyService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public void setApiKeyService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.ApiKeyService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.PermissionService getPermissionService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public void setPermissionService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.PermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.UserAccountService getUserAccountService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public void setUserAccountService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.UserAccountService p0) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void grantFullAccessToRepo(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, long userId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission.ProjectPermissionType checkAnyProjectPermission(long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission.ProjectPermissionType checkAnyProjectPermission(long projectId, long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission.ProjectPermissionType checkProjectPermission(long projectId, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType requiredPermission) {
        return null;
    }
    
    public void checkLanguageTranslatePermission(long projectId, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> languageIds) {
    }
    
    public void checkLanguageTranslatePermission(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation) {
    }
    
    public void checkLanguageTagPermissions(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> tags, long projectId) {
    }
    
    public void checkApiKeyScopes(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Project project, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount user) {
    }
    
    public void checkApiKeyScopes(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.ApiKey apiKey) {
    }
    
    private io.tolgee.model.Permission.ProjectPermissionType getProjectPermission(long projectId, long userId) {
        return null;
    }
    
    private io.tolgee.dtos.cacheable.UserAccountDto getActiveUser() {
        return null;
    }
}