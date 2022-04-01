package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/tolgee/configuration/tolgee/RateLimitProperties;", "", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.rate-limits")
public final class RateLimitProperties {
    private boolean enabled = true;
    
    public RateLimitProperties() {
        super();
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
}