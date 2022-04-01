package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lio/tolgee/configuration/tolgee/ReCaptchaProperties;", "", "()V", "secretKey", "", "getSecretKey$annotations", "getSecretKey", "()Ljava/lang/String;", "setSecretKey", "(Ljava/lang/String;)V", "siteKey", "getSiteKey$annotations", "getSiteKey", "setSiteKey", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.recaptcha")
public final class ReCaptchaProperties {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String siteKey;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secretKey;
    
    public ReCaptchaProperties() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSiteKey() {
        return null;
    }
    
    @E2eRuntimeMutable()
    @java.lang.Deprecated()
    public static void getSiteKey$annotations() {
    }
    
    public final void setSiteKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecretKey() {
        return null;
    }
    
    @E2eRuntimeMutable()
    @java.lang.Deprecated()
    public static void getSecretKey$annotations() {
    }
    
    public final void setSecretKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}