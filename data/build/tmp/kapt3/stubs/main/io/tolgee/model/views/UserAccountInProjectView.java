package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lio/tolgee/model/views/UserAccountInProjectView;", "", "directPermissions", "Lio/tolgee/model/Permission$ProjectPermissionType;", "getDirectPermissions", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "id", "", "getId", "()J", "name", "", "getName", "()Ljava/lang/String;", "organizationBasePermissions", "getOrganizationBasePermissions", "organizationRole", "Lio/tolgee/model/enums/OrganizationRoleType;", "getOrganizationRole", "()Lio/tolgee/model/enums/OrganizationRoleType;", "username", "getUsername", "data"})
public abstract interface UserAccountInProjectView {
    
    public abstract long getId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUsername();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.enums.OrganizationRoleType getOrganizationRole();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.Permission.ProjectPermissionType getOrganizationBasePermissions();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.Permission.ProjectPermissionType getDirectPermissions();
}