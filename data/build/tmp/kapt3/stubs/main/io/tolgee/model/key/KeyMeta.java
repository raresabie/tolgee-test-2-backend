package io.tolgee.model.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001)B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J-\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0&\u00a2\u0006\u0002\b\'H\u0016J-\u0010(\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0&\u00a2\u0006\u0002\b\'H\u0016R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006*"}, d2 = {"Lio/tolgee/model/key/KeyMeta;", "Lio/tolgee/model/StandardAuditModel;", "key", "Lio/tolgee/model/key/Key;", "importKey", "Lio/tolgee/model/dataImport/ImportKey;", "(Lio/tolgee/model/key/Key;Lio/tolgee/model/dataImport/ImportKey;)V", "codeReferences", "", "Lio/tolgee/model/key/KeyCodeReference;", "getCodeReferences", "()Ljava/util/List;", "setCodeReferences", "(Ljava/util/List;)V", "comments", "Lio/tolgee/model/key/KeyComment;", "getComments", "setComments", "getImportKey", "()Lio/tolgee/model/dataImport/ImportKey;", "setImportKey", "(Lio/tolgee/model/dataImport/ImportKey;)V", "getKey", "()Lio/tolgee/model/key/Key;", "setKey", "(Lio/tolgee/model/key/Key;)V", "tags", "", "Lio/tolgee/model/key/Tag;", "getTags", "()Ljava/util/Set;", "setTags", "(Ljava/util/Set;)V", "addCodeReference", "", "author", "Lio/tolgee/model/UserAccount;", "ft", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "addComment", "Companion", "data"})
@javax.persistence.EntityListeners(value = {io.tolgee.model.key.KeyMeta.Companion.KeyMetaListener.class})
@javax.persistence.Entity()
public class KeyMeta extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne()
    private io.tolgee.model.key.Key key;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne()
    private io.tolgee.model.dataImport.ImportKey importKey;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OrderBy(value = "id")
    @javax.persistence.OneToMany(mappedBy = "keyMeta")
    private java.util.List<io.tolgee.model.key.KeyComment> comments;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OrderBy(value = "id")
    @javax.persistence.OneToMany(mappedBy = "keyMeta")
    private java.util.List<io.tolgee.model.key.KeyCodeReference> codeReferences;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OrderBy(value = "id")
    @javax.persistence.ManyToMany()
    private java.util.Set<io.tolgee.model.key.Tag> tags;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.model.key.KeyMeta.Companion Companion = null;
    
    public KeyMeta() {
        super();
    }
    
    public KeyMeta(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.dataImport.ImportKey importKey) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.key.Key getKey() {
        return null;
    }
    
    public void setKey(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.key.Key p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.dataImport.ImportKey getImportKey() {
        return null;
    }
    
    public void setImportKey(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.dataImport.ImportKey p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.KeyComment> getComments() {
        return null;
    }
    
    public void setComments(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.key.KeyComment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.KeyCodeReference> getCodeReferences() {
        return null;
    }
    
    public void setCodeReferences(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.key.KeyCodeReference> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.key.Tag> getTags() {
        return null;
    }
    
    public void setTags(@org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.model.key.Tag> p0) {
    }
    
    public void addComment(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount author, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.tolgee.model.key.KeyComment, kotlin.Unit> ft) {
    }
    
    public void addCodeReference(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount author, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.tolgee.model.key.KeyCodeReference, kotlin.Unit> ft) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/tolgee/model/key/KeyMeta$Companion;", "", "()V", "KeyMetaListener", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lio/tolgee/model/key/KeyMeta$Companion$KeyMetaListener;", "", "()V", "preSave", "", "keyMeta", "Lio/tolgee/model/key/KeyMeta;", "data"})
        public static final class KeyMetaListener {
            
            public KeyMetaListener() {
                super();
            }
            
            @javax.persistence.PreUpdate()
            @javax.persistence.PrePersist()
            public final void preSave(@org.jetbrains.annotations.NotNull()
            io.tolgee.model.key.KeyMeta keyMeta) {
            }
        }
    }
}