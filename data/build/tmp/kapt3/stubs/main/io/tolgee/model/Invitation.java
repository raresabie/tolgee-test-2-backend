package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\u001e\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000b\u0010\u0004\u001a\u00070\u0005\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\u0010\nR\u001f\u0010\u0004\u001a\u00070\u0005\u00a2\u0006\u0002\b\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR \u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006$"}, d2 = {"Lio/tolgee/model/Invitation;", "Lio/tolgee/model/AuditModel;", "id", "", "code", "", "permission", "Lio/tolgee/model/Permission;", "(Ljava/lang/Long;Ljava/lang/String;Lio/tolgee/model/Permission;)V", "Ljavax/validation/constraints/NotBlank;", "(Ljava/lang/Long;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "name", "getName", "setName", "organizationRole", "Lio/tolgee/model/OrganizationRole;", "getOrganizationRole", "()Lio/tolgee/model/OrganizationRole;", "setOrganizationRole", "(Lio/tolgee/model/OrganizationRole;)V", "getPermission", "()Lio/tolgee/model/Permission;", "setPermission", "(Lio/tolgee/model/Permission;)V", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"code"}, name = "invitation_code_unique")})
@javax.persistence.Entity()
public class Invitation extends io.tolgee.model.AuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String code;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne(mappedBy = "invitation", cascade = {javax.persistence.CascadeType.ALL})
    private io.tolgee.model.Permission permission;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne(mappedBy = "invitation", cascade = {javax.persistence.CascadeType.ALL})
    private io.tolgee.model.OrganizationRole organizationRole;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    
    public Invitation(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCode() {
        return null;
    }
    
    public void setCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Permission getPermission() {
        return null;
    }
    
    public void setPermission(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.OrganizationRole getOrganizationRole() {
        return null;
    }
    
    public void setOrganizationRole(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.OrganizationRole p0) {
    }
    
    public Invitation(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission permission) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}