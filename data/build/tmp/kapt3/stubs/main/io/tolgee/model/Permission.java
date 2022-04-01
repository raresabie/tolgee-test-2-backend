package io.tolgee.model;

import java.lang.System;

@kotlin.Suppress(names = {"LeakingThis"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001:\u0001)B;\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006*"}, d2 = {"Lio/tolgee/model/Permission;", "Lio/tolgee/model/AuditModel;", "id", "", "user", "Lio/tolgee/model/UserAccount;", "invitation", "Lio/tolgee/model/Invitation;", "project", "Lio/tolgee/model/Project;", "type", "Lio/tolgee/model/Permission$ProjectPermissionType;", "(JLio/tolgee/model/UserAccount;Lio/tolgee/model/Invitation;Lio/tolgee/model/Project;Lio/tolgee/model/Permission$ProjectPermissionType;)V", "(JLio/tolgee/model/UserAccount;Lio/tolgee/model/Invitation;Lio/tolgee/model/Permission$ProjectPermissionType;)V", "getId", "()J", "setId", "(J)V", "getInvitation", "()Lio/tolgee/model/Invitation;", "setInvitation", "(Lio/tolgee/model/Invitation;)V", "languages", "", "Lio/tolgee/model/Language;", "getLanguages", "()Ljava/util/Set;", "setLanguages", "(Ljava/util/Set;)V", "getProject", "()Lio/tolgee/model/Project;", "setProject", "(Lio/tolgee/model/Project;)V", "getType", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "setType", "(Lio/tolgee/model/Permission$ProjectPermissionType;)V", "getUser", "()Lio/tolgee/model/UserAccount;", "setUser", "(Lio/tolgee/model/UserAccount;)V", "ProjectPermissionType", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Entity()
public class Permission extends io.tolgee.model.AuditModel {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private long id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private io.tolgee.model.UserAccount user;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne(fetch = javax.persistence.FetchType.LAZY)
    private io.tolgee.model.Invitation invitation;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private io.tolgee.model.Permission.ProjectPermissionType type;
    
    /**
     * Languages for translate permission.
     * When specified, user is restricted to edit/review specific language translations.
     *
     * This field makes no sense for any other permission type.
     */
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToMany(fetch = javax.persistence.FetchType.EAGER)
    private java.util.Set<io.tolgee.model.Language> languages;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne()
    private io.tolgee.model.Project project;
    
    public Permission() {
        super();
    }
    
    public Permission(long id, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount user, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Invitation invitation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType type) {
        super();
    }
    
    public long getId() {
        return 0L;
    }
    
    public void setId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.UserAccount getUser() {
        return null;
    }
    
    public void setUser(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Invitation getInvitation() {
        return null;
    }
    
    public void setInvitation(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Invitation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Permission.ProjectPermissionType getType() {
        return null;
    }
    
    public void setType(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.Language> getLanguages() {
        return null;
    }
    
    public void setLanguages(@org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.model.Language> p0) {
    }
    
    public Permission(long id, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount user, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Invitation invitation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project getProject() {
        return null;
    }
    
    public void setProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/model/Permission$ProjectPermissionType;", "", "power", "", "availableScopes", "", "Lio/tolgee/model/enums/ApiScope;", "(Ljava/lang/String;II[Lio/tolgee/model/enums/ApiScope;)V", "getAvailableScopes", "()[Lio/tolgee/model/enums/ApiScope;", "[Lio/tolgee/model/enums/ApiScope;", "getPower", "()I", "VIEW", "TRANSLATE", "EDIT", "MANAGE", "data"})
    public static enum ProjectPermissionType {
        /*public static final*/ VIEW /* = new VIEW(0, null) */,
        /*public static final*/ TRANSLATE /* = new TRANSLATE(0, null) */,
        /*public static final*/ EDIT /* = new EDIT(0, null) */,
        /*public static final*/ MANAGE /* = new MANAGE(0, null) */;
        private final int power = 0;
        @org.jetbrains.annotations.NotNull()
        private final io.tolgee.model.enums.ApiScope[] availableScopes = null;
        
        ProjectPermissionType(int power, io.tolgee.model.enums.ApiScope[] availableScopes) {
        }
        
        public final int getPower() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.model.enums.ApiScope[] getAvailableScopes() {
            return null;
        }
    }
}