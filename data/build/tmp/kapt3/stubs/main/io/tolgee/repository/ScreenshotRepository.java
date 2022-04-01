package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H&J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0003H&J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\'\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/repository/ScreenshotRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/Screenshot;", "", "countByKey", "key", "Lio/tolgee/model/key/Key;", "findAllByKey", "", "getAllByKeyId", "id", "getAllByKeyIdIn", "keyIds", "", "getAllByKeyProjectId", "projectId", "getKeysWithScreenshots", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ScreenshotRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.Screenshot, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Screenshot> findAllByKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Screenshot> getAllByKeyProjectId(long projectId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Screenshot> getAllByKeyId(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Screenshot> getAllByKeyIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> keyIds);
    
    public abstract long countByKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n    from Key k join fetch k.screenshots where k.id in :keyIds\n  ")
    public abstract java.util.List<io.tolgee.model.key.Key> getKeysWithScreenshots(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> keyIds);
}