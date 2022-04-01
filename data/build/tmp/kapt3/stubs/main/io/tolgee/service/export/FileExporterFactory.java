package io.tolgee.service.export;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/tolgee/service/export/FileExporterFactory;", "", "()V", "create", "Lio/tolgee/service/export/exporters/FileExporter;", "data", "", "Lio/tolgee/service/export/dataProvider/ExportTranslationView;", "exportParams", "Lio/tolgee/dtos/request/export/ExportParams;", "baseTranslationsProvider", "Lkotlin/Function0;", "baseLanguage", "Lio/tolgee/model/Language;"})
@org.springframework.stereotype.Component()
public class FileExporterFactory {
    
    public FileExporterFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.export.exporters.FileExporter create(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> data, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportParams exportParams, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView>> baseTranslationsProvider, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language baseLanguage) {
        return null;
    }
}