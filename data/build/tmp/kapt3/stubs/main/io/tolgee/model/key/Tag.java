package io.tolgee.model.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lio/tolgee/model/key/Tag;", "Lio/tolgee/model/StandardAuditModel;", "()V", "keyMetas", "", "Lio/tolgee/model/key/KeyMeta;", "getKeyMetas", "()Ljava/util/Set;", "setKeyMetas", "(Ljava/util/Set;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "project", "Lio/tolgee/model/Project;", "getProject", "()Lio/tolgee/model/Project;", "setProject", "(Lio/tolgee/model/Project;)V", "equals", "", "other", "", "hashCode", "", "data"})
@javax.persistence.Entity()
public class Tag extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotEmpty()
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne()
    private io.tolgee.model.Project project;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OrderBy(value = "id")
    @javax.persistence.ManyToMany(mappedBy = "tags")
    private java.util.Set<io.tolgee.model.key.KeyMeta> keyMetas;
    
    public Tag() {
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
    public java.util.Set<io.tolgee.model.key.KeyMeta> getKeyMetas() {
        return null;
    }
    
    public void setKeyMetas(@org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.model.key.KeyMeta> p0) {
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