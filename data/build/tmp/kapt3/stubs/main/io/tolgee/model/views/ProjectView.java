package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0014\u0010\"\u001a\u0004\u0018\u00010#X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006&"}, d2 = {"Lio/tolgee/model/views/ProjectView;", "", "avatarHash", "", "getAvatarHash", "()Ljava/lang/String;", "baseLanguage", "Lio/tolgee/model/Language;", "getBaseLanguage", "()Lio/tolgee/model/Language;", "description", "getDescription", "directPermissions", "Lio/tolgee/model/Permission$ProjectPermissionType;", "getDirectPermissions", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "id", "", "getId", "()J", "name", "getName", "organizationBasePermissions", "getOrganizationBasePermissions", "organizationOwnerName", "getOrganizationOwnerName", "organizationOwnerSlug", "getOrganizationOwnerSlug", "organizationRole", "Lio/tolgee/model/enums/OrganizationRoleType;", "getOrganizationRole", "()Lio/tolgee/model/enums/OrganizationRoleType;", "slug", "getSlug", "userOwner", "Lio/tolgee/model/UserAccount;", "getUserOwner", "()Lio/tolgee/model/UserAccount;", "data"})
public abstract interface ProjectView {
    
    public abstract long getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getDescription();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getSlug();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAvatarHash();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.UserAccount getUserOwner();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.Language getBaseLanguage();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getOrganizationOwnerName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getOrganizationOwnerSlug();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.Permission.ProjectPermissionType getOrganizationBasePermissions();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.enums.OrganizationRoleType getOrganizationRole();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.Permission.ProjectPermissionType getDirectPermissions();
}