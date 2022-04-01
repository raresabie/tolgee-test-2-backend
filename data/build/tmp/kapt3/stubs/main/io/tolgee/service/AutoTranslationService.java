package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u001e\u0010$\u001a\u00020\u0010*\u00020\u00172\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lio/tolgee/service/AutoTranslationService;", "", "translationService", "Lio/tolgee/service/TranslationService;", "autoTranslationConfigRepository", "Lio/tolgee/repository/AutoTranslationConfigRepository;", "translationMemoryService", "Lio/tolgee/service/TranslationMemoryService;", "mtService", "Lio/tolgee/service/machineTranslation/MtService;", "(Lio/tolgee/service/TranslationService;Lio/tolgee/repository/AutoTranslationConfigRepository;Lio/tolgee/service/TranslationMemoryService;Lio/tolgee/service/machineTranslation/MtService;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "autoTranslate", "", "key", "Lio/tolgee/model/key/Key;", "autoTranslateUsingMachineTranslation", "autoTranslateUsingTm", "createNonExistingTranslations", "", "Lio/tolgee/model/translation/Translation;", "getConfig", "Lio/tolgee/model/AutoTranslationConfig;", "project", "Lio/tolgee/model/Project;", "getLanguagesWithNoTranslation", "Lio/tolgee/model/Language;", "getUntranslatedExistingTranslations", "getUntranslatedTranslations", "saveConfig", "config", "dto", "Lio/tolgee/dtos/request/AutoTranslationSettingsDto;", "setValueAndState", "text", "", "usedService", "Lio/tolgee/constants/MtServiceType;", "data"})
@org.springframework.stereotype.Service()
public class AutoTranslationService {
    private final io.tolgee.service.TranslationService translationService = null;
    private final io.tolgee.repository.AutoTranslationConfigRepository autoTranslationConfigRepository = null;
    private final io.tolgee.service.TranslationMemoryService translationMemoryService = null;
    private final io.tolgee.service.machineTranslation.MtService mtService = null;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger logger = null;
    
    public AutoTranslationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationService translationService, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.AutoTranslationConfigRepository autoTranslationConfigRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationMemoryService translationMemoryService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.machineTranslation.MtService mtService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    public void autoTranslate(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key) {
    }
    
    private void autoTranslateUsingMachineTranslation(io.tolgee.model.key.Key key) {
    }
    
    private void autoTranslateUsingTm(io.tolgee.model.key.Key key) {
    }
    
    private void setValueAndState(io.tolgee.model.translation.Translation $this$setValueAndState, java.lang.String text, io.tolgee.constants.MtServiceType usedService) {
    }
    
    private java.util.List<io.tolgee.model.translation.Translation> getUntranslatedTranslations(io.tolgee.model.key.Key key) {
        return null;
    }
    
    private java.util.List<io.tolgee.model.translation.Translation> createNonExistingTranslations(io.tolgee.model.key.Key key) {
        return null;
    }
    
    public void saveConfig(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.AutoTranslationSettingsDto dto) {
    }
    
    public void saveConfig(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.AutoTranslationConfig config) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.AutoTranslationConfig getConfig(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    private java.util.List<io.tolgee.model.Language> getLanguagesWithNoTranslation(io.tolgee.model.key.Key key) {
        return null;
    }
    
    /**
     * Returns existing translations with null or empty value
     */
    private java.util.List<io.tolgee.model.translation.Translation> getUntranslatedExistingTranslations(io.tolgee.model.key.Key key) {
        return null;
    }
}