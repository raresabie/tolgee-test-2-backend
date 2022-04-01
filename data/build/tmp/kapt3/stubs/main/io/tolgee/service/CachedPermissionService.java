package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J0\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0017J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0016J\u001a\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0017J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\'2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\u0016\u0010)\u001a\u00020\u001d2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0+H\u0017J \u0010,\u001a\u00020\u001d2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006-"}, d2 = {"Lio/tolgee/service/CachedPermissionService;", "", "permissionRepository", "Lio/tolgee/repository/PermissionRepository;", "(Lio/tolgee/repository/PermissionRepository;)V", "<set-?>", "Lio/tolgee/service/ProjectService;", "projectService", "getProjectService", "()Lio/tolgee/service/ProjectService;", "setProjectService", "(Lio/tolgee/service/ProjectService;)V", "acceptInvitation", "Lio/tolgee/model/Permission;", "permission", "userAccount", "Lio/tolgee/model/UserAccount;", "create", "createForInvitation", "invitation", "Lio/tolgee/model/Invitation;", "project", "Lio/tolgee/model/Project;", "type", "Lio/tolgee/model/Permission$ProjectPermissionType;", "languages", "", "Lio/tolgee/model/Language;", "delete", "", "findById", "id", "", "findOneByProjectIdAndUserId", "projectId", "userId", "findOneDtoByProjectIdAndUserId", "Lio/tolgee/dtos/cacheable/PermissionDto;", "getAllOfProject", "", "save", "saveAll", "permissions", "", "validateTranslatePermissionLanguages", "data"})
@org.springframework.stereotype.Service()
public class CachedPermissionService {
    private final io.tolgee.repository.PermissionRepository permissionRepository = null;
    public io.tolgee.service.ProjectService projectService;
    
    public CachedPermissionService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.PermissionRepository permissionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.ProjectService getProjectService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public void setProjectService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.Permission> getAllOfProject(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Permission findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission permission) {
        return null;
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projectPermissions"}, key = "{#permission.user?.id, #permission.project?.id}")
    public void delete(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission permission) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projectPermissions"}, key = "{#result.user?.id, #result.project?.id}")
    public io.tolgee.model.Permission createForInvitation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Invitation invitation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType type, @org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends io.tolgee.model.Language> languages) {
        return null;
    }
    
    private void validateTranslatePermissionLanguages(java.util.Collection<? extends io.tolgee.model.Language> languages, io.tolgee.model.Permission.ProjectPermissionType type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Permission findOneByProjectIdAndUserId(long projectId, long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.cache.annotation.Cacheable(cacheNames = {"projectPermissions"}, key = "{#userId, #projectId}")
    public io.tolgee.dtos.cacheable.PermissionDto findOneDtoByProjectIdAndUserId(long projectId, long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projectPermissions"}, key = "{#permission.user?.id, #permission.project?.id}")
    public io.tolgee.model.Permission acceptInvitation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission permission, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projectPermissions"}, key = "{#result.user?.id, #result.project?.id}")
    public io.tolgee.model.Permission save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission permission) {
        return null;
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"projectPermissions"}, allEntries = true)
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.Permission> permissions) {
    }
}