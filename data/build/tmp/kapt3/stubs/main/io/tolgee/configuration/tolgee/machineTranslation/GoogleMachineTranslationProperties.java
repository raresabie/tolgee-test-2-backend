package io.tolgee.configuration.tolgee.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;", "Lio/tolgee/configuration/tolgee/machineTranslation/MachineTranslationServiceProperties;", "defaultEnabled", "", "defaultPrimary", "apiKey", "", "(ZZLjava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "getDefaultEnabled", "()Z", "setDefaultEnabled", "(Z)V", "getDefaultPrimary", "setDefaultPrimary", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.machine-translation.google")
public class GoogleMachineTranslationProperties implements io.tolgee.configuration.tolgee.machineTranslation.MachineTranslationServiceProperties {
    private boolean defaultEnabled;
    private boolean defaultPrimary;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String apiKey;
    
    public GoogleMachineTranslationProperties() {
        super();
    }
    
    public GoogleMachineTranslationProperties(boolean defaultEnabled, boolean defaultPrimary, @org.jetbrains.annotations.Nullable()
    java.lang.String apiKey) {
        super();
    }
    
    @java.lang.Override()
    public boolean getDefaultEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setDefaultEnabled(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getDefaultPrimary() {
        return false;
    }
    
    @java.lang.Override()
    public void setDefaultPrimary(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getApiKey() {
        return null;
    }
    
    public final void setApiKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}