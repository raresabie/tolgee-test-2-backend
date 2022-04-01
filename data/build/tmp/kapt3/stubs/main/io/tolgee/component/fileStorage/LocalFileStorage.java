package io.tolgee.component.fileStorage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/component/fileStorage/LocalFileStorage;", "Lio/tolgee/component/fileStorage/FileStorage;", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;)V", "localDataPath", "", "deleteFile", "", "storageFilePath", "fileExists", "", "getLocalFile", "Ljava/io/File;", "readFile", "", "storeFile", "bytes", "data"})
public final class LocalFileStorage implements io.tolgee.component.fileStorage.FileStorage {
    private final java.lang.String localDataPath = null;
    
    public LocalFileStorage(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties) {
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
    
    private final java.io.File getLocalFile(java.lang.String storageFilePath) {
        return null;
    }
}