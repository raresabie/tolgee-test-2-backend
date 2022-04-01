package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lio/tolgee/configuration/tolgee/SentryProperties;", "", "()V", "clientDsn", "", "getClientDsn", "()Ljava/lang/String;", "setClientDsn", "(Ljava/lang/String;)V", "serverDsn", "getServerDsn", "setServerDsn", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.sentry")
public final class SentryProperties {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String serverDsn;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clientDsn;
    
    public SentryProperties() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getServerDsn() {
        return null;
    }
    
    public final void setServerDsn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientDsn() {
        return null;
    }
    
    public final void setClientDsn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}