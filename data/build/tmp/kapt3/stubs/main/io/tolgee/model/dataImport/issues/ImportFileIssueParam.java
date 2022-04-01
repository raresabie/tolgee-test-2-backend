package io.tolgee.model.dataImport.issues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/model/dataImport/issues/ImportFileIssueParam;", "Lio/tolgee/model/StandardAuditModel;", "issue", "Lio/tolgee/model/dataImport/issues/ImportFileIssue;", "type", "Lio/tolgee/model/dataImport/issues/paramTypes/FileIssueParamType;", "value", "", "(Lio/tolgee/model/dataImport/issues/ImportFileIssue;Lio/tolgee/model/dataImport/issues/paramTypes/FileIssueParamType;Ljava/lang/String;)V", "getIssue", "()Lio/tolgee/model/dataImport/issues/ImportFileIssue;", "getType", "()Lio/tolgee/model/dataImport/issues/paramTypes/FileIssueParamType;", "getValue", "()Ljava/lang/String;", "data"})
@javax.persistence.Entity()
public class ImportFileIssueParam extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    private final io.tolgee.model.dataImport.issues.ImportFileIssue issue = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated()
    private final io.tolgee.model.dataImport.issues.paramTypes.FileIssueParamType type = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String value = null;
    
    public ImportFileIssueParam(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.issues.ImportFileIssue issue, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.issues.paramTypes.FileIssueParamType type, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.issues.ImportFileIssue getIssue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.issues.paramTypes.FileIssueParamType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getValue() {
        return null;
    }
}