package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\'J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\'J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\'J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\'\u00a8\u0006\u0018"}, d2 = {"Lio/tolgee/repository/TagRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/key/Tag;", "", "findAllByProject", "Lorg/springframework/data/domain/Page;", "projectId", "search", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "findByProjectAndName", "project", "Lio/tolgee/model/Project;", "name", "getImportKeysWithTags", "", "Lio/tolgee/model/dataImport/ImportKey;", "keyIds", "", "getKeysWithTags", "Lio/tolgee/model/key/Key;", "getTagsWithKeyMetas", "tagIds", "data"})
public abstract interface TagRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.key.Tag, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.key.Tag findByProjectAndName(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n    from Tag t where t.project.id = :projectId\n    and (:search is null or lower(name) like lower(concat(\'%\', cast(:search as text),\'%\')))\n  ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.key.Tag> findAllByProject(long projectId, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n    from Key k\n    left join fetch k.keyMeta km\n    left join fetch km.tags\n    where k.id in :keyIds\n  ")
    public abstract java.util.List<io.tolgee.model.key.Key> getKeysWithTags(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> keyIds);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n    from ImportKey k\n    join fetch k.keyMeta km\n    join fetch km.tags\n    where k.id in :keyIds\n  ")
    public abstract java.util.List<io.tolgee.model.dataImport.ImportKey> getImportKeysWithTags(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> keyIds);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n    from Tag t\n    join fetch t.keyMetas\n    where t.id in :tagIds\n    ")
    public abstract java.util.List<io.tolgee.model.key.Tag> getTagsWithKeyMetas(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> tagIds);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}