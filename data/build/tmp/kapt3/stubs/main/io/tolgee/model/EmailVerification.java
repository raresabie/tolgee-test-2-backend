package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0097\b\u0018\u00002\u00020\u0001B1\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J2\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lio/tolgee/model/EmailVerification;", "Lio/tolgee/model/AuditModel;", "id", "", "code", "", "userAccount", "Lio/tolgee/model/UserAccount;", "newEmail", "(Ljava/lang/Long;Ljava/lang/String;Lio/tolgee/model/UserAccount;Ljava/lang/String;)V", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNewEmail", "setNewEmail", "getUserAccount$annotations", "()V", "getUserAccount", "()Lio/tolgee/model/UserAccount;", "setUserAccount", "(Lio/tolgee/model/UserAccount;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lio/tolgee/model/EmailVerification;", "equals", "", "other", "", "hashCode", "", "toString", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Table(uniqueConstraints = {})
@javax.persistence.Entity()
public class EmailVerification extends io.tolgee.model.AuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String code;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String newEmail;
    @javax.persistence.OneToOne(optional = false)
    public io.tolgee.model.UserAccount userAccount;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.EmailVerification copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotBlank()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Email()
    java.lang.String newEmail) {
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
    
    public EmailVerification() {
        super();
    }
    
    public EmailVerification(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotBlank()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Email()
    java.lang.String newEmail) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getCode() {
        return null;
    }
    
    public void setCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getNewEmail() {
        return null;
    }
    
    public void setNewEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount getUserAccount() {
        return null;
    }
    
    @kotlin.Suppress(names = {"JoinDeclarationAndAssignment"})
    @java.lang.Deprecated()
    public static void getUserAccount$annotations() {
    }
    
    public void setUserAccount(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount p0) {
    }
    
    public EmailVerification(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.Nullable()
    java.lang.String newEmail) {
        super();
    }
}