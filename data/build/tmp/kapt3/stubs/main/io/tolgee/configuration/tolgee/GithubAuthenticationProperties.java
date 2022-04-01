package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/configuration/tolgee/GithubAuthenticationProperties;", "", "()V", "authorizationUrl", "", "getAuthorizationUrl", "()Ljava/lang/String;", "setAuthorizationUrl", "(Ljava/lang/String;)V", "clientId", "getClientId", "setClientId", "clientSecret", "getClientSecret", "setClientSecret", "userUrl", "getUserUrl", "setUserUrl", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.authentication.github")
public final class GithubAuthenticationProperties {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clientSecret;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clientId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String authorizationUrl = "https://github.com/login/oauth/access_token";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userUrl = "https://api.github.com/user";
    
    public GithubAuthenticationProperties() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientSecret() {
        return null;
    }
    
    public final void setClientSecret(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientId() {
        return null;
    }
    
    public final void setClientId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthorizationUrl() {
        return null;
    }
    
    public final void setAuthorizationUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserUrl() {
        return null;
    }
    
    public final void setUserUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}