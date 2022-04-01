package io.tolgee.service.dataImport.processors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/service/dataImport/processors/ImportFileProcessor;", "", "()V", "context", "Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "getContext", "()Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "languageNameGuesses", "", "", "getLanguageNameGuesses", "()Ljava/util/List;", "languageNameGuesses$delegate", "Lkotlin/Lazy;", "xmlEventReader", "Ljavax/xml/stream/XMLEventReader;", "getXmlEventReader", "()Ljavax/xml/stream/XMLEventReader;", "xmlEventReader$delegate", "process", "", "data"})
public abstract class ImportFileProcessor {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy languageNameGuesses$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy xmlEventReader$delegate = null;
    
    public ImportFileProcessor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.service.dataImport.processors.FileProcessorContext getContext();
    
    public abstract void process();
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLanguageNameGuesses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public javax.xml.stream.XMLEventReader getXmlEventReader() {
        return null;
    }
}