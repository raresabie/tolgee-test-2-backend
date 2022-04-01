package io.tolgee.service.dataImport.processors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/service/dataImport/processors/ProcessorFactory;", "", "()V", "fileNameExtension", "", "getFileNameExtension", "(Ljava/lang/String;)Ljava/lang/String;", "getArchiveProcessor", "Lio/tolgee/service/dataImport/processors/ImportArchiveProcessor;", "file", "Lio/tolgee/dtos/dataImport/ImportFileDto;", "getProcessor", "Lio/tolgee/service/dataImport/processors/ImportFileProcessor;", "context", "Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "data"})
@org.springframework.stereotype.Component()
public class ProcessorFactory {
    
    public ProcessorFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.dataImport.processors.ImportArchiveProcessor getArchiveProcessor(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.dataImport.ImportFileDto file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.dataImport.processors.ImportFileProcessor getProcessor(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.dataImport.ImportFileDto file, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.processors.FileProcessorContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getFileNameExtension(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$fileNameExtension) {
        return null;
    }
}