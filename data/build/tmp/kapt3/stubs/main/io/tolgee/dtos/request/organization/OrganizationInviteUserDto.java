package io.tolgee.dtos.request.organization;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lio/tolgee/dtos/request/organization/OrganizationInviteUserDto;", "", "roleType", "Lio/tolgee/model/enums/OrganizationRoleType;", "name", "", "email", "(Lio/tolgee/model/enums/OrganizationRoleType;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getName", "setName", "getRoleType", "()Lio/tolgee/model/enums/OrganizationRoleType;", "setRoleType", "(Lio/tolgee/model/enums/OrganizationRoleType;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
public final class OrganizationInviteUserDto {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    private io.tolgee.model.enums.OrganizationRoleType roleType;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 250)
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Email()
    @javax.validation.constraints.Size(max = 250)
    private java.lang.String email;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.organization.OrganizationInviteUserDto copy(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType roleType, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Name of invited user")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Email to send invitation to")
    java.lang.String email) {
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
    
    public OrganizationInviteUserDto() {
        super();
    }
    
    public OrganizationInviteUserDto(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType roleType, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Name of invited user")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Email to send invitation to")
    java.lang.String email) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.enums.OrganizationRoleType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.enums.OrganizationRoleType getRoleType() {
        return null;
    }
    
    public final void setRoleType(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}