package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lio/tolgee/configuration/tolgee/LdapAuthenticationProperties;", "", "()V", "baseDn", "", "getBaseDn", "()Ljava/lang/String;", "setBaseDn", "(Ljava/lang/String;)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "port", "getPort", "setPort", "principalPassword", "getPrincipalPassword", "setPrincipalPassword", "securityPrincipal", "getSecurityPrincipal", "setSecurityPrincipal", "urls", "getUrls", "setUrls", "userDnPattern", "getUserDnPattern", "setUserDnPattern", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.authentication.ldap")
public final class LdapAuthenticationProperties {
    private boolean enabled = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String port;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String urls;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String baseDn;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String securityPrincipal;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String principalPassword;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userDnPattern;
    
    public LdapAuthenticationProperties() {
        super();
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPort() {
        return null;
    }
    
    public final void setPort(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrls() {
        return null;
    }
    
    public final void setUrls(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBaseDn() {
        return null;
    }
    
    public final void setBaseDn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecurityPrincipal() {
        return null;
    }
    
    public final void setSecurityPrincipal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrincipalPassword() {
        return null;
    }
    
    public final void setPrincipalPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserDnPattern() {
        return null;
    }
    
    public final void setUserDnPattern(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}