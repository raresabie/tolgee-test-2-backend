package io.tolgee.repository.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\'J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\'J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\'\u00a8\u0006\u0017"}, d2 = {"Lio/tolgee/repository/dataImport/ImportLanguageRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/dataImport/ImportLanguage;", "", "deleteAllByImport", "", "import", "Lio/tolgee/model/dataImport/Import;", "findAllByImport", "", "importId", "findImportLanguagesView", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/ImportLanguageView;", "pageable", "Lorg/springframework/data/domain/Pageable;", "findViewById", "Ljava/util/Optional;", "languageId", "removeExistingLanguageReference", "language", "Lio/tolgee/model/Language;", "Companion", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ImportLanguageRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.dataImport.ImportLanguage, java.lang.Long> {
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.repository.dataImport.ImportLanguageRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "from ImportLanguage il join il.file if join if.import im where im.id = :importId")
    public abstract java.util.List<io.tolgee.model.dataImport.ImportLanguage> findAllByImport(long importId);
    
    @org.springframework.data.jpa.repository.Query(value = "update ImportLanguage il set il.existingLanguage = null where il.existingLanguage = :language")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void removeExistingLanguageReference(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n            \n            select il.id as id, il.name as name, el.id as existingLanguageId, \n            el.tag as existingLanguageTag, el.name as existingLanguageName,\n            if.name as importFileName, if.id as importFileId,\n            (select count(*) from if.issues) as importFileIssueCount,\n            count(it) as totalCount, \n            sum(case when it.conflict is null then 0 else 1 end) as conflictCount,\n            sum(case when (it.conflict is null or it.resolvedHash is null) then 0 else 1 end) as resolvedCount\n            from ImportLanguage il join il.file if left join il.existingLanguage el left join il.translations it\n        \n            where if.import.id = :importId\n            \n            group by il.id, if.id, el.id\n        \n            ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.ImportLanguageView> findImportLanguagesView(long importId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from ImportLanguage l where l.file in \n        (select f from ImportFile f where f.import = :import)")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByImport(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n            \n            select il.id as id, il.name as name, el.id as existingLanguageId, \n            el.tag as existingLanguageTag, el.name as existingLanguageName,\n            if.name as importFileName, if.id as importFileId,\n            (select count(*) from if.issues) as importFileIssueCount,\n            count(it) as totalCount, \n            sum(case when it.conflict is null then 0 else 1 end) as conflictCount,\n            sum(case when (it.conflict is null or it.resolvedHash is null) then 0 else 1 end) as resolvedCount\n            from ImportLanguage il join il.file if left join il.existingLanguage el left join il.translations it\n        \n            where il.id = :languageId\n            \n            group by il.id, if.id, el.id\n        \n            ")
    public abstract java.util.Optional<io.tolgee.model.views.ImportLanguageView> findViewById(long languageId);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/tolgee/repository/dataImport/ImportLanguageRepository$Companion;", "", "()V", "VIEW_BASE_QUERY", "", "VIEW_GROUP_BY", "data"})
    public static final class Companion {
        private static final java.lang.String VIEW_BASE_QUERY = "\n            select il.id as id, il.name as name, el.id as existingLanguageId, \n            el.tag as existingLanguageTag, el.name as existingLanguageName,\n            if.name as importFileName, if.id as importFileId,\n            (select count(*) from if.issues) as importFileIssueCount,\n            count(it) as totalCount, \n            sum(case when it.conflict is null then 0 else 1 end) as conflictCount,\n            sum(case when (it.conflict is null or it.resolvedHash is null) then 0 else 1 end) as resolvedCount\n            from ImportLanguage il join il.file if left join il.existingLanguage el left join il.translations it\n        ";
        private static final java.lang.String VIEW_GROUP_BY = "\n            group by il.id, if.id, el.id\n        ";
        
        private Companion() {
            super();
        }
    }
}