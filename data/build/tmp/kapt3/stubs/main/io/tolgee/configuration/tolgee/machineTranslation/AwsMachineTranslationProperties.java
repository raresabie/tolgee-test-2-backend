package io.tolgee.configuration.tolgee.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lio/tolgee/configuration/tolgee/machineTranslation/AwsMachineTranslationProperties;", "Lio/tolgee/configuration/tolgee/machineTranslation/MachineTranslationServiceProperties;", "defaultEnabled", "", "defaultPrimary", "accessKey", "", "secretKey", "region", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessKey", "()Ljava/lang/String;", "setAccessKey", "(Ljava/lang/String;)V", "getDefaultEnabled", "()Z", "setDefaultEnabled", "(Z)V", "getDefaultPrimary", "setDefaultPrimary", "getRegion", "setRegion", "getSecretKey", "setSecretKey", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.machine-translation.aws")
public class AwsMachineTranslationProperties implements io.tolgee.configuration.tolgee.machineTranslation.MachineTranslationServiceProperties {
    private boolean defaultEnabled;
    private boolean defaultPrimary;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String accessKey;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secretKey;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String region;
    
    public AwsMachineTranslationProperties() {
        super();
    }
    
    public AwsMachineTranslationProperties(boolean defaultEnabled, boolean defaultPrimary, @org.jetbrains.annotations.Nullable()
    java.lang.String accessKey, @org.jetbrains.annotations.Nullable()
    java.lang.String secretKey, @org.jetbrains.annotations.Nullable()
    java.lang.String region) {
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
    public final java.lang.String getAccessKey() {
        return null;
    }
    
    public final void setAccessKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecretKey() {
        return null;
    }
    
    public final void setSecretKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegion() {
        return null;
    }
    
    public final void setRegion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}