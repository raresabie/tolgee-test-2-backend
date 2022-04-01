package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/model/UploadedImage;", "Lio/tolgee/model/StandardAuditModel;", "filename", "", "userAccount", "Lio/tolgee/model/UserAccount;", "(Ljava/lang/String;Lio/tolgee/model/UserAccount;)V", "getFilename", "()Ljava/lang/String;", "setFilename", "(Ljava/lang/String;)V", "filenameWithExtension", "getFilenameWithExtension", "getUserAccount", "()Lio/tolgee/model/UserAccount;", "setUserAccount", "(Lio/tolgee/model/UserAccount;)V", "data"})
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"filename"}, name = "uploaded_image_filename")})
@javax.persistence.Entity()
public class UploadedImage extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filename;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private io.tolgee.model.UserAccount userAccount;
    
    public UploadedImage(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFilename() {
        return null;
    }
    
    public void setFilename(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount getUserAccount() {
        return null;
    }
    
    public void setUserAccount(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFilenameWithExtension() {
        return null;
    }
}