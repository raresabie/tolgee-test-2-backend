package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/configuration/tolgee/InternalProperties;", "", "()V", "controllerEnabled", "", "getControllerEnabled", "()Z", "setControllerEnabled", "(Z)V", "fakeGithubLogin", "getFakeGithubLogin", "setFakeGithubLogin", "fakeMtProviders", "getFakeMtProviders", "setFakeMtProviders", "showVersion", "getShowVersion", "setShowVersion", "stopRightAfterStart", "getStopRightAfterStart", "setStopRightAfterStart", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.internal")
public final class InternalProperties {
    private boolean controllerEnabled = false;
    private boolean fakeGithubLogin = false;
    private boolean showVersion = false;
    private boolean fakeMtProviders = false;
    
    /**
     * Stops server right after it's started.
     * This is used for database changelog generation.
     * We need to apply the schema and then exit to run the schema generator.
     */
    private boolean stopRightAfterStart = false;
    
    public InternalProperties() {
        super();
    }
    
    public final boolean getControllerEnabled() {
        return false;
    }
    
    public final void setControllerEnabled(boolean p0) {
    }
    
    public final boolean getFakeGithubLogin() {
        return false;
    }
    
    public final void setFakeGithubLogin(boolean p0) {
    }
    
    public final boolean getShowVersion() {
        return false;
    }
    
    public final void setShowVersion(boolean p0) {
    }
    
    public final boolean getFakeMtProviders() {
        return false;
    }
    
    public final void setFakeMtProviders(boolean p0) {
    }
    
    public final boolean getStopRightAfterStart() {
        return false;
    }
    
    public final void setStopRightAfterStart(boolean p0) {
    }
}