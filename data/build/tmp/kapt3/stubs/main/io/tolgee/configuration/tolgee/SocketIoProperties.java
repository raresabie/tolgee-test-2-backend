package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\u0002\u0010\fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014\u00a8\u0006!"}, d2 = {"Lio/tolgee/configuration/tolgee/SocketIoProperties;", "", "enabled", "", "port", "", "host", "", "useRedis", "externalUrl", "allowedTransports", "", "(ZILjava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getAllowedTransports", "()Ljava/util/List;", "setAllowedTransports", "(Ljava/util/List;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getExternalUrl", "()Ljava/lang/String;", "setExternalUrl", "(Ljava/lang/String;)V", "getHost", "setHost", "getPort", "()I", "setPort", "(I)V", "getUseRedis", "setUseRedis", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.socket-io")
public final class SocketIoProperties {
    private boolean enabled;
    private int port;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String host;
    private boolean useRedis;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String externalUrl;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> allowedTransports;
    
    public SocketIoProperties() {
        super();
    }
    
    public SocketIoProperties(boolean enabled, int port, @org.jetbrains.annotations.Nullable()
    java.lang.String host, boolean useRedis, @org.jetbrains.annotations.Nullable()
    java.lang.String externalUrl, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> allowedTransports) {
        super();
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    public final int getPort() {
        return 0;
    }
    
    public final void setPort(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHost() {
        return null;
    }
    
    public final void setHost(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getUseRedis() {
        return false;
    }
    
    public final void setUseRedis(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExternalUrl() {
        return null;
    }
    
    public final void setExternalUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAllowedTransports() {
        return null;
    }
    
    public final void setAllowedTransports(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
}