package io.tolgee.repository.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lio/tolgee/repository/dataImport/ImportKeyRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/dataImport/ImportKey;", "", "deleteByIdIn", "", "ids", "", "findAllByImport", "importId", "getAllIdsByImport", "import", "Lio/tolgee/model/dataImport/Import;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ImportKeyRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.dataImport.ImportKey, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n        select distinct ik from ImportKey ik left join fetch ik.keyMeta\n        join fetch ik.files if join fetch if.import im where im.id = :importId\n        ")
    public abstract java.util.List<io.tolgee.model.dataImport.ImportKey> findAllByImport(long importId);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from ImportKey ik where ik.id in :ids")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> ids);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select iik.id from ImportKey iik join iik.files if where if.import = :import")
    public abstract java.util.List<java.lang.Long> getAllIdsByImport(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778);
}