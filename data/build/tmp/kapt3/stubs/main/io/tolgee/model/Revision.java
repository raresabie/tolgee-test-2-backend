package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\n\u001a\u00020\u00048\u0012X\u0093D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0012X\u0093D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/tolgee/model/Revision;", "Ljava/io/Serializable;", "()V", "authorId", "", "getAuthorId", "()Ljava/lang/Long;", "setAuthorId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "id", "timestamp", "data"})
@org.hibernate.envers.RevisionEntity(value = io.tolgee.model.RevisionListener.class)
@javax.persistence.Entity()
public class Revision implements java.io.Serializable {
    @org.hibernate.envers.RevisionNumber()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "revisionSequenceGenerator")
    @org.hibernate.annotations.GenericGenerator(name = "revisionSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator")
    @javax.persistence.Id()
    private final long id = 0L;
    @org.hibernate.envers.RevisionTimestamp()
    private final long timestamp = 0L;
    
    /**
     * We don't want a foreign key, since user could have been deleted
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long authorId;
    
    public Revision() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getAuthorId() {
        return null;
    }
    
    public void setAuthorId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
}