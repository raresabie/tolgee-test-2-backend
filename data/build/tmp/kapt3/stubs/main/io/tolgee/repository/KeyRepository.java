package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0003H&J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\'\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lio/tolgee/repository/KeyRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/key/Key;", "", "deleteAllByIdIn", "", "ids", "", "findAllByIdIn", "", "getAllByProjectId", "", "projectId", "getByNameAndProject", "Ljava/util/Optional;", "name", "", "project", "Lio/tolgee/model/Project;", "getByNameAndProjectId", "fullPathString", "getIdsByProjectId", "(Ljava/lang/Long;)Ljava/util/List;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface KeyRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.key.Key, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.key.Key> getByNameAndProject(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.key.Key> getByNameAndProjectId(@org.jetbrains.annotations.NotNull()
    java.lang.String fullPathString, long projectId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<io.tolgee.model.key.Key> getAllByProjectId(long projectId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select k.id from Key k where k.project.id = :projectId")
    public abstract java.util.List<java.lang.Long> getIdsByProjectId(@org.jetbrains.annotations.Nullable()
    java.lang.Long projectId);
    
    public abstract void deleteAllByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.key.Key> findAllByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids);
}