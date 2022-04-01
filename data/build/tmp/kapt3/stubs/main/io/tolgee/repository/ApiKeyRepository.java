package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\'\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0003H&\u00a8\u0006\u0016"}, d2 = {"Lio/tolgee/repository/ApiKeyRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/ApiKey;", "", "deleteAllByProjectId", "", "projectId", "findByKey", "Ljava/util/Optional;", "key", "", "getAllByProjectId", "", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getAllByUserAccount", "userAccountId", "filterProjectId", "(JLjava/lang/Long;Lorg/springframework/data/domain/Pageable;)Lorg/springframework/data/domain/Page;", "getAllByUserAccountIdOrderById", "Ljava/util/LinkedHashSet;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ApiKeyRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.ApiKey, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.ApiKey> findByKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.LinkedHashSet<io.tolgee.model.ApiKey> getAllByUserAccountIdOrderById(long userAccountId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<io.tolgee.model.ApiKey> getAllByProjectId(long projectId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.data.domain.Page<io.tolgee.model.ApiKey> getAllByProjectId(long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    public abstract void deleteAllByProjectId(long projectId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select ak from ApiKey ak\n    left join ak.project p \n    left join ak.userAccount u\n    where u.id = :userAccountId \n    and (p.id = :filterProjectId or :filterProjectId is null)\n  ")
    @org.springframework.data.jpa.repository.EntityGraph(attributePaths = {"project", "userAccount", "scopesEnum"})
    public abstract org.springframework.data.domain.Page<io.tolgee.model.ApiKey> getAllByUserAccount(long userAccountId, @org.jetbrains.annotations.Nullable()
    java.lang.Long filterProjectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
}