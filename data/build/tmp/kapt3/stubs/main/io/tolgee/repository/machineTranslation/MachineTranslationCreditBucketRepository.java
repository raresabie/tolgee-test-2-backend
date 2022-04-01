package io.tolgee.repository.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lio/tolgee/repository/machineTranslation/MachineTranslationCreditBucketRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/MtCreditBucket;", "", "findByOrganization", "organization", "Lio/tolgee/model/Organization;", "findByUserAccount", "userAccount", "Lio/tolgee/model/UserAccount;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface MachineTranslationCreditBucketRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.MtCreditBucket, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.MtCreditBucket findByUserAccount(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.MtCreditBucket findByOrganization(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization);
}