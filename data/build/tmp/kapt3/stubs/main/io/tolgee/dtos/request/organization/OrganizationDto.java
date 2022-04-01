package io.tolgee.dtos.request.organization;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J7\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006 "}, d2 = {"Lio/tolgee/dtos/request/organization/OrganizationDto;", "", "name", "", "description", "slug", "basePermissions", "Lio/tolgee/model/Permission$ProjectPermissionType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/tolgee/model/Permission$ProjectPermissionType;)V", "getBasePermissions", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "setBasePermissions", "(Lio/tolgee/model/Permission$ProjectPermissionType;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getName", "setName", "getSlug", "setSlug", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
public final class OrganizationDto {
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(min = 3, max = 50)
    @javax.validation.constraints.NotBlank()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Pattern(regexp = "^[a-z0-9-]*[a-z]+[a-z0-9-]*$", message = "invalid_pattern")
    @javax.validation.constraints.Size(min = 3, max = 60)
    private java.lang.String slug;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private io.tolgee.model.Permission.ProjectPermissionType basePermissions;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.organization.OrganizationDto copy(@org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "Beautiful organization")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "This is a beautiful organization full of beautiful and clever people")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "btforg")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType basePermissions) {
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
    
    public OrganizationDto() {
        super();
    }
    
    public OrganizationDto(@org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "Beautiful organization")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "This is a beautiful organization full of beautiful and clever people")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "btforg")
    java.lang.String slug, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType basePermissions) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Permission.ProjectPermissionType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Permission.ProjectPermissionType getBasePermissions() {
        return null;
    }
    
    public final void setBasePermissions(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType p0) {
    }
}