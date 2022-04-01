package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J=\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006,"}, d2 = {"Lio/tolgee/model/views/KeyWithTranslationsView;", "", "keyId", "", "keyName", "", "screenshotCount", "translations", "", "Lio/tolgee/model/views/TranslationView;", "(JLjava/lang/String;JLjava/util/Map;)V", "getKeyId", "()J", "getKeyName", "()Ljava/lang/String;", "keyTags", "", "Lio/tolgee/model/key/Tag;", "getKeyTags", "()Ljava/util/List;", "setKeyTags", "(Ljava/util/List;)V", "getScreenshotCount", "screenshots", "", "Lio/tolgee/model/Screenshot;", "getScreenshots", "()Ljava/util/Collection;", "setScreenshots", "(Ljava/util/Collection;)V", "getTranslations", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "data"})
public final class KeyWithTranslationsView {
    private final long keyId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String keyName = null;
    private final long screenshotCount = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, io.tolgee.model.views.TranslationView> translations = null;
    public java.util.List<? extends io.tolgee.model.key.Tag> keyTags;
    @org.jetbrains.annotations.Nullable()
    private java.util.Collection<? extends io.tolgee.model.Screenshot> screenshots;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.model.views.KeyWithTranslationsView.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.views.KeyWithTranslationsView copy(long keyId, @org.jetbrains.annotations.NotNull()
    java.lang.String keyName, long screenshotCount, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, io.tolgee.model.views.TranslationView> translations) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public KeyWithTranslationsView(long keyId, @org.jetbrains.annotations.NotNull()
    java.lang.String keyName, long screenshotCount, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, io.tolgee.model.views.TranslationView> translations) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getKeyId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyName() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getScreenshotCount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.views.TranslationView> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.views.TranslationView> getTranslations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.model.key.Tag> getKeyTags() {
        return null;
    }
    
    public final void setKeyTags(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.key.Tag> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Collection<io.tolgee.model.Screenshot> getScreenshots() {
        return null;
    }
    
    public final void setScreenshots(@org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends io.tolgee.model.Screenshot> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/tolgee/model/views/KeyWithTranslationsView$Companion;", "", "()V", "of", "Lio/tolgee/model/views/KeyWithTranslationsView;", "queryData", "", "([Ljava/lang/Object;)Lio/tolgee/model/views/KeyWithTranslationsView;", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.model.views.KeyWithTranslationsView of(@org.jetbrains.annotations.NotNull()
        java.lang.Object[] queryData) {
            return null;
        }
    }
}