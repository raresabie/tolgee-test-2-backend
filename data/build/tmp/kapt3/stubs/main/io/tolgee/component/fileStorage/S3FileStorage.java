package io.tolgee.component.fileStorage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/component/fileStorage/S3FileStorage;", "Lio/tolgee/component/fileStorage/FileStorage;", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "s3", "Lcom/amazonaws/services/s3/AmazonS3;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;Lcom/amazonaws/services/s3/AmazonS3;)V", "bucketName", "", "deleteFile", "", "storageFilePath", "fileExists", "", "readFile", "", "storeFile", "bytes", "data"})
public final class S3FileStorage implements io.tolgee.component.fileStorage.FileStorage {
    private final com.amazonaws.services.s3.AmazonS3 s3 = null;
    private final java.lang.String bucketName = null;
    
    public S3FileStorage(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    com.amazonaws.services.s3.AmazonS3 s3) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public byte[] readFile(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath) {
    }
    
    @java.lang.Override()
    public void storeFile(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath, @org.jetbrains.annotations.NotNull()
    byte[] bytes) {
    }
    
    @java.lang.Override()
    public boolean fileExists(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath) {
        return false;
    }
}