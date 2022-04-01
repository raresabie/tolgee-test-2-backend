package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/configuration/tolgee/S3Settings;", "", "enabled", "", "accessKey", "", "secretKey", "endpoint", "signingRegion", "bucketName", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessKey", "()Ljava/lang/String;", "setAccessKey", "(Ljava/lang/String;)V", "getBucketName", "setBucketName", "getEnabled", "()Z", "setEnabled", "(Z)V", "getEndpoint", "setEndpoint", "getSecretKey", "setSecretKey", "getSigningRegion", "setSigningRegion", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.file-storage.s3")
public final class S3Settings {
    private boolean enabled;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String accessKey;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secretKey;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String endpoint;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String signingRegion;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String bucketName;
    
    public S3Settings() {
        super();
    }
    
    public S3Settings(boolean enabled, @org.jetbrains.annotations.Nullable()
    java.lang.String accessKey, @org.jetbrains.annotations.Nullable()
    java.lang.String secretKey, @org.jetbrains.annotations.Nullable()
    java.lang.String endpoint, @org.jetbrains.annotations.Nullable()
    java.lang.String signingRegion, @org.jetbrains.annotations.Nullable()
    java.lang.String bucketName) {
        super();
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
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
    public final java.lang.String getEndpoint() {
        return null;
    }
    
    public final void setEndpoint(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSigningRegion() {
        return null;
    }
    
    public final void setSigningRegion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBucketName() {
        return null;
    }
    
    public final void setBucketName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}