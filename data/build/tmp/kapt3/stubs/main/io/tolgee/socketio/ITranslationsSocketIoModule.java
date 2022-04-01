package io.tolgee.socketio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&\u00a8\u0006\u0014"}, d2 = {"Lio/tolgee/socketio/ITranslationsSocketIoModule;", "", "onKeyChange", "", "key", "Lio/tolgee/model/key/Key;", "event", "Lio/tolgee/socketio/TranslationEvent;", "onKeyCreated", "onKeyDeleted", "onKeyModified", "oldName", "", "onTranslationsChange", "translations", "", "Lio/tolgee/model/translation/Translation;", "onTranslationsCreated", "onTranslationsDeleted", "onTranslationsModified", "data"})
public abstract interface ITranslationsSocketIoModule {
    
    public abstract void onKeyCreated(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key);
    
    public abstract void onKeyModified(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    java.lang.String oldName);
    
    public abstract void onKeyDeleted(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key);
    
    public abstract void onKeyChange(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.socketio.TranslationEvent event);
    
    public abstract void onTranslationsCreated(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.translation.Translation> translations);
    
    public abstract void onTranslationsModified(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.translation.Translation> translations);
    
    public abstract void onTranslationsDeleted(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.translation.Translation> translations);
    
    public abstract void onTranslationsChange(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.translation.Translation> translations, @org.jetbrains.annotations.NotNull()
    io.tolgee.socketio.TranslationEvent event);
}