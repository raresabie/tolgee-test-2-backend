package io.tolgee.service.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ@\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102&\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u00150\u00140\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J0\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J8\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J(\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J6\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0012J&\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00142\u0006\u0010\u001f\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J(\u0010$\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000eH\u0012J \u0010(\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u000eH\u0012J \u0010*\u001a\u00020\u0010*\u00020\u00102\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0012H\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/tolgee/service/machineTranslation/MtService;", "", "translationService", "Lio/tolgee/service/TranslationService;", "machineTranslationManager", "Lio/tolgee/component/machineTranslation/MtServiceManager;", "applicationEventPublisher", "Lorg/springframework/context/ApplicationEventPublisher;", "projectService", "Lio/tolgee/service/ProjectService;", "mtServiceConfigService", "Lio/tolgee/service/machineTranslation/MtServiceConfigService;", "(Lio/tolgee/service/TranslationService;Lio/tolgee/component/machineTranslation/MtServiceManager;Lorg/springframework/context/ApplicationEventPublisher;Lio/tolgee/service/ProjectService;Lio/tolgee/service/machineTranslation/MtServiceConfigService;)V", "calculatePrice", "", "sourceLanguageTag", "", "targetServiceLanguagesMap", "", "Lio/tolgee/constants/MtServiceType;", "", "Lkotlin/Pair;", "Lio/tolgee/model/Language;", "prepared", "Lio/tolgee/helpers/TextHelper$ReplaceIcuResult;", "getMachineTranslations", "project", "Lio/tolgee/model/Project;", "baseTranslationText", "targetLanguage", "baseLanguage", "key", "Lio/tolgee/model/key/Key;", "getPrimaryMachineTranslations", "Lio/tolgee/component/machineTranslation/TranslateResult;", "targetLanguages", "publishOnAfterEvent", "", "expectedPrice", "actualPrice", "publishOnBeforeEvent", "price", "replaceParams", "params", "data"})
@org.springframework.stereotype.Service()
public class MtService {
    private final io.tolgee.service.TranslationService translationService = null;
    private final io.tolgee.component.machineTranslation.MtServiceManager machineTranslationManager = null;
    private final org.springframework.context.ApplicationEventPublisher applicationEventPublisher = null;
    private final io.tolgee.service.ProjectService projectService = null;
    private final io.tolgee.service.machineTranslation.MtServiceConfigService mtServiceConfigService = null;
    
    public MtService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.TranslationService translationService, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.machineTranslation.MtServiceManager machineTranslationManager, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationEventPublisher applicationEventPublisher, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService projectService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.machineTranslation.MtServiceConfigService mtServiceConfigService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.Map<io.tolgee.constants.MtServiceType, java.lang.String> getMachineTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.Map<io.tolgee.constants.MtServiceType, java.lang.String> getMachineTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.lang.String baseTranslationText, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.component.machineTranslation.TranslateResult> getPrimaryMachineTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.Language> targetLanguages) {
        return null;
    }
    
    private java.util.List<io.tolgee.component.machineTranslation.TranslateResult> getPrimaryMachineTranslations(io.tolgee.model.Project project, java.lang.String baseTranslationText, io.tolgee.model.Language baseLanguage, java.util.List<? extends io.tolgee.model.Language> targetLanguages) {
        return null;
    }
    
    private int calculatePrice(java.lang.String sourceLanguageTag, java.util.Map<io.tolgee.constants.MtServiceType, ? extends java.util.List<? extends kotlin.Pair<java.lang.Integer, ? extends io.tolgee.model.Language>>> targetServiceLanguagesMap, io.tolgee.helpers.TextHelper.ReplaceIcuResult prepared) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.Map<io.tolgee.constants.MtServiceType, java.lang.String> getMachineTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.lang.String baseTranslationText, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language baseLanguage, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage) {
        return null;
    }
    
    private void publishOnBeforeEvent(io.tolgee.helpers.TextHelper.ReplaceIcuResult prepared, io.tolgee.model.Project project, int price) {
    }
    
    private void publishOnAfterEvent(io.tolgee.helpers.TextHelper.ReplaceIcuResult prepared, io.tolgee.model.Project project, int expectedPrice, int actualPrice) {
    }
    
    private java.lang.String replaceParams(java.lang.String $this$replaceParams, java.util.Map<java.lang.String, java.lang.String> params) {
        return null;
    }
}