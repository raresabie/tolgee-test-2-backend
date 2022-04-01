package io.tolgee.component.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\"\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lio/tolgee/component/machineTranslation/MtValueProvider;", "", "isEnabled", "", "()Z", "calculatePrice", "", "text", "", "sourceLanguageTag", "targetLanguageTag", "translate", "data"})
public abstract interface MtValueProvider {
    
    public abstract boolean isEnabled();
    
    /**
     * Translates the text using the service
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String translate(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag);
    
    /**
     * Calculates credit price of the provider
     */
    public abstract int calculatePrice(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceLanguageTag, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLanguageTag);
}