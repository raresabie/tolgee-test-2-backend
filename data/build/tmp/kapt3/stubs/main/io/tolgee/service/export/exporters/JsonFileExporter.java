package io.tolgee.service.export.exporters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007JF\u0010\u0016\u001a\u00020\u00172&\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J>\u0010\u001b\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u001a\u001a\u00020\u0004H\u0002JF\u0010\u001d\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032&\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00112\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!0 H\u0016J<\u0010\"\u001a\u00020\u0017*\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR[\u0010\u000e\u001aL\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u000fj.\u0012\u0004\u0012\u00020\u000b\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u0011`\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006$"}, d2 = {"Lio/tolgee/service/export/exporters/JsonFileExporter;", "Lio/tolgee/service/export/exporters/FileExporter;", "translations", "", "Lio/tolgee/service/export/dataProvider/ExportTranslationView;", "exportParams", "Lio/tolgee/dtos/request/export/ExportParams;", "(Ljava/util/List;Lio/tolgee/dtos/request/export/ExportParams;)V", "getExportParams", "()Lio/tolgee/dtos/request/export/ExportParams;", "fileExtension", "", "getFileExtension", "()Ljava/lang/String;", "result", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "getResult", "()Ljava/util/LinkedHashMap;", "getTranslations", "()Ljava/util/List;", "addToMap", "", "content", "pathItems", "translation", "getFileContentResultMap", "path", "handleExistingStringScopeCollision", "prepare", "produceFiles", "", "Ljava/io/InputStream;", "putTranslationText", "key", "data"})
public final class JsonFileExporter implements io.tolgee.service.export.exporters.FileExporter {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> translations = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.request.export.ExportParams exportParams = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fileExtension = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, java.lang.Object>> result = null;
    
    public JsonFileExporter(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> translations, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportParams exportParams) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> getTranslations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.tolgee.dtos.request.export.ExportParams getExportParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFileExtension() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, java.lang.Object>> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.io.InputStream> produceFiles() {
        return null;
    }
    
    private final void prepare() {
    }
    
    private final java.util.LinkedHashMap<java.lang.String, java.lang.Object> getFileContentResultMap(java.util.List<java.lang.String> path, io.tolgee.service.export.dataProvider.ExportTranslationView translation) {
        return null;
    }
    
    private final void addToMap(java.util.LinkedHashMap<java.lang.String, java.lang.Object> content, java.util.List<java.lang.String> pathItems, io.tolgee.service.export.dataProvider.ExportTranslationView translation) {
    }
    
    private final void handleExistingStringScopeCollision(java.util.List<java.lang.String> pathItems, java.util.LinkedHashMap<java.lang.String, java.lang.Object> content, io.tolgee.service.export.dataProvider.ExportTranslationView translation) {
    }
    
    private final void putTranslationText(java.util.LinkedHashMap<java.lang.String, java.lang.Object> $this$putTranslationText, java.lang.String key, io.tolgee.service.export.dataProvider.ExportTranslationView translation) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getFileAbsolutePath(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.export.dataProvider.ExportTranslationView $this$getFileAbsolutePath, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> path) {
        return null;
    }
    
    public int getRealScopeDepth(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> path) {
        return 0;
    }
}