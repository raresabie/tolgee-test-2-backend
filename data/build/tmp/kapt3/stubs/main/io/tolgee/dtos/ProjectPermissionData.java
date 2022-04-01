package io.tolgee.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lio/tolgee/dtos/ProjectPermissionData;", "", "project", "Lio/tolgee/dtos/cacheable/ProjectDto;", "directPermissions", "Lio/tolgee/dtos/cacheable/PermissionDto;", "organizationRole", "Lio/tolgee/model/enums/OrganizationRoleType;", "organizationBasePermissions", "Lio/tolgee/model/Permission$ProjectPermissionType;", "computedPermissions", "Lio/tolgee/dtos/ComputedPermissionDto;", "(Lio/tolgee/dtos/cacheable/ProjectDto;Lio/tolgee/dtos/cacheable/PermissionDto;Lio/tolgee/model/enums/OrganizationRoleType;Lio/tolgee/model/Permission$ProjectPermissionType;Lio/tolgee/dtos/ComputedPermissionDto;)V", "getComputedPermissions", "()Lio/tolgee/dtos/ComputedPermissionDto;", "getDirectPermissions", "()Lio/tolgee/dtos/cacheable/PermissionDto;", "getOrganizationBasePermissions", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "getOrganizationRole", "()Lio/tolgee/model/enums/OrganizationRoleType;", "getProject", "()Lio/tolgee/dtos/cacheable/ProjectDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data"})
public final class ProjectPermissionData {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.cacheable.ProjectDto project = null;
    @org.jetbrains.annotations.Nullable()
    private final io.tolgee.dtos.cacheable.PermissionDto directPermissions = null;
    @org.jetbrains.annotations.Nullable()
    private final io.tolgee.model.enums.OrganizationRoleType organizationRole = null;
    @org.jetbrains.annotations.Nullable()
    private final io.tolgee.model.Permission.ProjectPermissionType organizationBasePermissions = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.ComputedPermissionDto computedPermissions = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.ProjectPermissionData copy(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.cacheable.ProjectDto project, @org.jetbrains.annotations.Nullable()
    io.tolgee.dtos.cacheable.PermissionDto directPermissions, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.enums.OrganizationRoleType organizationRole, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType organizationBasePermissions, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.ComputedPermissionDto computedPermissions) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ProjectPermissionData(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.cacheable.ProjectDto project, @org.jetbrains.annotations.Nullable()
    io.tolgee.dtos.cacheable.PermissionDto directPermissions, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.enums.OrganizationRoleType organizationRole, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType organizationBasePermissions, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.ComputedPermissionDto computedPermissions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.cacheable.ProjectDto component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.cacheable.ProjectDto getProject() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.dtos.cacheable.PermissionDto component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.dtos.cacheable.PermissionDto getDirectPermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.enums.OrganizationRoleType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.enums.OrganizationRoleType getOrganizationRole() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.Permission.ProjectPermissionType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.Permission.ProjectPermissionType getOrganizationBasePermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.ComputedPermissionDto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.ComputedPermissionDto getComputedPermissions() {
        return null;
    }
}