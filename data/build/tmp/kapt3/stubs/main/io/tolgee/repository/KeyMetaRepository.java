package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\bg\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\'J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\'J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\'J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\'\u00a8\u0006\u0010"}, d2 = {"Lio/tolgee/repository/KeyMetaRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/key/KeyMeta;", "", "deleteAllByImportKeyIdIn", "", "keyIds", "", "deleteAllByKeyId", "keyId", "deleteAllByKeyIds", "", "deleteAllByProjectId", "projectId", "deleteAllKeyCodeReferencesByProjectId", "deleteAllKeyCommentsByProjectId", "data"})
@org.springframework.stereotype.Repository()
public abstract interface KeyMetaRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.key.KeyMeta, java.lang.Long> {
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyComment kc where kc.keyMeta in \n        (select km from kc.keyMeta km join km.key k where k.project.id = :projectId)")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllKeyCommentsByProjectId(long projectId);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyCodeReference kcr where kcr.keyMeta in \n        (select km from kcr.keyMeta km join km.key k where k.project.id = :projectId)")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllKeyCodeReferencesByProjectId(long projectId);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyMeta km where km.key in (select k from km.key k where k.project.id = :projectId)")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByProjectId(long projectId);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyMeta km where km.importKey.id in :keyIds")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByImportKeyIdIn(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> keyIds);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyMeta km where km.key.id in :keyIds")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByKeyIds(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> keyIds);
    
    @org.springframework.data.jpa.repository.Query(value = "delete from KeyMeta km where km.key.id = :keyId")
    @org.springframework.transaction.annotation.Transactional()
    @org.springframework.data.jpa.repository.Modifying()
    public abstract void deleteAllByKeyId(long keyId);
}