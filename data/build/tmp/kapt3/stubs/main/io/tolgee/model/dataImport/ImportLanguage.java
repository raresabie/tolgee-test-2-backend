package io.tolgee.model.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lio/tolgee/model/dataImport/ImportLanguage;", "Lio/tolgee/model/StandardAuditModel;", "name", "", "file", "Lio/tolgee/model/dataImport/ImportFile;", "(Ljava/lang/String;Lio/tolgee/model/dataImport/ImportFile;)V", "existingLanguage", "Lio/tolgee/model/Language;", "getExistingLanguage", "()Lio/tolgee/model/Language;", "setExistingLanguage", "(Lio/tolgee/model/Language;)V", "getFile", "()Lio/tolgee/model/dataImport/ImportFile;", "setFile", "(Lio/tolgee/model/dataImport/ImportFile;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "translations", "", "Lio/tolgee/model/dataImport/ImportTranslation;", "getTranslations", "()Ljava/util/List;", "setTranslations", "(Ljava/util/List;)V", "data"})
@javax.persistence.Entity()
public class ImportLanguage extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(length = 2000)
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    private io.tolgee.model.dataImport.ImportFile file;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "language")
    private java.util.List<io.tolgee.model.dataImport.ImportTranslation> translations;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.ManyToOne()
    private io.tolgee.model.Language existingLanguage;
    
    public ImportLanguage(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 2000)
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportFile file) {
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
    public io.tolgee.model.dataImport.ImportFile getFile() {
        return null;
    }
    
    public void setFile(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportTranslation> getTranslations() {
        return null;
    }
    
    public void setTranslations(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.dataImport.ImportTranslation> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Language getExistingLanguage() {
        return null;
    }
    
    public void setExistingLanguage(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Language p0) {
    }
}