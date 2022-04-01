package io.tolgee.model.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00030&H\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u0003H\u0016J\"\u0010/\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u00010-H\u0016J\f\u00101\u001a\u00020\u0003*\u00020\u0003H\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00008\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00062"}, d2 = {"Lio/tolgee/model/dataImport/ImportFile;", "Lio/tolgee/model/StandardAuditModel;", "name", "", "import", "Lio/tolgee/model/dataImport/Import;", "(Ljava/lang/String;Lio/tolgee/model/dataImport/Import;)V", "archive", "getArchive", "()Lio/tolgee/model/dataImport/ImportFile;", "setArchive", "(Lio/tolgee/model/dataImport/ImportFile;)V", "getImport", "()Lio/tolgee/model/dataImport/Import;", "issues", "", "Lio/tolgee/model/dataImport/issues/ImportFileIssue;", "getIssues", "()Ljava/util/List;", "setIssues", "(Ljava/util/List;)V", "keys", "Lio/tolgee/model/dataImport/ImportKey;", "getKeys", "setKeys", "languages", "Lio/tolgee/model/dataImport/ImportLanguage;", "getLanguages", "setLanguages", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "addIssue", "", "type", "Lio/tolgee/model/dataImport/issues/issueTypes/FileIssueType;", "params", "", "Lio/tolgee/model/dataImport/issues/paramTypes/FileIssueParamType;", "addKeyIsEmptyIssue", "keyIndex", "", "addKeyIsNotStringIssue", "keyName", "", "addValueIsEmptyIssue", "addValueIsNotStringIssue", "value", "shortenWithEllipsis", "data"})
@javax.persistence.Entity()
public class ImportFile extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 2000)
    @javax.persistence.Column(length = 2000)
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "file")
    private java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssue> issues;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToMany()
    private java.util.List<io.tolgee.model.dataImport.ImportKey> keys;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "file")
    private java.util.List<io.tolgee.model.dataImport.ImportLanguage> languages;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.ManyToOne()
    private io.tolgee.model.dataImport.ImportFile archive;
    
    public ImportFile(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p1_1555085778) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.Import getImport() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssue> getIssues() {
        return null;
    }
    
    public void setIssues(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssue> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportKey> getKeys() {
        return null;
    }
    
    public void setKeys(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.dataImport.ImportKey> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportLanguage> getLanguages() {
        return null;
    }
    
    public void setLanguages(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.dataImport.ImportLanguage> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.dataImport.ImportFile getArchive() {
        return null;
    }
    
    public void setArchive(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.dataImport.ImportFile p0) {
    }
    
    public void addIssue(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.issues.issueTypes.FileIssueType type, @org.jetbrains.annotations.NotNull()
    java.util.Map<io.tolgee.model.dataImport.issues.paramTypes.FileIssueParamType, java.lang.String> params) {
    }
    
    public void addKeyIsNotStringIssue(@org.jetbrains.annotations.NotNull()
    java.lang.Object keyName, int keyIndex) {
    }
    
    public void addValueIsNotStringIssue(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName, int keyIndex, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public void addKeyIsEmptyIssue(int keyIndex) {
    }
    
    public void addValueIsEmptyIssue(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName) {
    }
    
    private java.lang.String shortenWithEllipsis(java.lang.String $this$shortenWithEllipsis) {
        return null;
    }
}