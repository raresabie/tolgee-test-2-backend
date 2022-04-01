package io.tolgee.component.fileStorage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH&\u00a8\u0006\f"}, d2 = {"Lio/tolgee/component/fileStorage/FileStorage;", "", "deleteFile", "", "storageFilePath", "", "fileExists", "", "readFile", "", "storeFile", "bytes", "data"})
public abstract interface FileStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract byte[] readFile(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath);
    
    public abstract void deleteFile(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath);
    
    public abstract void storeFile(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath, @org.jetbrains.annotations.NotNull()
    byte[] bytes);
    
    public abstract boolean fileExists(@org.jetbrains.annotations.NotNull()
    java.lang.String storageFilePath);
}