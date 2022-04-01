package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J(\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0!2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0014H\u0016J\u0016\u0010&\u001a\u00020\b2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lio/tolgee/service/TagService;", "", "tagRepository", "Lio/tolgee/repository/TagRepository;", "keyMetaService", "Lio/tolgee/service/KeyMetaService;", "(Lio/tolgee/repository/TagRepository;Lio/tolgee/service/KeyMetaService;)V", "deleteAllByImportKeyIdIn", "", "importKeyIds", "", "", "deleteAllByKeyIdIn", "keyIds", "", "deleteAllTagsForKeys", "keys", "", "Lio/tolgee/model/dataImport/WithKeyMeta;", "find", "Lio/tolgee/model/key/Tag;", "project", "Lio/tolgee/model/Project;", "tagName", "", "id", "getProjectTags", "Lorg/springframework/data/domain/Page;", "projectId", "search", "pageable", "Lorg/springframework/data/domain/Pageable;", "getTagsForKeyIds", "", "remove", "key", "Lio/tolgee/model/key/Key;", "tag", "saveAll", "entities", "tagKey", "updateTags", "newTags", "data"})
@org.springframework.stereotype.Service()
public class TagService {
    private final io.tolgee.repository.TagRepository tagRepository = null;
    private final io.tolgee.service.KeyMetaService keyMetaService = null;
    
    public TagService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.TagRepository tagRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.KeyMetaService keyMetaService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Tag tagKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.lang.String tagName) {
        return null;
    }
    
    public void remove(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Tag tag) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void updateTags(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> newTags) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.key.Tag> getProjectTags(long projectId, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Long, java.util.List<io.tolgee.model.key.Tag>> getTagsForKeyIds(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> keyIds) {
        return null;
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<? extends io.tolgee.model.key.Tag> entities) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.key.Tag find(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.key.Tag find(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.lang.String tagName) {
        return null;
    }
    
    public void deleteAllByImportKeyIdIn(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> importKeyIds) {
    }
    
    public void deleteAllByKeyIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> keyIds) {
    }
    
    private void deleteAllTagsForKeys(java.lang.Iterable<? extends io.tolgee.model.dataImport.WithKeyMeta> keys) {
    }
}