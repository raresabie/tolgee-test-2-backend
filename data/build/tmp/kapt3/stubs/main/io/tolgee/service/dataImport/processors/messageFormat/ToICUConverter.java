package io.tolgee.service.dataImport.processors.messageFormat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lio/tolgee/service/dataImport/processors/messageFormat/ToICUConverter;", "", "locale", "Lcom/ibm/icu/util/ULocale;", "format", "Lio/tolgee/service/dataImport/processors/messageFormat/SupportedFormat;", "context", "Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "(Lcom/ibm/icu/util/ULocale;Lio/tolgee/service/dataImport/processors/messageFormat/SupportedFormat;Lio/tolgee/service/dataImport/processors/FileProcessorContext;)V", "convert", "", "message", "convertC", "convertCLike", "regex", "Lkotlin/text/Regex;", "numberSpecifiers", "convertPhp", "convertPoPlural", "pluralForms", "", "", "convertPython", "findSuitableExample", "key", "getGroupOrNull", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "Companion", "data"})
public final class ToICUConverter {
    private final com.ibm.icu.util.ULocale locale = null;
    private final io.tolgee.service.dataImport.processors.messageFormat.SupportedFormat format = null;
    private final io.tolgee.service.dataImport.processors.FileProcessorContext context = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.dataImport.processors.messageFormat.ToICUConverter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex PHP_PARAM_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex C_PARAM_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.text.Regex PYTHON_PARAM_REGEX = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PHP_NUMBER_SPECIFIERS = "dfeEfFgGhH";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String C_NUMBER_SPECIFIERS = "diuoxXfFeEgG";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PYTHON_NUMBER_SPECIFIERS = "diouxXeEfFgG";
    
    public ToICUConverter(@org.jetbrains.annotations.NotNull()
    com.ibm.icu.util.ULocale locale, @org.jetbrains.annotations.Nullable()
    io.tolgee.service.dataImport.processors.messageFormat.SupportedFormat format, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.processors.FileProcessorContext context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convert(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertPoPlural(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.String> pluralForms) {
        return null;
    }
    
    private final int findSuitableExample(int key) {
        return 0;
    }
    
    private final java.lang.String convertPhp(java.lang.String message) {
        return null;
    }
    
    private final java.lang.String convertC(java.lang.String message) {
        return null;
    }
    
    private final java.lang.String convertPython(java.lang.String message) {
        return null;
    }
    
    private final java.lang.String convertCLike(java.lang.String message, kotlin.text.Regex regex, java.lang.String numberSpecifiers) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.text.MatchGroup getGroupOrNull(@org.jetbrains.annotations.NotNull()
    kotlin.text.MatchGroupCollection $this$getGroupOrNull, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lio/tolgee/service/dataImport/processors/messageFormat/ToICUConverter$Companion;", "", "()V", "C_NUMBER_SPECIFIERS", "", "getC_NUMBER_SPECIFIERS", "()Ljava/lang/String;", "C_PARAM_REGEX", "Lkotlin/text/Regex;", "getC_PARAM_REGEX", "()Lkotlin/text/Regex;", "PHP_NUMBER_SPECIFIERS", "getPHP_NUMBER_SPECIFIERS", "PHP_PARAM_REGEX", "getPHP_PARAM_REGEX", "PYTHON_NUMBER_SPECIFIERS", "getPYTHON_NUMBER_SPECIFIERS", "PYTHON_PARAM_REGEX", "getPYTHON_PARAM_REGEX", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.text.Regex getPHP_PARAM_REGEX() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.text.Regex getC_PARAM_REGEX() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.text.Regex getPYTHON_PARAM_REGEX() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPHP_NUMBER_SPECIFIERS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getC_NUMBER_SPECIFIERS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPYTHON_NUMBER_SPECIFIERS() {
            return null;
        }
    }
}