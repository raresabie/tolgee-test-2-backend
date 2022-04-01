package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/configuration/tolgee/CacheProperties;", "", "useRedis", "", "defaultTtl", "", "enabled", "caffeineMaxSize", "(ZJZJ)V", "getCaffeineMaxSize", "()J", "setCaffeineMaxSize", "(J)V", "getDefaultTtl", "setDefaultTtl", "getEnabled", "()Z", "setEnabled", "(Z)V", "getUseRedis", "setUseRedis", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.cache")
public final class CacheProperties {
    private boolean useRedis;
    private long defaultTtl;
    private boolean enabled;
    private long caffeineMaxSize;
    
    public CacheProperties() {
        super();
    }
    
    public CacheProperties(boolean useRedis, long defaultTtl, boolean enabled, long caffeineMaxSize) {
        super();
    }
    
    public final boolean getUseRedis() {
        return false;
    }
    
    public final void setUseRedis(boolean p0) {
    }
    
    public final long getDefaultTtl() {
        return 0L;
    }
    
    public final void setDefaultTtl(long p0) {
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    public final long getCaffeineMaxSize() {
        return 0L;
    }
    
    public final void setCaffeineMaxSize(long p0) {
    }
}