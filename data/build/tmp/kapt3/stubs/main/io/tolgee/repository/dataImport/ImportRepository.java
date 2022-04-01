package io.tolgee.repository.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lio/tolgee/repository/dataImport/ImportRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/dataImport/Import;", "", "findAllByProjectId", "", "projectId", "findByProjectIdAndAuthorId", "authorId", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ImportRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.dataImport.Import, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.dataImport.Import findByProjectIdAndAuthorId(long projectId, long authorId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.dataImport.Import> findAllByProjectId(long projectId);
}