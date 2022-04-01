package io.tolgee.model.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nB\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u000bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0005\u001a\u00020\u00068\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"\u00a8\u0006%"}, d2 = {"Lio/tolgee/model/key/Key;", "Lio/tolgee/model/StandardAuditModel;", "Lio/tolgee/model/dataImport/WithKeyMeta;", "name", "", "project", "Lio/tolgee/model/Project;", "translations", "", "Lio/tolgee/model/translation/Translation;", "(Ljava/lang/String;Lio/tolgee/model/Project;Ljava/util/Set;)V", "(Ljava/lang/String;)V", "keyMeta", "Lio/tolgee/model/key/KeyMeta;", "getKeyMeta", "()Lio/tolgee/model/key/KeyMeta;", "setKeyMeta", "(Lio/tolgee/model/key/KeyMeta;)V", "getName", "()Ljava/lang/String;", "setName", "path", "Lio/tolgee/dtos/PathDTO;", "getPath", "()Lio/tolgee/dtos/PathDTO;", "getProject", "()Lio/tolgee/model/Project;", "setProject", "(Lio/tolgee/model/Project;)V", "screenshots", "Lio/tolgee/model/Screenshot;", "getScreenshots", "()Ljava/util/Set;", "setScreenshots", "(Ljava/util/Set;)V", "getTranslations", "setTranslations", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"project_id", "name"}, name = "key_project_id_name")})
@javax.persistence.Entity()
public class Key extends io.tolgee.model.StandardAuditModel implements io.tolgee.model.dataImport.WithKeyMeta {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(length = 2000)
    @javax.validation.constraints.Size(max = 2000)
    @javax.validation.constraints.NotBlank()
    private java.lang.String name;
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    public io.tolgee.model.Project project;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "key")
    private java.util.Set<io.tolgee.model.translation.Translation> translations;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne(mappedBy = "key")
    private io.tolgee.model.key.KeyMeta keyMeta;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "key")
    private java.util.Set<io.tolgee.model.Screenshot> screenshots;
    
    public Key() {
        super();
    }
    
    public Key(@org.jetbrains.annotations.NotNull()
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
    public io.tolgee.model.Project getProject() {
        return null;
    }
    
    public void setProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.translation.Translation> getTranslations() {
        return null;
    }
    
    public void setTranslations(@org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.model.translation.Translation> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.Screenshot> getScreenshots() {
        return null;
    }
    
    public void setScreenshots(@org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.model.Screenshot> p0) {
    }
    
    public Key(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.model.translation.Translation> translations) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.dtos.PathDTO getPath() {
        return null;
    }
}