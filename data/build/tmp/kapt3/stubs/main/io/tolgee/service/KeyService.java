package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001cH\u0017J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001dH\u0017J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0016H\u0017J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010#\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160%H\u0017J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\'H\u0017J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u001fH\u0016J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020*H\u0016J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020+H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140-2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140-2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140-2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u0014002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001601H\u0016J\u0010\u00102\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0018\u00102\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u0014012\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u00104\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00105\u001a\u00020/H\u0017J\u0018\u00104\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001fH\u0017J\u0018\u00107\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001fH\u0017J\u0010\u00108\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00140:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00140%H\u0016J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0092.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lio/tolgee/service/KeyService;", "", "keyRepository", "Lio/tolgee/repository/KeyRepository;", "entityManager", "Ljavax/persistence/EntityManager;", "screenshotService", "Lio/tolgee/service/ScreenshotService;", "keyMetaService", "Lio/tolgee/service/KeyMetaService;", "translationsSocketIoModule", "Lio/tolgee/socketio/ITranslationsSocketIoModule;", "tagService", "Lio/tolgee/service/TagService;", "(Lio/tolgee/repository/KeyRepository;Ljavax/persistence/EntityManager;Lio/tolgee/service/ScreenshotService;Lio/tolgee/service/KeyMetaService;Lio/tolgee/socketio/ITranslationsSocketIoModule;Lio/tolgee/service/TagService;)V", "translationService", "Lio/tolgee/service/TranslationService;", "checkInProject", "", "key", "Lio/tolgee/model/key/Key;", "projectId", "", "create", "project", "Lio/tolgee/model/Project;", "dto", "Lio/tolgee/dtos/request/key/CreateKeyDto;", "Lio/tolgee/dtos/request/translation/SetTranslationsWithKeyDto;", "Lio/tolgee/dtos/response/DeprecatedKeyDto;", "name", "", "delete", "id", "deleteAllByProject", "deleteMultiple", "ids", "", "edit", "Lio/tolgee/dtos/request/key/DeprecatedEditKeyDTO;", "newName", "keyId", "Lio/tolgee/dtos/request/key/EditKeyDto;", "Lio/tolgee/dtos/request/key/OldEditKeyDto;", "findOptional", "Ljava/util/Optional;", "pathDTO", "Lio/tolgee/dtos/PathDTO;", "", "", "get", "getAll", "getOrCreateKey", "path", "keyName", "getOrCreateKeyNoPersist", "save", "saveAll", "", "entities", "setTranslationService", "data"})
@org.springframework.stereotype.Service()
public class KeyService {
    private final io.tolgee.repository.KeyRepository keyRepository = null;
    private final javax.persistence.EntityManager entityManager = null;
    private final io.tolgee.service.ScreenshotService screenshotService = null;
    private final io.tolgee.service.KeyMetaService keyMetaService = null;
    private final io.tolgee.socketio.ITranslationsSocketIoModule translationsSocketIoModule = null;
    private final io.tolgee.service.TagService tagService = null;
    private io.tolgee.service.TranslationService translationService;
    
    public KeyService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.KeyRepository keyRepository, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ScreenshotService screenshotService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.KeyMetaService keyMetaService, @org.jetbrains.annotations.NotNull()
    io.tolgee.socketio.ITranslationsSocketIoModule translationsSocketIoModule, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.TagService tagService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.key.Key getOrCreateKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.PathDTO path) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.key.Key getOrCreateKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.lang.String keyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.key.Key getOrCreateKeyNoPersist(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.lang.String keyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.key.Key> getAll(long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Key get(long projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.key.Key> findOptional(long projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.key.Key> findOptional(long projectId, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.PathDTO pathDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Key get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.key.Key> findOptional(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.Key> findOptional(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> ids) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Key save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public io.tolgee.model.key.Key create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.response.DeprecatedKeyDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.key.Key create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.key.CreateKeyDto dto) {
        return null;
    }
    
    @java.lang.Deprecated()
    public void edit(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.key.DeprecatedEditKeyDTO dto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Key edit(long projectId, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.key.OldEditKeyDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Key edit(long keyId, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.key.EditKeyDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.key.Key edit(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void delete(long id) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void deleteMultiple(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids) {
    }
    
    public void deleteAllByProject(long projectId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.key.Key create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.translation.SetTranslationsWithKeyDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.key.Key create(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public void setTranslationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationService translationService) {
    }
    
    public void checkInProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, long projectId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.key.Key> saveAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.key.Key> entities) {
        return null;
    }
}