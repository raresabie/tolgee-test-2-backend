package io.tolgee.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\bH\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0092.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/tolgee/security/InitialPasswordManager;", "", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "fileStorage", "Lio/tolgee/component/fileStorage/FileStorage;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/component/fileStorage/FileStorage;)V", "cachedInitialPassword", "", "initialPassword", "getInitialPassword", "()Ljava/lang/String;", "generatePassword", "data"})
@org.springframework.stereotype.Component()
public class InitialPasswordManager {
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final io.tolgee.component.fileStorage.FileStorage fileStorage = null;
    private java.lang.String cachedInitialPassword;
    
    public InitialPasswordManager(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.fileStorage.FileStorage fileStorage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getInitialPassword() {
        return null;
    }
    
    private java.lang.String generatePassword() {
        return null;
    }
}