package io.tolgee.model.dataImport.issues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lio/tolgee/model/dataImport/issues/ImportFileIssue;", "Lio/tolgee/model/StandardAuditModel;", "file", "Lio/tolgee/model/dataImport/ImportFile;", "type", "Lio/tolgee/model/dataImport/issues/issueTypes/FileIssueType;", "params", "", "Lio/tolgee/model/dataImport/issues/ImportFileIssueParam;", "(Lio/tolgee/model/dataImport/ImportFile;Lio/tolgee/model/dataImport/issues/issueTypes/FileIssueType;Ljava/util/List;)V", "getFile", "()Lio/tolgee/model/dataImport/ImportFile;", "setFile", "(Lio/tolgee/model/dataImport/ImportFile;)V", "getParams", "()Ljava/util/List;", "setParams", "(Ljava/util/List;)V", "getType", "()Lio/tolgee/model/dataImport/issues/issueTypes/FileIssueType;", "setType", "(Lio/tolgee/model/dataImport/issues/issueTypes/FileIssueType;)V", "data"})
@javax.persistence.Entity()
public class ImportFileIssue extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    private io.tolgee.model.dataImport.ImportFile file;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated()
    private io.tolgee.model.dataImport.issues.issueTypes.FileIssueType type;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToMany(mappedBy = "issue")
    private java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssueParam> params;
    
    public ImportFileIssue(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportFile file, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.issues.issueTypes.FileIssueType type, @org.jetbrains.annotations.Nullable()
    java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssueParam> params) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.ImportFile getFile() {
        return null;
    }
    
    public void setFile(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.issues.issueTypes.FileIssueType getType() {
        return null;
    }
    
    public void setType(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.issues.issueTypes.FileIssueType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssueParam> getParams() {
        return null;
    }
    
    public void setParams(@org.jetbrains.annotations.Nullable()
    java.util.List<io.tolgee.model.dataImport.issues.ImportFileIssueParam> p0) {
    }
}