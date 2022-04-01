package io.tolgee.service.dataImport.processors.po;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010\'\u001a\u00020 H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006("}, d2 = {"Lio/tolgee/service/dataImport/processors/po/PoFileProcessor;", "Lio/tolgee/service/dataImport/processors/ImportFileProcessor;", "context", "Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "(Lio/tolgee/service/dataImport/processors/FileProcessorContext;)V", "getContext", "()Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "detectedFormat", "Lio/tolgee/service/dataImport/processors/messageFormat/SupportedFormat;", "getDetectedFormat", "()Lio/tolgee/service/dataImport/processors/messageFormat/SupportedFormat;", "detectedFormat$delegate", "Lkotlin/Lazy;", "languageId", "", "getLanguageId", "()Ljava/lang/String;", "setLanguageId", "(Ljava/lang/String;)V", "parsed", "Lio/tolgee/service/dataImport/processors/po/data/PoParserResult;", "getParsed", "()Lio/tolgee/service/dataImport/processors/po/data/PoParserResult;", "setParsed", "(Lio/tolgee/service/dataImport/processors/po/data/PoParserResult;)V", "poParser", "Lio/tolgee/service/dataImport/processors/po/PoParser;", "getPoParser", "()Lio/tolgee/service/dataImport/processors/po/PoParser;", "setPoParser", "(Lio/tolgee/service/dataImport/processors/po/PoParser;)V", "addPlural", "", "poTranslation", "Lio/tolgee/service/dataImport/processors/po/data/PoParsedTranslation;", "getMessageFormat", "poParsedTranslation", "getToIcuConverter", "Lio/tolgee/service/dataImport/processors/messageFormat/ToICUConverter;", "process", "data"})
public final class PoFileProcessor extends io.tolgee.service.dataImport.processors.ImportFileProcessor {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.service.dataImport.processors.FileProcessorContext context = null;
    public java.lang.String languageId;
    public io.tolgee.service.dataImport.processors.po.data.PoParserResult parsed;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.service.dataImport.processors.po.PoParser poParser;
    private final kotlin.Lazy detectedFormat$delegate = null;
    
    public PoFileProcessor(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.processors.FileProcessorContext context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.tolgee.service.dataImport.processors.FileProcessorContext getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguageId() {
        return null;
    }
    
    public final void setLanguageId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.service.dataImport.processors.po.data.PoParserResult getParsed() {
        return null;
    }
    
    public final void setParsed(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.processors.po.data.PoParserResult p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.service.dataImport.processors.po.PoParser getPoParser() {
        return null;
    }
    
    public final void setPoParser(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.processors.po.PoParser p0) {
    }
    
    @java.lang.Override()
    public void process() {
    }
    
    private final void addPlural(io.tolgee.service.dataImport.processors.po.data.PoParsedTranslation poTranslation) {
    }
    
    private final io.tolgee.service.dataImport.processors.messageFormat.ToICUConverter getToIcuConverter(io.tolgee.service.dataImport.processors.po.data.PoParsedTranslation poTranslation) {
        return null;
    }
    
    private final io.tolgee.service.dataImport.processors.messageFormat.SupportedFormat getMessageFormat(io.tolgee.service.dataImport.processors.po.data.PoParsedTranslation poParsedTranslation) {
        return null;
    }
    
    private final io.tolgee.service.dataImport.processors.messageFormat.SupportedFormat getDetectedFormat() {
        return null;
    }
}