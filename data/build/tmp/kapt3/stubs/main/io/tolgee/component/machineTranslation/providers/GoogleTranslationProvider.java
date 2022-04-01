package io.tolgee.component.machineTranslation.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0014J\"\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00058RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/component/machineTranslation/providers/GoogleTranslationProvider;", "Lio/tolgee/component/machineTranslation/providers/AbstractMtValueProvider;", "googleMachineTranslationProperties", "Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;", "translate", "Lcom/google/cloud/translate/Translate;", "(Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;Lcom/google/cloud/translate/Translate;)V", "isEnabled", "", "()Z", "supportedLanguages", "", "", "getSupportedLanguages", "()[Ljava/lang/String;", "[Ljava/lang/String;", "translateService", "getTranslateService", "()Lcom/google/cloud/translate/Translate;", "translateService$delegate", "Lkotlin/Lazy;", "calculateProviderPrice", "", "text", "translateViaProvider", "sourceTag", "targetTag", "data"})
@org.springframework.context.annotation.Scope(value = "singleton")
@org.springframework.stereotype.Component()
public class GoogleTranslationProvider extends io.tolgee.component.machineTranslation.providers.AbstractMtValueProvider {
    private final io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties googleMachineTranslationProperties = null;
    private final com.google.cloud.translate.Translate translate = null;
    private final kotlin.Lazy translateService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] supportedLanguages = {"af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "ny", "zh-CN", "zh-TW", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "tl", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "iw", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jw", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "or", "ps", "fa", "pl", "pt", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu", "he", "zh"};
    
    public GoogleTranslationProvider(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties googleMachineTranslationProperties, @org.jetbrains.annotations.Nullable()
    com.google.cloud.translate.Translate translate) {
        super();
    }
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String translateViaProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetTag) {
        return null;
    }
    
    @java.lang.Override()
    protected int calculateProviderPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return 0;
    }
    
    private com.google.cloud.translate.Translate getTranslateService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String[] getSupportedLanguages() {
        return null;
    }
}