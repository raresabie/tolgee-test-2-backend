package io.tolgee.events;

import java.lang.System;

/**
 * This event is dispatched when base translation for some key provided.
 * It is dispatched even when new key is created with base translation provided
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lio/tolgee/events/OnTranslationsSet;", "Lorg/springframework/context/ApplicationEvent;", "source", "", "key", "Lio/tolgee/model/key/Key;", "oldValues", "", "", "translations", "", "Lio/tolgee/model/translation/Translation;", "(Ljava/lang/Object;Lio/tolgee/model/key/Key;Ljava/util/Map;Ljava/util/List;)V", "getKey", "()Lio/tolgee/model/key/Key;", "getOldValues", "()Ljava/util/Map;", "getTranslations", "()Ljava/util/List;", "data"})
public final class OnTranslationsSet extends org.springframework.context.ApplicationEvent {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.model.key.Key key = null;
    
    /**
     * Map of old values languageTag -> String
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> oldValues = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.tolgee.model.translation.Translation> translations = null;
    
    public OnTranslationsSet(@org.jetbrains.annotations.NotNull()
    java.lang.Object source, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> oldValues, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.translation.Translation> translations) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.key.Key getKey() {
        return null;
    }
    
    /**
     * Map of old values languageTag -> String
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getOldValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.model.translation.Translation> getTranslations() {
        return null;
    }
}