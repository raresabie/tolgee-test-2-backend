package io.tolgee.component.machineTranslation;

import java.lang.System;

/**
 * Manages machine translation third-party services.
 *
 * Enables their registering and translating with using them
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J.\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0012J\u0010\u0010%\u001a\n \u000b*\u0004\u0018\u00010&0&H\u0012J\u0010\u0010\'\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0012J(\u0010(\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eH\u0012J(\u0010*\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eH\u0016J4\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J4\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0 2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0 H\u0016J:\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 H\u0016J\u0010\u0010.\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0012J\u0014\u0010/\u001a\u000200*\u00020$2\u0006\u00101\u001a\u00020\u001aH\u0012J\u000e\u0010!\u001a\u0004\u0018\u00010\u001a*\u00020$H\u0012J\f\u00102\u001a\u00020\u000f*\u00020\u000eH\u0016J\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r*\b\u0012\u0004\u0012\u00020\u000e0 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u000f0\u000f0\r8RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00063"}, d2 = {"Lio/tolgee/component/machineTranslation/MtServiceManager;", "", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "internalProperties", "Lio/tolgee/configuration/tolgee/InternalProperties;", "cacheManager", "Lorg/springframework/cache/CacheManager;", "(Lorg/springframework/context/ApplicationContext;Lio/tolgee/configuration/tolgee/InternalProperties;Lorg/springframework/cache/CacheManager;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "providers", "", "Lio/tolgee/constants/MtServiceType;", "Lio/tolgee/component/machineTranslation/MtValueProvider;", "getProviders", "()Ljava/util/Map;", "providers$delegate", "Lkotlin/Lazy;", "serviceCount", "", "getServiceCount", "()I", "calculatePrice", "text", "", "service", "sourceLanguageTag", "targetLanguageTag", "calculatePriceAll", "services", "", "findInCache", "Lio/tolgee/component/machineTranslation/TranslateResult;", "params", "Lio/tolgee/component/machineTranslation/TranslationParams;", "getCache", "Lorg/springframework/cache/Cache;", "getFaked", "getParams", "serviceType", "translate", "targetLanguageTags", "translateToMultipleTargets", "translateUsingAll", "translateWithProvider", "cacheResult", "", "result", "getProvider", "data"})
@org.springframework.context.annotation.Scope(value = "singleton")
@org.springframework.stereotype.Component()
public class MtServiceManager {
    private final org.springframework.context.ApplicationContext applicationContext = null;
    private final io.tolgee.configuration.tolgee.InternalProperties internalProperties = null;
    private final org.springframework.cache.CacheManager cacheManager = null;
    private final org.slf4j.Logger logger = null;
    private final kotlin.Lazy providers$delegate = null;
    
    public MtServiceManager(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.InternalProperties internalProperties, @org.jetbrains.annotations.NotNull()
    org.springframework.cache.CacheManager cacheManager) {
        super();
    }
    
    private java.util.Map<io.tolgee.constants.MtServiceType, io.tolgee.component.machineTranslation.MtValueProvider> getProviders() {
        return null;
    }
    
    public int getServiceCount() {
        return 0;
    }
    
    /**
     * Translates a text using All services
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<io.tolgee.constants.MtServiceType, io.tolgee.component.machineTranslation.TranslateResult> translateUsingAll(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.constants.MtServiceType> services) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.component.machineTranslation.TranslateResult translate(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag, @org.jetbrains.annotations.NotNull()
    io.tolgee.constants.MtServiceType serviceType) {
        return null;
    }
    
    private io.tolgee.component.machineTranslation.TranslateResult findInCache(io.tolgee.component.machineTranslation.TranslationParams params) {
        return null;
    }
    
    private io.tolgee.component.machineTranslation.TranslateResult translateWithProvider(io.tolgee.component.machineTranslation.TranslationParams params) {
        return null;
    }
    
    private io.tolgee.component.machineTranslation.TranslationParams getParams(java.lang.String text, java.lang.String sourceLanguageTag, java.lang.String targetLanguageTag, io.tolgee.constants.MtServiceType serviceType) {
        return null;
    }
    
    private io.tolgee.component.machineTranslation.TranslateResult getFaked(io.tolgee.component.machineTranslation.TranslationParams params) {
        return null;
    }
    
    private java.lang.String findInCache(io.tolgee.component.machineTranslation.TranslationParams $this$findInCache) {
        return null;
    }
    
    private void cacheResult(io.tolgee.component.machineTranslation.TranslationParams $this$cacheResult, java.lang.String result) {
    }
    
    private org.springframework.cache.Cache getCache() {
        return null;
    }
    
    /**
     * Translates a text using All services
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.component.machineTranslation.TranslateResult> translate(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> targetLanguageTags, @org.jetbrains.annotations.NotNull()
    io.tolgee.constants.MtServiceType service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.component.machineTranslation.TranslateResult> translateToMultipleTargets(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.MtServiceType serviceType, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> targetLanguageTags) {
        return null;
    }
    
    /**
     * Returns sum price of all translations
     */
    public int calculatePrice(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.constants.MtServiceType service, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag) {
        return 0;
    }
    
    /**
     * Returns sum price of all translations
     */
    public int calculatePriceAll(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.constants.MtServiceType> services, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<io.tolgee.constants.MtServiceType, io.tolgee.component.machineTranslation.MtValueProvider> getProviders(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.constants.MtServiceType> $this$getProviders) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.component.machineTranslation.MtValueProvider getProvider(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.MtServiceType $this$getProvider) {
        return null;
    }
}