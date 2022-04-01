package io.tolgee.repository.dataImport.issues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lio/tolgee/repository/dataImport/issues/ImportFileIssueParamRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/dataImport/issues/ImportFileIssueParam;", "", "deleteAllByImport", "", "import", "Lio/tolgee/model/dataImport/Import;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ImportFileIssueParamRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.dataImport.issues.ImportFileIssueParam, java.lang.Long> {
    
    @org.springframework.data.jpa.repository.Query(value = "delete from ImportFileIssueParam ifip where ifip.issue in \n        (select ifi from ifip.issue ifi join ifi.file if where if.import = :import)\n        ")
    @org.springframework.data.jpa.repository.Modifying()
    @org.springframework.transaction.annotation.Transactional()
    public abstract void deleteAllByImport(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778);
}