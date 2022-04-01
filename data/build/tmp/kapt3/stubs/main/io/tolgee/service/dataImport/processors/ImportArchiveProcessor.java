package io.tolgee.service.dataImport.processors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lio/tolgee/service/dataImport/processors/ImportArchiveProcessor;", "", "process", "", "Lio/tolgee/dtos/dataImport/ImportFileDto;", "file", "data"})
public abstract interface ImportArchiveProcessor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.dtos.dataImport.ImportFileDto> process(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.dataImport.ImportFileDto file);
}