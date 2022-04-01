package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lio/tolgee/configuration/tolgee/SmtpProperties;", "", "()V", "auth", "", "getAuth", "()Z", "setAuth", "(Z)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "host", "getHost", "setHost", "password", "getPassword", "setPassword", "port", "", "getPort", "()I", "setPort", "(I)V", "sslEnabled", "getSslEnabled", "setSslEnabled", "tlsEnabled", "getTlsEnabled", "setTlsEnabled", "tlsRequired", "getTlsRequired", "setTlsRequired", "username", "getUsername", "setUsername", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.smtp")
public final class SmtpProperties {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String host;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    private int port = 25;
    private boolean auth = false;
    private boolean tlsEnabled = false;
    private boolean sslEnabled = false;
    private boolean tlsRequired = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String from;
    
    public SmtpProperties() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHost() {
        return null;
    }
    
    public final void setHost(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getPort() {
        return 0;
    }
    
    public final void setPort(int p0) {
    }
    
    public final boolean getAuth() {
        return false;
    }
    
    public final void setAuth(boolean p0) {
    }
    
    public final boolean getTlsEnabled() {
        return false;
    }
    
    public final void setTlsEnabled(boolean p0) {
    }
    
    public final boolean getSslEnabled() {
        return false;
    }
    
    public final void setSslEnabled(boolean p0) {
    }
    
    public final boolean getTlsRequired() {
        return false;
    }
    
    public final void setTlsRequired(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}