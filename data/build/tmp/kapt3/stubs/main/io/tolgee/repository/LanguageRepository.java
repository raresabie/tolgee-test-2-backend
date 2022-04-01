package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0017\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\rJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001bH&J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH&J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\u001e"}, d2 = {"Lio/tolgee/repository/LanguageRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/Language;", "", "countByIdInAndProjectId", "", "languageIds", "", "projectId", "deleteAllByProjectId", "", "(Ljava/lang/Long;)V", "findAllByProjectId", "(Ljava/lang/Long;)Ljava/util/Set;", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "(Ljava/lang/Long;Lorg/springframework/data/domain/Pageable;)Lorg/springframework/data/domain/Page;", "findAllByTagInAndProjectId", "abbreviation", "", "", "(Ljava/util/Collection;Ljava/lang/Long;)Ljava/util/Set;", "findByNameAndProject", "Ljava/util/Optional;", "name", "project", "Lio/tolgee/model/Project;", "findByTagAndProject", "findByTagAndProjectId", "data"})
@org.springframework.stereotype.Repository()
public abstract interface LanguageRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.Language, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.Language> findByTagAndProject(@org.jetbrains.annotations.NotNull()
    java.lang.String abbreviation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.Language> findByNameAndProject(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.Language> findByTagAndProjectId(@org.jetbrains.annotations.Nullable()
    java.lang.String abbreviation, long projectId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<io.tolgee.model.Language> findAllByProjectId(@org.jetbrains.annotations.Nullable()
    java.lang.Long projectId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.data.domain.Page<io.tolgee.model.Language> findAllByProjectId(@org.jetbrains.annotations.Nullable()
    java.lang.Long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<io.tolgee.model.Language> findAllByTagInAndProjectId(@org.jetbrains.annotations.Nullable()
    java.util.Collection<java.lang.String> abbreviation, @org.jetbrains.annotations.Nullable()
    java.lang.Long projectId);
    
    public abstract void deleteAllByProjectId(@org.jetbrains.annotations.Nullable()
    java.lang.Long projectId);
    
    public abstract int countByIdInAndProjectId(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> languageIds, long projectId);
}