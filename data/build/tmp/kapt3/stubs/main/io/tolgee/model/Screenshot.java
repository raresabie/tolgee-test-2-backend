package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0097\b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0007R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lio/tolgee/model/Screenshot;", "Lio/tolgee/model/AuditModel;", "id", "", "key", "Lio/tolgee/model/key/Key;", "(JLio/tolgee/model/key/Key;)V", "(J)V", "filename", "", "getFilename", "()Ljava/lang/String;", "getId", "()J", "setId", "getKey$annotations", "()V", "getKey", "()Lio/tolgee/model/key/Key;", "setKey", "(Lio/tolgee/model/key/Key;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Entity()
public class Screenshot extends io.tolgee.model.AuditModel {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private long id;
    @javax.persistence.ManyToOne(optional = false)
    public io.tolgee.model.key.Key key;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Screenshot copy(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Screenshot() {
        super();
    }
    
    public Screenshot(long id) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public long getId() {
        return 0L;
    }
    
    public void setId(long p0) {
    }
    
    public Screenshot(long id, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Key getKey() {
        return null;
    }
    
    @kotlin.Suppress(names = {"JoinDeclarationAndAssignment"})
    @java.lang.Deprecated()
    public static void getKey$annotations() {
    }
    
    public void setKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFilename() {
        return null;
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