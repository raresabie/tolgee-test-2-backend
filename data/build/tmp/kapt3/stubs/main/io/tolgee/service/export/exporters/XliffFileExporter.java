package io.tolgee.service.export.exporters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001/B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"2\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0004H\u0002J\u001e\u0010%\u001a\u00020\u00182\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010#\u001a\u00020\u0004H\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0\u000fH\u0016J\u0014\u0010*\u001a\u00020\u001e*\u00020 2\u0006\u0010+\u001a\u00020\u0010H\u0002J\u0012\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-*\u00020\u0010H\u0002R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00060"}, d2 = {"Lio/tolgee/service/export/exporters/XliffFileExporter;", "Lio/tolgee/service/export/exporters/FileExporter;", "translations", "", "Lio/tolgee/service/export/dataProvider/ExportTranslationView;", "exportParams", "Lio/tolgee/dtos/request/export/ExportParams;", "baseTranslationsProvider", "Lkotlin/Function0;", "baseLanguage", "Lio/tolgee/model/Language;", "(Ljava/util/List;Lio/tolgee/dtos/request/export/ExportParams;Lkotlin/jvm/functions/Function0;Lio/tolgee/model/Language;)V", "getBaseLanguage", "()Lio/tolgee/model/Language;", "baseTranslations", "", "", "getExportParams", "()Lio/tolgee/dtos/request/export/ExportParams;", "fileExtension", "getFileExtension", "()Ljava/lang/String;", "result", "", "Lio/tolgee/service/export/exporters/XliffFileExporter$ResultItem;", "getResult", "()Ljava/util/Map;", "getTranslations", "()Ljava/util/List;", "addToFileElement", "", "fileBodyElement", "Lorg/dom4j/Element;", "pathItems", "", "translation", "createBaseDocumentStructure", "getResultItem", "path", "prepare", "produceFiles", "Ljava/io/InputStream;", "addFromHtmlOrText", "string", "parseHtml", "", "Lorg/dom4j/Node;", "ResultItem", "data"})
public final class XliffFileExporter implements io.tolgee.service.export.exporters.FileExporter {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> translations = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.request.export.ExportParams exportParams = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.model.Language baseLanguage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fileExtension = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, io.tolgee.service.export.exporters.XliffFileExporter.ResultItem> result = null;
    private final java.util.Map<java.lang.String, io.tolgee.service.export.dataProvider.ExportTranslationView> baseTranslations = null;
    
    public XliffFileExporter(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> translations, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportParams exportParams, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView>> baseTranslationsProvider, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language baseLanguage) {
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
    public final io.tolgee.model.Language getBaseLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFileExtension() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.service.export.exporters.XliffFileExporter.ResultItem> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.io.InputStream> produceFiles() {
        return null;
    }
    
    private final void prepare() {
    }
    
    private final void addToFileElement(org.dom4j.Element fileBodyElement, java.util.List<java.lang.String> pathItems, io.tolgee.service.export.dataProvider.ExportTranslationView translation) {
    }
    
    private final io.tolgee.service.export.exporters.XliffFileExporter.ResultItem getResultItem(java.util.List<java.lang.String> path, io.tolgee.service.export.dataProvider.ExportTranslationView translation) {
        return null;
    }
    
    private final io.tolgee.service.export.exporters.XliffFileExporter.ResultItem createBaseDocumentStructure(io.tolgee.service.export.dataProvider.ExportTranslationView translation) {
        return null;
    }
    
    private final java.util.Iterator<org.dom4j.Node> parseHtml(java.lang.String $this$parseHtml) {
        return null;
    }
    
    /**
     * For string containing something, which is not parseable as xml such as
     * "Value has to be < 1"
     * It just appends text.
     */
    private final void addFromHtmlOrText(org.dom4j.Element $this$addFromHtmlOrText, java.lang.String string) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/service/export/exporters/XliffFileExporter$ResultItem;", "", "document", "Lorg/dom4j/Document;", "fileBodyElement", "Lorg/dom4j/Element;", "(Lorg/dom4j/Document;Lorg/dom4j/Element;)V", "getDocument", "()Lorg/dom4j/Document;", "getFileBodyElement", "()Lorg/dom4j/Element;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data"})
    public static final class ResultItem {
        @org.jetbrains.annotations.NotNull()
        private final org.dom4j.Document document = null;
        @org.jetbrains.annotations.NotNull()
        private final org.dom4j.Element fileBodyElement = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.service.export.exporters.XliffFileExporter.ResultItem copy(@org.jetbrains.annotations.NotNull()
        org.dom4j.Document document, @org.jetbrains.annotations.NotNull()
        org.dom4j.Element fileBodyElement) {
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
        
        public ResultItem(@org.jetbrains.annotations.NotNull()
        org.dom4j.Document document, @org.jetbrains.annotations.NotNull()
        org.dom4j.Element fileBodyElement) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.dom4j.Document component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.dom4j.Document getDocument() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.dom4j.Element component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.dom4j.Element getFileBodyElement() {
            return null;
        }
    }
}