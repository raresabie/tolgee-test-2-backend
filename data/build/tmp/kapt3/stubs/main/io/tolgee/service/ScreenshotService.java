package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 .2\u00020\u0001:\u0001.B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0017J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0011H\u0012J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010#\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0016J\u001e\u0010$\u001a\u00020\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\f\u0010,\u001a\u00020-*\u00020\u0011H\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lio/tolgee/service/ScreenshotService;", "", "screenshotRepository", "Lio/tolgee/repository/ScreenshotRepository;", "fileStorage", "Lio/tolgee/component/fileStorage/FileStorage;", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "imageUploadService", "Lio/tolgee/service/ImageUploadService;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "(Lio/tolgee/repository/ScreenshotRepository;Lio/tolgee/component/fileStorage/FileStorage;Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/service/ImageUploadService;Lio/tolgee/security/AuthenticationFacade;)V", "delete", "", "screenshots", "", "Lio/tolgee/model/Screenshot;", "deleteAllByKeyId", "keyId", "", "keyIds", "deleteAllByProject", "projectId", "deleteFile", "screenshot", "findAll", "", "key", "Lio/tolgee/model/key/Key;", "findByIdIn", "", "ids", "getKeysWithScreenshots", "getScreenshotsCountForKey", "saveAll", "saveUploadedImages", "uploadedImageIds", "store", "screenshotImage", "Lorg/springframework/core/io/InputStreamSource;", "storeProcessed", "image", "", "getFilePath", "", "Companion", "data"})
@org.springframework.stereotype.Service()
public class ScreenshotService {
    private final io.tolgee.repository.ScreenshotRepository screenshotRepository = null;
    private final io.tolgee.component.fileStorage.FileStorage fileStorage = null;
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final io.tolgee.service.ImageUploadService imageUploadService = null;
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.ScreenshotService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCREENSHOTS_STORAGE_FOLDER_NAME = "screenshots";
    
    public ScreenshotService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.ScreenshotRepository screenshotRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.fileStorage.FileStorage fileStorage, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ImageUploadService imageUploadService, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Screenshot store(@org.jetbrains.annotations.NotNull()
    org.springframework.core.io.InputStreamSource screenshotImage, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Screenshot storeProcessed(@org.jetbrains.annotations.NotNull()
    byte[] image, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void saveUploadedImages(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> uploadedImageIds, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.Screenshot> findAll(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.Screenshot> screenshots) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.Screenshot> findByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids) {
        return null;
    }
    
    public void deleteAllByProject(long projectId) {
    }
    
    public void deleteAllByKeyId(long keyId) {
    }
    
    public void deleteAllByKeyId(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> keyIds) {
    }
    
    private void deleteFile(io.tolgee.model.Screenshot screenshot) {
    }
    
    private java.lang.String getFilePath(io.tolgee.model.Screenshot $this$getFilePath) {
        return null;
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.Screenshot> screenshots) {
    }
    
    public long getScreenshotsCountForKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.Key> getKeysWithScreenshots(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/tolgee/service/ScreenshotService$Companion;", "", "()V", "SCREENSHOTS_STORAGE_FOLDER_NAME", "", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}