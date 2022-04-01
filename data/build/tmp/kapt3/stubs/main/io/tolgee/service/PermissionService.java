package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001c\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J6\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010&2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J0\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&2\u000e\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0016J\u0010\u00105\u001a\u0002062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u00107\u001a\u0002062\u0006\u00108\u001a\u00020*H\u0016J\u0012\u00109\u001a\u0004\u0018\u00010\u001d2\u0006\u0010:\u001a\u00020*H\u0016J\u001a\u0010;\u001a\u0004\u0018\u00010\u001d2\u0006\u00108\u001a\u00020*2\u0006\u0010<\u001a\u00020*H\u0016J\u001a\u0010=\u001a\u0004\u0018\u00010>2\u0006\u00108\u001a\u00020*2\u0006\u0010<\u001a\u00020*H\u0016J\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0)2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J0\u0010@\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0B0A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020*0B2\u0006\u0010<\u001a\u00020*H\u0016J(\u0010D\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0B0A2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020*0BH\u0016J\u0018\u0010F\u001a\u00020G2\u0006\u0010/\u001a\u00020H2\u0006\u0010I\u001a\u00020*H\u0016J\u0018\u0010F\u001a\u00020G2\u0006\u00108\u001a\u00020*2\u0006\u0010I\u001a\u00020*H\u0016J\u001a\u0010J\u001a\u0004\u0018\u00010&2\u0006\u00108\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010J\u001a\u0004\u0018\u00010&2\u0006\u00108\u001a\u00020*2\u0006\u0010I\u001a\u00020*H\u0016J\u0018\u0010K\u001a\u0002062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0017J\u0010\u0010L\u001a\u0002062\u0006\u0010M\u001a\u000204H\u0016J\u0018\u0010N\u001a\u0002062\u0006\u0010/\u001a\u0002002\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010O\u001a\u0002062\u0006\u00108\u001a\u00020*2\u0006\u0010<\u001a\u00020*H\u0016J\u0016\u0010P\u001a\u0002062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001d0RH\u0016J4\u0010S\u001a\u0004\u0018\u00010\u001d2\u0006\u00108\u001a\u00020*2\u0006\u0010<\u001a\u00020*2\u0006\u0010T\u001a\u00020&2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010)H\u0016J \u0010U\u001a\u0002062\u000e\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010)2\u0006\u0010T\u001a\u00020&H\u0012R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006V"}, d2 = {"Lio/tolgee/service/PermissionService;", "", "permissionRepository", "Lio/tolgee/repository/PermissionRepository;", "organizationRoleService", "Lio/tolgee/service/OrganizationRoleService;", "userAccountService", "Lio/tolgee/service/UserAccountService;", "(Lio/tolgee/repository/PermissionRepository;Lio/tolgee/service/OrganizationRoleService;Lio/tolgee/service/UserAccountService;)V", "<set-?>", "Lio/tolgee/service/CachedPermissionService;", "cachedPermissionService", "getCachedPermissionService", "()Lio/tolgee/service/CachedPermissionService;", "setCachedPermissionService", "(Lio/tolgee/service/CachedPermissionService;)V", "Lio/tolgee/service/OrganizationService;", "organizationService", "getOrganizationService", "()Lio/tolgee/service/OrganizationService;", "setOrganizationService", "(Lio/tolgee/service/OrganizationService;)V", "Lio/tolgee/service/ProjectService;", "projectService", "getProjectService", "()Lio/tolgee/service/ProjectService;", "setProjectService", "(Lio/tolgee/service/ProjectService;)V", "acceptInvitation", "Lio/tolgee/model/Permission;", "permission", "userAccount", "Lio/tolgee/model/UserAccount;", "computeProjectPermissionType", "Lio/tolgee/dtos/ComputedPermissionDto;", "organizationRole", "Lio/tolgee/model/enums/OrganizationRoleType;", "organizationBasePermissionType", "Lio/tolgee/model/Permission$ProjectPermissionType;", "projectPermissionType", "projectPermissionLanguages", "", "", "create", "createForInvitation", "invitation", "Lio/tolgee/model/Invitation;", "project", "Lio/tolgee/model/Project;", "type", "languages", "", "Lio/tolgee/model/Language;", "delete", "", "deleteAllByProject", "projectId", "findById", "id", "findOneByProjectIdAndUserId", "userId", "findOneDtoByProjectIdAndUserId", "Lio/tolgee/dtos/cacheable/PermissionDto;", "getAllOfProject", "getPermittedTranslateLanguagesForProjectIds", "", "", "projectIds", "getPermittedTranslateLanguagesForUserIds", "userIds", "getProjectPermissionData", "Lio/tolgee/dtos/ProjectPermissionData;", "Lio/tolgee/dtos/cacheable/ProjectDto;", "userAccountId", "getProjectPermissionType", "grantFullAccessToProject", "onLanguageDeleted", "language", "onProjectTransferredToUser", "revoke", "saveAll", "permissions", "", "setUserDirectPermission", "newPermissionType", "validateLanguagePermissions", "data"})
@org.springframework.stereotype.Service()
public class PermissionService {
    private final io.tolgee.repository.PermissionRepository permissionRepository = null;
    private final io.tolgee.service.OrganizationRoleService organizationRoleService = null;
    private final io.tolgee.service.UserAccountService userAccountService = null;
    public io.tolgee.service.OrganizationService organizationService;
    public io.tolgee.service.CachedPermissionService cachedPermissionService;
    public io.tolgee.service.ProjectService projectService;
    
    public PermissionService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.PermissionRepository permissionRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.OrganizationRoleService organizationRoleService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.UserAccountService userAccountService) {
        super();
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
    public io.tolgee.service.CachedPermissionService getCachedPermissionService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setCachedPermissionService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.CachedPermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.ProjectService getProjectService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    @org.springframework.context.annotation.Lazy()
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
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Permission.ProjectPermissionType getProjectPermissionType(long projectId, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Permission.ProjectPermissionType getProjectPermissionType(long projectId, long userAccountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.dtos.ProjectPermissionData getProjectPermissionData(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.cacheable.ProjectDto project, long userAccountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Long, java.util.List<java.lang.Long>> getPermittedTranslateLanguagesForUserIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> userIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Long, java.util.List<java.lang.Long>> getPermittedTranslateLanguagesForProjectIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> projectIds, long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.dtos.ProjectPermissionData getProjectPermissionData(long projectId, long userAccountId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission permission) {
        return null;
    }
    
    public void delete(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission permission) {
    }
    
    /**
     * Deletes all permissions in project
     * No need to evict cache, since this is only used when project is deleted
     */
    public void deleteAllByProject(long projectId) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void grantFullAccessToProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.dtos.ComputedPermissionDto computeProjectPermissionType(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.enums.OrganizationRoleType organizationRole, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType organizationBasePermissionType, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType projectPermissionType, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.Long> projectPermissionLanguages) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission createForInvitation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Invitation invitation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType type, @org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends io.tolgee.model.Language> languages) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Permission findOneByProjectIdAndUserId(long projectId, long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.dtos.cacheable.PermissionDto findOneDtoByProjectIdAndUserId(long projectId, long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission acceptInvitation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission permission, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Permission setUserDirectPermission(long projectId, long userId, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType newPermissionType, @org.jetbrains.annotations.Nullable()
    java.util.Set<? extends io.tolgee.model.Language> languages) {
        return null;
    }
    
    public void onProjectTransferredToUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
    }
    
    private void validateLanguagePermissions(java.util.Set<? extends io.tolgee.model.Language> languages, io.tolgee.model.Permission.ProjectPermissionType newPermissionType) {
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.Permission> permissions) {
    }
    
    public void revoke(long projectId, long userId) {
    }
    
    public void onLanguageDeleted(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language) {
    }
}