package io.tolgee.dtos.request.project;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u00c6\u0003J?\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\bH\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lio/tolgee/dtos/request/project/ProjectInviteUserDto;", "", "type", "Lio/tolgee/model/Permission$ProjectPermissionType;", "languages", "", "", "email", "", "name", "(Lio/tolgee/model/Permission$ProjectPermissionType;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getLanguages", "()Ljava/util/Set;", "setLanguages", "(Ljava/util/Set;)V", "getName", "getType", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "setType", "(Lio/tolgee/model/Permission$ProjectPermissionType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
public final class ProjectInviteUserDto {
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotNull()
    private io.tolgee.model.Permission.ProjectPermissionType type;
    @org.jetbrains.annotations.Nullable()
    private java.util.Set<java.lang.Long> languages;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Email()
    @javax.validation.constraints.Size(max = 250)
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 250)
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.project.ProjectInviteUserDto copy(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType type, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "IDs of languages to allow user to translate to with TRANSLATE permission.\n\nOnly applicable when type is TRANSLATE, otherwise 400 - Bad Request is returned.\n  ")
    java.util.Set<java.lang.Long> languages, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Email to send invitation to")
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Name of invited user")
    java.lang.String name) {
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
    
    public ProjectInviteUserDto() {
        super();
    }
    
    public ProjectInviteUserDto(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType type, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "IDs of languages to allow user to translate to with TRANSLATE permission.\n\nOnly applicable when type is TRANSLATE, otherwise 400 - Bad Request is returned.\n  ")
    java.util.Set<java.lang.Long> languages, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Email to send invitation to")
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Name of invited user")
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.Permission.ProjectPermissionType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.Permission.ProjectPermissionType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.Long> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.Long> getLanguages() {
        return null;
    }
    
    public final void setLanguages(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
}