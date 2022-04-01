package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/configuration/tolgee/FileStorageProperties;", "", "s3", "Lio/tolgee/configuration/tolgee/S3Settings;", "fsDataPath", "", "(Lio/tolgee/configuration/tolgee/S3Settings;Ljava/lang/String;)V", "getFsDataPath", "()Ljava/lang/String;", "setFsDataPath", "(Ljava/lang/String;)V", "getS3", "()Lio/tolgee/configuration/tolgee/S3Settings;", "setS3", "(Lio/tolgee/configuration/tolgee/S3Settings;)V", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.file-storage")
public final class FileStorageProperties {
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.configuration.tolgee.S3Settings s3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fsDataPath;
    
    public FileStorageProperties() {
        super();
    }
    
    public FileStorageProperties(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.S3Settings s3, @org.jetbrains.annotations.NotNull()
    java.lang.String fsDataPath) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.configuration.tolgee.S3Settings getS3() {
        return null;
    }
    
    public final void setS3(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.S3Settings p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFsDataPath() {
        return null;
    }
    
    public final void setFsDataPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}