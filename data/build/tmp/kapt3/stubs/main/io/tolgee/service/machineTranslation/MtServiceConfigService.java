package io.tolgee.service.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0012J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010#\u001a\u00020 H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100%H\u0012J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c2\u0006\u0010#\u001a\u00020 H\u0012J\n\u0010\'\u001a\u0004\u0018\u00010\u0010H\u0012J,\u0010(\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010*\u001a\u00020+H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010-\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020 H\u0012J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0012J,\u0010.\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u000f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010*\u001a\u00020+H\u0012J\u0010\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001dH\u0012J\u0016\u00102\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0018\u00103\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000RC\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\u0010\u0012 \u0012\u001e\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00140\u00140\u00110\u000f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00066"}, d2 = {"Lio/tolgee/service/machineTranslation/MtServiceConfigService;", "", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "mtServiceConfigRepository", "Lio/tolgee/repository/machineTranslation/MtServiceConfigRepository;", "(Lorg/springframework/context/ApplicationContext;Lio/tolgee/repository/machineTranslation/MtServiceConfigRepository;)V", "<set-?>", "Lio/tolgee/service/LanguageService;", "languageService", "getLanguageService", "()Lio/tolgee/service/LanguageService;", "setLanguageService", "(Lio/tolgee/service/LanguageService;)V", "services", "", "Lio/tolgee/constants/MtServiceType;", "Lkotlin/Pair;", "Lio/tolgee/configuration/tolgee/machineTranslation/MachineTranslationServiceProperties;", "kotlin.jvm.PlatformType", "Lio/tolgee/component/machineTranslation/MtValueProvider;", "getServices", "()Ljava/util/Map;", "services$delegate", "Lkotlin/Lazy;", "delete", "", "entities", "", "Lio/tolgee/model/MtServiceConfig;", "deleteAllByProjectId", "projectId", "", "deleteAllByTargetLanguageId", "getEnabledServices", "languageId", "getEnabledServicesByDefaultConfig", "", "getEnabledServicesByStoredConfig", "getPrimaryServiceByDefaultConfig", "getPrimaryServices", "languagesIds", "project", "Lio/tolgee/model/Project;", "getProjectSettings", "getStoredConfig", "getStoredConfigs", "languageIds", "save", "entity", "saveAll", "setProjectSettings", "dto", "Lio/tolgee/dtos/request/SetMachineTranslationSettingsDto;", "data"})
@org.springframework.stereotype.Service()
public class MtServiceConfigService {
    private final org.springframework.context.ApplicationContext applicationContext = null;
    private final io.tolgee.repository.machineTranslation.MtServiceConfigRepository mtServiceConfigRepository = null;
    public io.tolgee.service.LanguageService languageService;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy services$delegate = null;
    
    public MtServiceConfigService(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.machineTranslation.MtServiceConfigRepository mtServiceConfigRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.LanguageService getLanguageService() {
        return null;
    }
    
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public void setLanguageService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.LanguageService p0) {
    }
    
    /**
     * Returns services enabled for language id
     *
     * The primary service is first
     *
     * @return enabled translation services for project
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.constants.MtServiceType> getEnabledServices(long languageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Long, io.tolgee.constants.MtServiceType> getPrimaryServices(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> languagesIds, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    private java.util.List<io.tolgee.constants.MtServiceType> getEnabledServicesByDefaultConfig() {
        return null;
    }
    
    private io.tolgee.constants.MtServiceType getPrimaryServiceByDefaultConfig() {
        return null;
    }
    
    private java.util.List<io.tolgee.constants.MtServiceType> getEnabledServicesByStoredConfig(long languageId) {
        return null;
    }
    
    @javax.transaction.Transactional()
    public void setProjectSettings(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.SetMachineTranslationSettingsDto dto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.MtServiceConfig> getProjectSettings(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    private void save(io.tolgee.model.MtServiceConfig entity) {
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.MtServiceConfig> entities) {
    }
    
    private void delete(java.util.List<? extends io.tolgee.model.MtServiceConfig> entities) {
    }
    
    public void deleteAllByProjectId(long projectId) {
    }
    
    public void deleteAllByTargetLanguageId(long projectId) {
    }
    
    private io.tolgee.model.MtServiceConfig getStoredConfig(long languageId) {
        return null;
    }
    
    private java.util.Map<java.lang.Long, io.tolgee.model.MtServiceConfig> getStoredConfigs(java.util.List<java.lang.Long> languageIds, io.tolgee.model.Project project) {
        return null;
    }
    
    private java.util.List<io.tolgee.model.MtServiceConfig> getStoredConfigs(long projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<io.tolgee.constants.MtServiceType, kotlin.Pair<io.tolgee.configuration.tolgee.machineTranslation.MachineTranslationServiceProperties, io.tolgee.component.machineTranslation.MtValueProvider>> getServices() {
        return null;
    }
}