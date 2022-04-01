package io.tolgee.model.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/model/dataImport/Import;", "Lio/tolgee/model/StandardAuditModel;", "author", "Lio/tolgee/model/UserAccount;", "project", "Lio/tolgee/model/Project;", "(Lio/tolgee/model/UserAccount;Lio/tolgee/model/Project;)V", "getAuthor", "()Lio/tolgee/model/UserAccount;", "files", "", "Lio/tolgee/model/dataImport/ImportFile;", "getFiles", "()Ljava/util/List;", "setFiles", "(Ljava/util/List;)V", "getProject", "()Lio/tolgee/model/Project;", "data"})
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"author_id", "project_id"})})
@javax.persistence.Entity()
public class Import extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    private final io.tolgee.model.UserAccount author = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    private final io.tolgee.model.Project project = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "import")
    private java.util.List<io.tolgee.model.dataImport.ImportFile> files;
    
    public Import(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount author, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project getProject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.dataImport.ImportFile> getFiles() {
        return null;
    }
    
    public void setFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.dataImport.ImportFile> p0) {
    }
}