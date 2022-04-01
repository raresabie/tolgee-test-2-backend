package io.tolgee.repository.dataImport.issues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lio/tolgee/repository/dataImport/issues/ImportFileIssueRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/dataImport/issues/ImportFileIssue;", "", "deleteAllByImport", "", "import", "Lio/tolgee/model/dataImport/Import;", "findAllByFileIdView", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/ImportFileIssueView;", "fileId", "pageable", "Lorg/springframework/data/domain/Pageable;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ImportFileIssueRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.dataImport.issues.ImportFileIssue, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select ifi from ImportFileIssue ifi where ifi.file.id = :fileId")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.ImportFileIssueView> findAllByFileIdView(long fileId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    @org.springframework.data.jpa.repository.Modifying()
    @org.springframework.data.jpa.repository.Query(value = "delete from ImportFileIssue ifi where ifi.file in \n        (select f from ImportFile f where f.import = :import)")
    @org.springframework.transaction.annotation.Transactional()
    public abstract void deleteAllByImport(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778);
}