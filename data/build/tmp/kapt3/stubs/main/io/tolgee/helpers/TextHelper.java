package io.tolgee.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u0013"}, d2 = {"Lio/tolgee/helpers/TextHelper;", "", "()V", "isCharEscaped", "", "position", "", "fullString", "", "removeEscapes", "text", "replaceIcuParams", "Lio/tolgee/helpers/TextHelper$ReplaceIcuResult;", "string", "splitOnNonEscapedDelimiter", "", "delimiter", "", "ReplaceIcuResult", "data"})
public final class TextHelper {
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.helpers.TextHelper INSTANCE = null;
    
    private TextHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<java.lang.String> splitOnNonEscapedDelimiter(@org.jetbrains.annotations.NotNull()
    java.lang.String string, char delimiter) {
        return null;
    }
    
    private final boolean isCharEscaped(int position, java.lang.String fullString) {
        return false;
    }
    
    private final java.lang.String removeEscapes(java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.helpers.TextHelper.ReplaceIcuResult replaceIcuParams(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lio/tolgee/helpers/TextHelper$ReplaceIcuResult;", "", "text", "", "isComplex", "", "params", "", "(Ljava/lang/String;ZLjava/util/Map;)V", "()Z", "getParams", "()Ljava/util/Map;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "data"})
    public static final class ReplaceIcuResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        private final boolean isComplex = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.String> params = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.helpers.TextHelper.ReplaceIcuResult copy(@org.jetbrains.annotations.NotNull()
        java.lang.String text, boolean isComplex, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> params) {
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
        
        public ReplaceIcuResult(@org.jetbrains.annotations.NotNull()
        java.lang.String text, boolean isComplex, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> params) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isComplex() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getParams() {
            return null;
        }
    }
}