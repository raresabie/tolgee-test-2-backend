package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0097\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001PBg\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u0012J\t\u0010C\u001a\u00020\u0004H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\rH\u00c6\u0003J?\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LH\u00d6\u0003J\t\u0010M\u001a\u00020NH\u00d6\u0001J\t\u0010O\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u0004\u0018\u00010#8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\b\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R$\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R \u0010\f\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R \u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0015\"\u0004\b@\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0015\"\u0004\bB\u0010\u0017\u00a8\u0006Q"}, d2 = {"Lio/tolgee/model/UserAccount;", "Lio/tolgee/model/AuditModel;", "Lio/tolgee/model/ModelWithAvatar;", "id", "", "username", "", "password", "name", "permissions", "", "Lio/tolgee/model/Permission;", "role", "Lio/tolgee/model/UserAccount$Role;", "thirdPartyAuthType", "thirdPartyAuthId", "resetPasswordCode", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lio/tolgee/model/UserAccount$Role;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/tolgee/model/UserAccount$Role;)V", "avatarHash", "getAvatarHash", "()Ljava/lang/String;", "setAvatarHash", "(Ljava/lang/String;)V", "emailVerification", "Lio/tolgee/model/EmailVerification;", "getEmailVerification", "()Lio/tolgee/model/EmailVerification;", "setEmailVerification", "(Lio/tolgee/model/EmailVerification;)V", "getId", "()J", "setId", "(J)V", "mtCreditBucket", "Lio/tolgee/model/MtCreditBucket;", "getMtCreditBucket", "()Lio/tolgee/model/MtCreditBucket;", "setMtCreditBucket", "(Lio/tolgee/model/MtCreditBucket;)V", "getName", "setName", "organizationRoles", "", "Lio/tolgee/model/OrganizationRole;", "getOrganizationRoles", "()Ljava/util/List;", "setOrganizationRoles", "(Ljava/util/List;)V", "getPassword", "setPassword", "getPermissions", "()Ljava/util/Set;", "setPermissions", "(Ljava/util/Set;)V", "getResetPasswordCode", "setResetPasswordCode", "getRole", "()Lio/tolgee/model/UserAccount$Role;", "setRole", "(Lio/tolgee/model/UserAccount$Role;)V", "getThirdPartyAuthId", "setThirdPartyAuthId", "getThirdPartyAuthType", "setThirdPartyAuthType", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Role", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"username"}, name = "useraccount_username"), @javax.persistence.UniqueConstraint(columnNames = {"third_party_auth_type", "third_party_auth_id"}, name = "useraccount_authtype_auth_id")})
@javax.persistence.Entity()
public class UserAccount extends io.tolgee.model.AuditModel implements io.tolgee.model.ModelWithAvatar {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private long id;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private io.tolgee.model.UserAccount.Role role;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToMany(mappedBy = "user")
    private java.util.Set<io.tolgee.model.Permission> permissions;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne(mappedBy = "userAccount", fetch = javax.persistence.FetchType.LAZY, optional = true)
    private io.tolgee.model.EmailVerification emailVerification;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "third_party_auth_type")
    private java.lang.String thirdPartyAuthType;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "third_party_auth_id")
    private java.lang.String thirdPartyAuthId;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "reset_password_code")
    private java.lang.String resetPasswordCode;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "user")
    @javax.persistence.OrderBy(value = "id ASC")
    private java.util.List<io.tolgee.model.OrganizationRole> organizationRoles;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne(mappedBy = "userAccount", cascade = {javax.persistence.CascadeType.REMOVE})
    private io.tolgee.model.MtCreditBucket mtCreditBucket;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String avatarHash;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.UserAccount copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount.Role role) {
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
    
    public UserAccount() {
        super();
    }
    
    public UserAccount(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount.Role role) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getUsername() {
        return null;
    }
    
    public void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getPassword() {
        return null;
    }
    
    public void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.UserAccount.Role component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.UserAccount.Role getRole() {
        return null;
    }
    
    public void setRole(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount.Role p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.Set<io.tolgee.model.Permission> getPermissions() {
        return null;
    }
    
    public void setPermissions(@org.jetbrains.annotations.Nullable()
    java.util.Set<io.tolgee.model.Permission> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.EmailVerification getEmailVerification() {
        return null;
    }
    
    public void setEmailVerification(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.EmailVerification p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getThirdPartyAuthType() {
        return null;
    }
    
    public void setThirdPartyAuthType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getThirdPartyAuthId() {
        return null;
    }
    
    public void setThirdPartyAuthId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getResetPasswordCode() {
        return null;
    }
    
    public void setResetPasswordCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.OrganizationRole> getOrganizationRoles() {
        return null;
    }
    
    public void setOrganizationRoles(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.OrganizationRole> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.MtCreditBucket getMtCreditBucket() {
        return null;
    }
    
    public void setMtCreditBucket(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.MtCreditBucket p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAvatarHash() {
        return null;
    }
    
    @java.lang.Override()
    public void setAvatarHash(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public UserAccount(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.Set<io.tolgee.model.Permission> permissions, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount.Role role, @org.jetbrains.annotations.Nullable()
    java.lang.String thirdPartyAuthType, @org.jetbrains.annotations.Nullable()
    java.lang.String thirdPartyAuthId, @org.jetbrains.annotations.Nullable()
    java.lang.String resetPasswordCode) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/tolgee/model/UserAccount$Role;", "", "(Ljava/lang/String;I)V", "USER", "ADMIN", "data"})
    public static enum Role {
        /*public static final*/ USER /* = new USER() */,
        /*public static final*/ ADMIN /* = new ADMIN() */;
        
        Role() {
        }
    }
}