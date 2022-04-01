package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010#\u001a\u00020\u001aH\u0016J-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020!H\u0016\u00a2\u0006\u0002\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\'2\u0006\u0010(\u001a\u00020\u001aH\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\'2\u0006\u0010\u001c\u001a\u00020)H\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u000fH\u0016J\u0016\u0010-\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0/H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lio/tolgee/service/ApiKeyService;", "", "apiKeyRepository", "Lio/tolgee/repository/ApiKeyRepository;", "random", "Ljava/security/SecureRandom;", "(Lio/tolgee/repository/ApiKeyRepository;Ljava/security/SecureRandom;)V", "<set-?>", "Lio/tolgee/service/PermissionService;", "permissionService", "getPermissionService", "()Lio/tolgee/service/PermissionService;", "setPermissionService", "(Lio/tolgee/service/PermissionService;)V", "create", "Lio/tolgee/model/ApiKey;", "userAccount", "Lio/tolgee/model/UserAccount;", "scopes", "", "Lio/tolgee/model/enums/ApiScope;", "project", "Lio/tolgee/model/Project;", "deleteAllByProject", "", "projectId", "", "deleteApiKey", "apiKey", "editApiKey", "getAllByProject", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getAllByUser", "userAccountId", "filterProjectId", "(JLjava/lang/Long;Lorg/springframework/data/domain/Pageable;)Lorg/springframework/data/domain/Page;", "getApiKey", "Ljava/util/Optional;", "id", "", "getAvailableScopes", "save", "entity", "saveAll", "entities", "", "data"})
@org.springframework.stereotype.Service()
public class ApiKeyService {
    private final io.tolgee.repository.ApiKeyRepository apiKeyRepository = null;
    private final java.security.SecureRandom random = null;
    public io.tolgee.service.PermissionService permissionService;
    
    @org.springframework.beans.factory.annotation.Autowired()
    public ApiKeyService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.ApiKeyRepository apiKeyRepository, @org.jetbrains.annotations.NotNull()
    java.security.SecureRandom random) {
        super();
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
    public io.tolgee.model.ApiKey create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.ApiKey> getAllByUser(long userAccountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.ApiKey> getAllByUser(long userAccountId, @org.jetbrains.annotations.Nullable()
    java.lang.Long filterProjectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.ApiKey> getAllByProject(long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.ApiKey> getAllByProject(long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.ApiKey> getApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.ApiKey> getApiKey(long id) {
        return null;
    }
    
    public void deleteApiKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.ApiKey apiKey) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.enums.ApiScope> getAvailableScopes(long userAccountId, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.ApiKey editApiKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.ApiKey apiKey) {
        return null;
    }
    
    public void deleteAllByProject(long projectId) {
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.ApiKey> entities) {
    }
    
    public void save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.ApiKey entity) {
    }
}