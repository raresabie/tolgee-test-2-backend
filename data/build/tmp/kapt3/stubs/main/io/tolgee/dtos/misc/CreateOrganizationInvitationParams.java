package io.tolgee.dtos.misc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lio/tolgee/dtos/misc/CreateOrganizationInvitationParams;", "Lio/tolgee/dtos/misc/CreateInvitationParams;", "organization", "Lio/tolgee/model/Organization;", "type", "Lio/tolgee/model/enums/OrganizationRoleType;", "email", "", "name", "(Lio/tolgee/model/Organization;Lio/tolgee/model/enums/OrganizationRoleType;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getName", "getOrganization", "()Lio/tolgee/model/Organization;", "setOrganization", "(Lio/tolgee/model/Organization;)V", "getType", "()Lio/tolgee/model/enums/OrganizationRoleType;", "setType", "(Lio/tolgee/model/enums/OrganizationRoleType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data"})
public final class CreateOrganizationInvitationParams implements io.tolgee.dtos.misc.CreateInvitationParams {
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.model.Organization organization;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.model.enums.OrganizationRoleType type;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.misc.CreateOrganizationInvitationParams copy(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType type, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
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
    
    public CreateOrganizationInvitationParams(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType type, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Organization component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Organization getOrganization() {
        return null;
    }
    
    public final void setOrganization(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.enums.OrganizationRoleType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.enums.OrganizationRoleType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
}