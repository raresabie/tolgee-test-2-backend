package io.tolgee.service.dataImport.processors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\'\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00142\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0014J \u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u00142\b\u00105\u001a\u0004\u0018\u00010\u0001J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J#\u00108\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\fH\u00c6\u0003JK\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u0014H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010,\u001a\u00020\u0014H\u0002J\t\u0010B\u001a\u00020CH\u00d6\u0001J\t\u0010D\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R+\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010!\u00a8\u0006E"}, d2 = {"Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "", "file", "Lio/tolgee/dtos/dataImport/ImportFileDto;", "fileEntity", "Lio/tolgee/model/dataImport/ImportFile;", "messageClient", "Lkotlin/Function2;", "Lio/tolgee/dtos/dataImport/ImportStreamingProgressMessageType;", "", "", "maxTranslationTextLength", "", "(Lio/tolgee/dtos/dataImport/ImportFileDto;Lio/tolgee/model/dataImport/ImportFile;Lkotlin/jvm/functions/Function2;J)V", "getFile", "()Lio/tolgee/dtos/dataImport/ImportFileDto;", "getFileEntity", "()Lio/tolgee/model/dataImport/ImportFile;", "keys", "", "", "Lio/tolgee/model/dataImport/ImportKey;", "getKeys", "()Ljava/util/Map;", "languageNameGuesses", "getLanguageNameGuesses", "()Ljava/util/List;", "setLanguageNameGuesses", "(Ljava/util/List;)V", "languages", "Lio/tolgee/model/dataImport/ImportLanguage;", "getLanguages", "setLanguages", "(Ljava/util/Map;)V", "getMaxTranslationTextLength", "()J", "getMessageClient", "()Lkotlin/jvm/functions/Function2;", "translations", "", "Lio/tolgee/model/dataImport/ImportTranslation;", "getTranslations", "setTranslations", "addKeyCodeReference", "key", "path", "line", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "addKeyComment", "text", "addTranslation", "keyName", "languageName", "value", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getOrCreateKey", "name", "getOrCreateKeyMeta", "Lio/tolgee/model/key/KeyMeta;", "hashCode", "", "toString", "data"})
public final class FileProcessorContext {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.dataImport.ImportFileDto file = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.model.dataImport.ImportFile fileEntity = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, java.util.List<? extends java.lang.Object>, kotlin.Unit> messageClient = null;
    private final long maxTranslationTextLength = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, io.tolgee.model.dataImport.ImportLanguage> languages;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.util.List<io.tolgee.model.dataImport.ImportTranslation>> translations;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, io.tolgee.model.dataImport.ImportKey> keys = null;
    public java.util.List<java.lang.String> languageNameGuesses;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.service.dataImport.processors.FileProcessorContext copy(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.dataImport.ImportFileDto file, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportFile fileEntity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, ? super java.util.List<? extends java.lang.Object>, kotlin.Unit> messageClient, long maxTranslationTextLength) {
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
    
    public FileProcessorContext(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.dataImport.ImportFileDto file, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportFile fileEntity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, ? super java.util.List<? extends java.lang.Object>, kotlin.Unit> messageClient, long maxTranslationTextLength) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.dataImport.ImportFileDto component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.dataImport.ImportFileDto getFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.dataImport.ImportFile component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.dataImport.ImportFile getFileEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, java.util.List<? extends java.lang.Object>, kotlin.Unit> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, java.util.List<? extends java.lang.Object>, kotlin.Unit> getMessageClient() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getMaxTranslationTextLength() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.dataImport.ImportLanguage> getLanguages() {
        return null;
    }
    
    public final void setLanguages(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, io.tolgee.model.dataImport.ImportLanguage> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<io.tolgee.model.dataImport.ImportTranslation>> getTranslations() {
        return null;
    }
    
    public final void setTranslations(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.util.List<io.tolgee.model.dataImport.ImportTranslation>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.dataImport.ImportKey> getKeys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLanguageNameGuesses() {
        return null;
    }
    
    public final void setLanguageNameGuesses(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final void addTranslation(@org.jetbrains.annotations.NotNull()
    java.lang.String keyName, @org.jetbrains.annotations.NotNull()
    java.lang.String languageName, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    public final void addKeyComment(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void addKeyCodeReference(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.lang.Long line) {
    }
    
    private final io.tolgee.model.dataImport.ImportKey getOrCreateKey(java.lang.String name) {
        return null;
    }
    
    private final io.tolgee.model.key.KeyMeta getOrCreateKeyMeta(java.lang.String key) {
        return null;
    }
}