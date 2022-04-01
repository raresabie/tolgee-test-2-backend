package io.tolgee.repository.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\'J>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\'J\u0016\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/repository/dataImport/ImportTranslationRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/dataImport/ImportTranslation;", "", "deleteAllByImport", "", "import", "Lio/tolgee/model/dataImport/Import;", "deleteAllByLanguage", "language", "Lio/tolgee/model/dataImport/ImportLanguage;", "findAllByImportAndLanguageId", "", "languageId", "findImportTranslationsView", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/ImportTranslationView;", "pageable", "Lorg/springframework/data/domain/Pageable;", "onlyConflicts", "", "onlyUnresolved", "search", "", "removeExistingTranslationConflictReferences", "translationIds", "", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ImportTranslationRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.dataImport.ImportTranslation, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n        select distinct it from ImportTranslation it\n        join fetch it.key ik\n        left join fetch ik.keyMeta\n        left join fetch it.conflict ic\n        left join fetch ic.key ick\n        left join fetch ick.keyMeta\n        join it.language il on il.id = :languageId\n        join il.file if\n        ")
    public abstract java.util.List<io.tolgee.model.dataImport.ImportTranslation> findAllByImportAndLanguageId(long languageId);
    
    @org.springframework.data.jpa.repository.Query(value = "update ImportTranslation it set it.conflict = null where it.conflict.id in :translationIds")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void removeExistingTranslationConflictReferences(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> translationIds);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = " select it.id as id, it.text as text, ik.name as keyName, ik.id as keyId,\n        itc.id as conflictId, itc.text as conflictText, it.override as override, it.resolvedHash as resolvedHash\n        from ImportTranslation it left join it.conflict itc join it.key ik\n        where (itc.id is not null or :onlyConflicts = false)\n        and ((itc.id is not null and it.resolvedHash is null) or :onlyUnresolved = false)\n        and it.language.id = :languageId\n        and (:search is null or lower(it.text) like lower(concat(\'%\', cast(:search as text), \'%\'))\n        or lower(ik.name) like lower(concat(\'%\', cast(:search as text), \'%\')))\n    ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.ImportTranslationView> findImportTranslationsView(long languageId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, boolean onlyConflicts, boolean onlyUnresolved, @org.jetbrains.annotations.Nullable()
    java.lang.String search);
    
    @org.springframework.data.jpa.repository.Modifying()
    @org.springframework.data.jpa.repository.Query(value = "delete from ImportTranslation it where it.language = :language")
    @org.springframework.transaction.annotation.Transactional()
    public abstract void deleteAllByLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage language);
    
    @org.springframework.data.jpa.repository.Modifying()
    @org.springframework.data.jpa.repository.Query(value = "delete from ImportTranslation it where it.key.id in \n        (select k.id from ImportKey k join k.files f where f.import = :import)")
    @org.springframework.transaction.annotation.Transactional()
    public abstract void deleteAllByImport(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}