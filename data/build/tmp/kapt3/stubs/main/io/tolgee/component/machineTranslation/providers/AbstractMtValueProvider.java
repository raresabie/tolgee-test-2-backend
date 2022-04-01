package io.tolgee.component.machineTranslation.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H$J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H$R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/component/machineTranslation/providers/AbstractMtValueProvider;", "Lio/tolgee/component/machineTranslation/MtValueProvider;", "()V", "supportedLanguages", "", "", "getSupportedLanguages", "()[Ljava/lang/String;", "toSuitableTag", "getToSuitableTag", "(Ljava/lang/String;)Ljava/lang/String;", "calculatePrice", "", "text", "sourceLanguageTag", "targetLanguageTag", "calculateProviderPrice", "translate", "translateViaProvider", "sourceTag", "targetTag", "data"})
public abstract class AbstractMtValueProvider implements io.tolgee.component.machineTranslation.MtValueProvider {
    
    public AbstractMtValueProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String[] getSupportedLanguages();
    
    private final java.lang.String getToSuitableTag(java.lang.String $this$toSuitableTag) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String translate(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag) {
        return null;
    }
    
    @java.lang.Override()
    public int calculatePrice(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag) {
        return 0;
    }
    
    /**
     * Translates the text via provider.
     * All inputs are already checked.
     */
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.String translateViaProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetTag);
    
    /**
     * Calculates provider's credit price.
     * All inputs are already checked.
     */
    protected abstract int calculateProviderPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
}