package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/model/MtCreditBucket;", "Lio/tolgee/model/StandardAuditModel;", "userAccount", "Lio/tolgee/model/UserAccount;", "organization", "Lio/tolgee/model/Organization;", "(Lio/tolgee/model/UserAccount;Lio/tolgee/model/Organization;)V", "credits", "", "getCredits", "()J", "setCredits", "(J)V", "getOrganization", "()Lio/tolgee/model/Organization;", "setOrganization", "(Lio/tolgee/model/Organization;)V", "refilled", "Ljava/util/Date;", "getRefilled", "()Ljava/util/Date;", "setRefilled", "(Ljava/util/Date;)V", "getUserAccount", "()Lio/tolgee/model/UserAccount;", "setUserAccount", "(Lio/tolgee/model/UserAccount;)V", "data"})
@javax.persistence.Entity()
public class MtCreditBucket extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne()
    private io.tolgee.model.UserAccount userAccount;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne()
    private io.tolgee.model.Organization organization;
    private long credits = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date refilled;
    
    public MtCreditBucket() {
        super();
    }
    
    public MtCreditBucket(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Organization organization) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.UserAccount getUserAccount() {
        return null;
    }
    
    public void setUserAccount(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Organization getOrganization() {
        return null;
    }
    
    public void setOrganization(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Organization p0) {
    }
    
    public long getCredits() {
        return 0L;
    }
    
    public void setCredits(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Date getRefilled() {
        return null;
    }
    
    public void setRefilled(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
}