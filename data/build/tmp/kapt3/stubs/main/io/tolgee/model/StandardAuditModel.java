package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/model/StandardAuditModel;", "Lio/tolgee/model/AuditModel;", "()V", "id", "", "getId", "()J", "equals", "", "other", "", "hashCode", "", "toString", "", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.MappedSuperclass()
public abstract class StandardAuditModel extends io.tolgee.model.AuditModel {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @javax.persistence.SequenceGenerator(name = "sequenceGenerator", sequenceName = "hibernate_sequence", initialValue = 1000000000, allocationSize = 100)
    @javax.persistence.Id()
    private final long id = 0L;
    
    public StandardAuditModel() {
        super();
    }
    
    public long getId() {
        return 0L;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}