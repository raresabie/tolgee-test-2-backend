package io.tolgee.service.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0012J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0012J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u001d\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0016J\f\u0010 \u001a\u00020!*\u00020\fH\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/tolgee/service/machineTranslation/MtCreditBucketService;", "", "machineTranslationCreditBucketRepository", "Lio/tolgee/repository/machineTranslation/MachineTranslationCreditBucketRepository;", "machineTranslationProperties", "Lio/tolgee/configuration/tolgee/machineTranslation/MachineTranslationProperties;", "currentDateProvider", "Lio/tolgee/component/CurrentDateProvider;", "(Lio/tolgee/repository/machineTranslation/MachineTranslationCreditBucketRepository;Lio/tolgee/configuration/tolgee/machineTranslation/MachineTranslationProperties;Lio/tolgee/component/CurrentDateProvider;)V", "addCredits", "", "bucket", "Lio/tolgee/model/MtCreditBucket;", "amount", "", "project", "Lio/tolgee/model/Project;", "consumeCredits", "findOrCreateBucket", "organization", "Lio/tolgee/model/Organization;", "userAccount", "Lio/tolgee/model/UserAccount;", "getCreditBalance", "", "getRefillAmount", "refillBucket", "refillIfItsTime", "save", "saveAll", "buckets", "", "getNextRefillDate", "Ljava/util/Date;", "data"})
@org.springframework.stereotype.Service()
public class MtCreditBucketService {
    private final io.tolgee.repository.machineTranslation.MachineTranslationCreditBucketRepository machineTranslationCreditBucketRepository = null;
    private final io.tolgee.configuration.tolgee.machineTranslation.MachineTranslationProperties machineTranslationProperties = null;
    private final io.tolgee.component.CurrentDateProvider currentDateProvider = null;
    
    public MtCreditBucketService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.machineTranslation.MachineTranslationCreditBucketRepository machineTranslationCreditBucketRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.MachineTranslationProperties machineTranslationProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.CurrentDateProvider currentDateProvider) {
        super();
    }
    
    @javax.transaction.Transactional()
    public void consumeCredits(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, int amount) {
    }
    
    @javax.transaction.Transactional()
    public void consumeCredits(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.MtCreditBucket bucket, int amount) {
    }
    
    @javax.transaction.Transactional()
    public void addCredits(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, int amount) {
    }
    
    @javax.transaction.Transactional()
    public void addCredits(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.MtCreditBucket bucket, int amount) {
    }
    
    public void save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.MtCreditBucket bucket) {
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.MtCreditBucket> buckets) {
    }
    
    public long getCreditBalance(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return 0L;
    }
    
    public long getCreditBalance(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.MtCreditBucket bucket) {
        return 0L;
    }
    
    public long getCreditBalance(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return 0L;
    }
    
    public long getCreditBalance(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
        return 0L;
    }
    
    private java.util.Date getNextRefillDate(io.tolgee.model.MtCreditBucket $this$getNextRefillDate) {
        return null;
    }
    
    public void refillBucket(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.MtCreditBucket bucket) {
    }
    
    private long getRefillAmount() {
        return 0L;
    }
    
    public void refillIfItsTime(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.MtCreditBucket bucket) {
    }
    
    private io.tolgee.model.MtCreditBucket findOrCreateBucket(io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    private io.tolgee.model.MtCreditBucket findOrCreateBucket(io.tolgee.model.Organization organization) {
        return null;
    }
    
    private io.tolgee.model.MtCreditBucket findOrCreateBucket(io.tolgee.model.Project project) {
        return null;
    }
}