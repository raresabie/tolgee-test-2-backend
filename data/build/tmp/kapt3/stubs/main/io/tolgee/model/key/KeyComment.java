package io.tolgee.model.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u0017H\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001d"}, d2 = {"Lio/tolgee/model/key/KeyComment;", "Lio/tolgee/model/StandardAuditModel;", "Lio/tolgee/model/key/WithKeyMetaReference;", "keyMeta", "Lio/tolgee/model/key/KeyMeta;", "author", "Lio/tolgee/model/UserAccount;", "(Lio/tolgee/model/key/KeyMeta;Lio/tolgee/model/UserAccount;)V", "getAuthor", "()Lio/tolgee/model/UserAccount;", "setAuthor", "(Lio/tolgee/model/UserAccount;)V", "fromImport", "", "getFromImport", "()Z", "setFromImport", "(Z)V", "getKeyMeta", "()Lio/tolgee/model/key/KeyMeta;", "setKeyMeta", "(Lio/tolgee/model/key/KeyMeta;)V", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "toString", "data"})
@javax.persistence.Entity()
public class KeyComment extends io.tolgee.model.StandardAuditModel implements io.tolgee.model.key.WithKeyMetaReference {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    private io.tolgee.model.key.KeyMeta keyMeta;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.LAZY)
    private io.tolgee.model.UserAccount author;
    private boolean fromImport = false;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @javax.persistence.Column(columnDefinition = "text", length = 2000)
    private java.lang.String text = "";
    
    public KeyComment(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.KeyMeta keyMeta, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount author) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.tolgee.model.key.KeyMeta getKeyMeta() {
        return null;
    }
    
    @java.lang.Override()
    public void setKeyMeta(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.KeyMeta p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.UserAccount getAuthor() {
        return null;
    }
    
    public void setAuthor(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount p0) {
    }
    
    public boolean getFromImport() {
        return false;
    }
    
    public void setFromImport(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getText() {
        return null;
    }
    
    public void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}