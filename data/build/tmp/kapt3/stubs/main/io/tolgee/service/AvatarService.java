package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0012J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/tolgee/service/AvatarService;", "", "fileStorage", "Lio/tolgee/component/fileStorage/FileStorage;", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "(Lio/tolgee/component/fileStorage/FileStorage;Lio/tolgee/configuration/tolgee/TolgeeProperties;)V", "getAvatarLinks", "Lio/tolgee/dtos/Avatar;", "paths", "hash", "", "prepareAvatar", "", "kotlin.jvm.PlatformType", "avatarBytes", "dimension", "Ljava/awt/Dimension;", "removeAvatar", "", "entity", "Lio/tolgee/model/ModelWithAvatar;", "setAvatar", "avatar", "Ljava/io/InputStream;", "storeAvatarFiles", "unlinkAvatarFiles", "Companion", "data"})
@org.springframework.stereotype.Service()
public class AvatarService {
    private final io.tolgee.component.fileStorage.FileStorage fileStorage = null;
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.AvatarService.Companion Companion = null;
    
    public AvatarService(@org.jetbrains.annotations.NotNull()
    io.tolgee.component.fileStorage.FileStorage fileStorage, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String storeAvatarFiles(@org.jetbrains.annotations.NotNull()
    java.io.InputStream avatar, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.ModelWithAvatar entity) {
        return null;
    }
    
    private byte[] prepareAvatar(byte[] avatarBytes, java.awt.Dimension dimension) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void setAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.ModelWithAvatar entity, @org.jetbrains.annotations.NotNull()
    java.io.InputStream avatar) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void removeAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.ModelWithAvatar entity) {
    }
    
    public void unlinkAvatarFiles(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.ModelWithAvatar entity) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.dtos.Avatar getAvatarLinks(@org.jetbrains.annotations.Nullable()
    java.lang.String hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.dtos.Avatar getAvatarLinks(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.Avatar paths) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/tolgee/service/AvatarService$Companion;", "", "()V", "getAvatarPaths", "Lio/tolgee/dtos/Avatar;", "hash", "", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.dtos.Avatar getAvatarPaths(@org.jetbrains.annotations.NotNull()
        java.lang.String hash) {
            return null;
        }
    }
}