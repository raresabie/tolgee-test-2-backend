package io.tolgee.service.dataImport.processors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\b"}, d2 = {"Lio/tolgee/service/dataImport/processors/ZipTypeProcessor;", "Lio/tolgee/service/dataImport/processors/ImportArchiveProcessor;", "()V", "process", "", "Lio/tolgee/dtos/dataImport/ImportFileDto;", "file", "Companion", "data"})
public final class ZipTypeProcessor implements io.tolgee.service.dataImport.processors.ImportArchiveProcessor {
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.dataImport.processors.ZipTypeProcessor.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] IGNORE_PREFIXES = {"__", "."};
    
    public ZipTypeProcessor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.tolgee.dtos.dataImport.ImportFileDto> process(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.dataImport.ImportFileDto file) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lio/tolgee/service/dataImport/processors/ZipTypeProcessor$Companion;", "", "()V", "IGNORE_PREFIXES", "", "", "getIGNORE_PREFIXES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getIGNORE_PREFIXES() {
            return null;
        }
    }
}