package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lio/tolgee/repository/KeyCodeReferenceRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/key/KeyCodeReference;", "", "deleteAllByImportKeyIds", "", "keyIds", "", "deleteAllByKeyId", "keyId", "deleteAllByKeyIds", "", "data"})
@org.springframework.stereotype.Repository()
public abstract interface KeyCodeReferenceRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.key.KeyCodeReference, java.lang.Long> {
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyCodeReference kcr where kcr.keyMeta in \n        (select km from kcr.keyMeta km where km.importKey.id in :keyIds)")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByImportKeyIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> keyIds);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyCodeReference kcr where kcr.keyMeta in \n        (select km from kcr.keyMeta km where km.key.id in :keyIds)")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByKeyIds(@org.jetbrains.annotations.NotNull()
    java.lang.Object keyIds);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyCodeReference kcr where kcr.keyMeta in \n        (select km from kcr.keyMeta km where km.key.id = :keyId)")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByKeyId(long keyId);
}