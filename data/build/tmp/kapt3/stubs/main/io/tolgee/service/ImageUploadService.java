package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 +2\u00020\u0001:\u0001+B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0017J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0016H\u0017J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0012J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0016J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0017J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020*H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006,"}, d2 = {"Lio/tolgee/service/ImageUploadService;", "", "uploadedImageRepository", "Lio/tolgee/repository/UploadedImageRepository;", "fileStorage", "Lio/tolgee/component/fileStorage/FileStorage;", "dateProvider", "Lio/tolgee/component/CurrentDateProvider;", "(Lio/tolgee/repository/UploadedImageRepository;Lio/tolgee/component/fileStorage/FileStorage;Lio/tolgee/component/CurrentDateProvider;)V", "getDateProvider", "()Lio/tolgee/component/CurrentDateProvider;", "getFileStorage", "()Lio/tolgee/component/fileStorage/FileStorage;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger", "()Lorg/slf4j/Logger;", "getUploadedImageRepository", "()Lio/tolgee/repository/UploadedImageRepository;", "filePath", "", "Lio/tolgee/model/UploadedImage;", "getFilePath", "(Lio/tolgee/model/UploadedImage;)Ljava/lang/String;", "cleanOldImages", "", "delete", "uploadedImage", "find", "", "ids", "", "", "generateFilename", "save", "image", "store", "Lorg/springframework/core/io/InputStreamSource;", "userAccount", "Lio/tolgee/model/UserAccount;", "validateIsImage", "Lorg/springframework/web/multipart/MultipartFile;", "Companion", "data"})
@org.springframework.stereotype.Service()
public class ImageUploadService {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.repository.UploadedImageRepository uploadedImageRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.component.fileStorage.FileStorage fileStorage = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.component.CurrentDateProvider dateProvider = null;
    private final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.ImageUploadService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPLOADED_IMAGES_STORAGE_FOLDER_NAME = "uploadedImages";
    
    public ImageUploadService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.UploadedImageRepository uploadedImageRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.fileStorage.FileStorage fileStorage, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.CurrentDateProvider dateProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.repository.UploadedImageRepository getUploadedImageRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.component.fileStorage.FileStorage getFileStorage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.component.CurrentDateProvider getDateProvider() {
        return null;
    }
    
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.UploadedImage store(@org.jetbrains.annotations.NotNull()
    org.springframework.core.io.InputStreamSource image, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void delete(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UploadedImage uploadedImage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.UploadedImage> find(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids) {
        return null;
    }
    
    @org.springframework.scheduling.annotation.Scheduled(fixedRate = 60000L)
    @org.springframework.transaction.annotation.Transactional()
    public void cleanOldImages() {
    }
    
    private java.lang.String generateFilename() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UploadedImage save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UploadedImage image) {
        return null;
    }
    
    public void validateIsImage(@org.jetbrains.annotations.NotNull()
    org.springframework.web.multipart.MultipartFile image) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFilePath(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UploadedImage $this$filePath) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/tolgee/service/ImageUploadService$Companion;", "", "()V", "UPLOADED_IMAGES_STORAGE_FOLDER_NAME", "", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}