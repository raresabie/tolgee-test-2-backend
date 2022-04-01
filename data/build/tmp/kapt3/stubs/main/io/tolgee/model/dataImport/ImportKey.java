package io.tolgee.model.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\f\u00a8\u0006 "}, d2 = {"Lio/tolgee/model/dataImport/ImportKey;", "Lio/tolgee/model/StandardAuditModel;", "Lio/tolgee/model/dataImport/WithKeyMeta;", "name", "", "(Ljava/lang/String;)V", "files", "", "Lio/tolgee/model/dataImport/ImportFile;", "getFiles", "()Ljava/util/List;", "setFiles", "(Ljava/util/List;)V", "keyMeta", "Lio/tolgee/model/key/KeyMeta;", "getKeyMeta", "()Lio/tolgee/model/key/KeyMeta;", "setKeyMeta", "(Lio/tolgee/model/key/KeyMeta;)V", "getName", "()Ljava/lang/String;", "setName", "translations", "Lio/tolgee/model/dataImport/ImportTranslation;", "getTranslations", "setTranslations", "equals", "", "other", "", "hashCode", "", "data"})
@javax.persistence.Entity()
public class ImportKey extends io.tolgee.model.StandardAuditModel implements io.tolgee.model.dataImport.WithKeyMeta {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 2000)
    @javax.validation.constraints.NotBlank()
    @javax.persistence.Column(length = 2000)
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotEmpty()
    @javax.persistence.ManyToMany(mappedBy = "keys")
    private java.util.List<io.tolgee.model.dataImport.ImportFile> files;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "key")
    private java.util.List<io.tolgee.model.dataImport.ImportTranslation> translations;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne(mappedBy = "importKey")
    private io.tolgee.model.key.KeyMeta keyMeta;
    
    public ImportKey(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportFile> getFiles() {
        return null;
    }
    
    public void setFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.dataImport.ImportFile> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportTranslation> getTranslations() {
        return null;
    }
    
    public void setTranslations(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.dataImport.ImportTranslation> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.tolgee.model.key.KeyMeta getKeyMeta() {
        return null;
    }
    
    @java.lang.Override()
    public void setKeyMeta(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.key.KeyMeta p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}