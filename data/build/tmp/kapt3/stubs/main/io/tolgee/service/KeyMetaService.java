package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010!\u001a\u00020\"H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001dH\u0016J\u0010\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001dH\u0016J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0,H\u0016J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020.0,H\u0016J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u0002000*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002000,H\u0016Jk\u0010#\u001a\u00020\u0013\"\b\b\u0000\u00101*\u000202*\b\u0012\u0004\u0012\u0002H10*2\u0006\u0010%\u001a\u00020\u001d2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H10426\u00105\u001a2\u0012\u0013\u0012\u0011H1\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H1\u00a2\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020;06H\u0092\bR\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006<"}, d2 = {"Lio/tolgee/service/KeyMetaService;", "", "keyMetaRepository", "Lio/tolgee/repository/KeyMetaRepository;", "keyCodeReferenceRepository", "Lio/tolgee/repository/KeyCodeReferenceRepository;", "keyCommentRepository", "Lio/tolgee/repository/KeyCommentRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "(Lio/tolgee/repository/KeyMetaRepository;Lio/tolgee/repository/KeyCodeReferenceRepository;Lio/tolgee/repository/KeyCommentRepository;Ljavax/persistence/EntityManager;)V", "<set-?>", "Lio/tolgee/service/TagService;", "tagService", "getTagService", "()Lio/tolgee/service/TagService;", "setTagService", "(Lio/tolgee/service/TagService;)V", "deleteAllByImportKeyIdIn", "", "importKeyIds", "", "", "deleteAllByKeyId", "id", "deleteAllByKeyIdIn", "ids", "", "getOrCreateForKey", "Lio/tolgee/model/key/KeyMeta;", "key", "Lio/tolgee/model/key/Key;", "getWithFetchedData", "project", "Lio/tolgee/model/Project;", "import", "Lio/tolgee/model/dataImport/Import;", "target", "source", "save", "meta", "saveAll", "", "entities", "", "saveAllCodeReferences", "Lio/tolgee/model/key/KeyCodeReference;", "saveAllComments", "Lio/tolgee/model/key/KeyComment;", "T", "Lio/tolgee/model/key/WithKeyMetaReference;", "other", "", "equalsFn", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "a", "b", "", "data"})
@org.springframework.stereotype.Service()
public class KeyMetaService {
    private final io.tolgee.repository.KeyMetaRepository keyMetaRepository = null;
    private final io.tolgee.repository.KeyCodeReferenceRepository keyCodeReferenceRepository = null;
    private final io.tolgee.repository.KeyCommentRepository keyCommentRepository = null;
    private final javax.persistence.EntityManager entityManager = null;
    public io.tolgee.service.TagService tagService;
    
    public KeyMetaService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.KeyMetaRepository keyMetaRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.KeyCodeReferenceRepository keyCodeReferenceRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.KeyCommentRepository keyCommentRepository, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.TagService getTagService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setTagService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.TagService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.KeyMeta> saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.key.KeyMeta> entities) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.KeyComment> saveAllComments(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.key.KeyComment> entities) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.KeyCodeReference> saveAllCodeReferences(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.key.KeyCodeReference> entities) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.KeyMeta> getWithFetchedData(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p0_1555085778) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.KeyMeta> getWithFetchedData(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.KeyMeta getOrCreateForKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.KeyMeta save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.KeyMeta meta) {
        return null;
    }
    
    public void deleteAllByImportKeyIdIn(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> importKeyIds) {
    }
    
    public void deleteAllByKeyIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids) {
    }
    
    public void deleteAllByKeyId(long id) {
    }
}