package io.tolgee.service.dataImport.processors.xliff;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/tolgee/service/dataImport/processors/xliff/Xliff12FileProcessor;", "Lio/tolgee/service/dataImport/processors/ImportFileProcessor;", "context", "Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "xmlEventReader", "Ljavax/xml/stream/XMLEventReader;", "(Lio/tolgee/service/dataImport/processors/FileProcessorContext;Ljavax/xml/stream/XMLEventReader;)V", "getContext", "()Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "currentOpenElement", "", "getCurrentOpenElement", "()Ljava/lang/String;", "isAnyToContentSaveOpen", "", "()Z", "of", "Ljavax/xml/stream/XMLOutputFactory;", "openElements", "", "sw", "Ljava/io/StringWriter;", "getXmlEventReader", "()Ljavax/xml/stream/XMLEventReader;", "xw", "Ljavax/xml/stream/XMLEventWriter;", "process", "", "Companion", "data"})
public final class Xliff12FileProcessor extends io.tolgee.service.dataImport.processors.ImportFileProcessor {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.service.dataImport.processors.FileProcessorContext context = null;
    @org.jetbrains.annotations.NotNull()
    private final javax.xml.stream.XMLEventReader xmlEventReader = null;
    private final java.util.List<java.lang.String> openElements = null;
    private java.io.StringWriter sw;
    private final javax.xml.stream.XMLOutputFactory of = null;
    private javax.xml.stream.XMLEventWriter xw;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.dataImport.processors.xliff.Xliff12FileProcessor.Companion Companion = null;
    private static final java.util.List<java.lang.String> contentSaveElements = null;
    
    public Xliff12FileProcessor(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.processors.FileProcessorContext context, @org.jetbrains.annotations.NotNull()
    javax.xml.stream.XMLEventReader xmlEventReader) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.tolgee.service.dataImport.processors.FileProcessorContext getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public javax.xml.stream.XMLEventReader getXmlEventReader() {
        return null;
    }
    
    private final java.lang.String getCurrentOpenElement() {
        return null;
    }
    
    @java.lang.Override()
    public void process() {
    }
    
    private final boolean isAnyToContentSaveOpen() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lio/tolgee/service/dataImport/processors/xliff/Xliff12FileProcessor$Companion;", "", "()V", "contentSaveElements", "", "", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}