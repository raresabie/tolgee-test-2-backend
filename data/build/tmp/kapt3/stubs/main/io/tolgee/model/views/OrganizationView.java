package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005\u00a8\u0006\u0019"}, d2 = {"Lio/tolgee/model/views/OrganizationView;", "", "avatarHash", "", "getAvatarHash", "()Ljava/lang/String;", "basePermissions", "Lio/tolgee/model/Permission$ProjectPermissionType;", "getBasePermissions", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "currentUserRole", "Lio/tolgee/model/enums/OrganizationRoleType;", "getCurrentUserRole", "()Lio/tolgee/model/enums/OrganizationRoleType;", "description", "getDescription", "id", "", "getId", "()J", "name", "getName", "slug", "getSlug", "Companion", "data"})
public abstract interface OrganizationView {
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.model.views.OrganizationView.Companion Companion = null;
    
    public abstract long getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getDescription();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSlug();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.model.Permission.ProjectPermissionType getBasePermissions();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.model.enums.OrganizationRoleType getCurrentUserRole();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAvatarHash();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/tolgee/model/views/OrganizationView$Companion;", "", "()V", "of", "Lio/tolgee/model/views/OrganizationView;", "entity", "Lio/tolgee/model/Organization;", "currentUserRole", "Lio/tolgee/model/enums/OrganizationRoleType;", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.model.views.OrganizationView of(@org.jetbrains.annotations.NotNull()
        io.tolgee.model.Organization entity, @org.jetbrains.annotations.NotNull()
        io.tolgee.model.enums.OrganizationRoleType currentUserRole) {
            return null;
        }
    }
}