package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\"\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\rj\b\u0012\u0004\u0012\u00020\u0002`\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\'J#\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0012\u001a\u00020\u0003H\'J*\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0013\u001a\u00020\u0003H\'J\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\'\u00a8\u0006\u001f"}, d2 = {"Lio/tolgee/repository/PermissionRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/Permission;", "", "deleteByIdIn", "", "ids", "", "findAllByPermittedLanguage", "", "language", "Lio/tolgee/model/Language;", "findAllByUser", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "userAccount", "Lio/tolgee/model/UserAccount;", "findOneByProjectIdAndUserId", "projectId", "userId", "(Ljava/lang/Long;Ljava/lang/Long;)Lio/tolgee/model/Permission;", "getAllByProjectAndUserNotNull", "", "project", "Lio/tolgee/model/Project;", "getIdsByProject", "getProjectPermittedLanguageIds", "", "projectIds", "getUserPermittedLanguageIds", "userIds", "data"})
@org.springframework.stereotype.Repository()
public abstract interface PermissionRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.Permission, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.Permission findOneByProjectIdAndUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Long projectId, @org.jetbrains.annotations.Nullable()
    java.lang.Long userId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<io.tolgee.model.Permission> getAllByProjectAndUserNotNull(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Project project);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "from Permission p join Project r on r = p.project where p.user = ?1 order by r.name")
    public abstract java.util.LinkedHashSet<io.tolgee.model.Permission> findAllByUser(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.UserAccount userAccount);
    
    public abstract void deleteByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select p.id from Permission p where p.project.id = :projectId")
    public abstract java.util.List<java.lang.Long> getIdsByProject(long projectId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select distinct p\n    from Permission p\n    join p.languages l on l = :language\n    join fetch p.languages allLangs\n  ")
    public abstract java.util.List<io.tolgee.model.Permission> findAllByPermittedLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n      select p.user.id, l.id from Permission p\n      join p.languages l\n      where p.user.id in :userIds\n    ")
    public abstract java.util.List<java.lang.Long[]> getUserPermittedLanguageIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> userIds);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n      select p.project.id, l.id from Permission p\n      join p.languages l\n      where p.project.id in :projectIds\n      and p.user.id = :userId\n    ")
    public abstract java.util.List<java.lang.Long[]> getProjectPermittedLanguageIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> projectIds, long userId);
}