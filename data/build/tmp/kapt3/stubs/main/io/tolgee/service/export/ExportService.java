package io.tolgee.service.export;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/tolgee/service/export/ExportService;", "", "fileExporterFactory", "Lio/tolgee/service/export/FileExporterFactory;", "projectService", "Lio/tolgee/service/ProjectService;", "entityManager", "Ljavax/persistence/EntityManager;", "(Lio/tolgee/service/export/FileExporterFactory;Lio/tolgee/service/ProjectService;Ljavax/persistence/EntityManager;)V", "export", "", "", "Ljava/io/InputStream;", "projectId", "", "exportParams", "Lio/tolgee/dtos/request/export/ExportParams;", "getBaseTranslationsProvider", "Lkotlin/Function0;", "", "Lio/tolgee/service/export/dataProvider/ExportTranslationView;", "baseLanguage", "Lio/tolgee/model/Language;", "getDataForExport", "getProjectBaseLanguage", "data"})
@org.springframework.stereotype.Service()
public class ExportService {
    private final io.tolgee.service.export.FileExporterFactory fileExporterFactory = null;
    private final io.tolgee.service.ProjectService projectService = null;
    private final javax.persistence.EntityManager entityManager = null;
    
    public ExportService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.export.FileExporterFactory fileExporterFactory, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService projectService, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.String, java.io.InputStream> export(long projectId, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportParams exportParams) {
        return null;
    }
    
    /**
     * Base translations are not required for all Formatters.
     * So formatters which need them can call the provider.
     */
    private kotlin.jvm.functions.Function0<java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView>> getBaseTranslationsProvider(io.tolgee.dtos.request.export.ExportParams exportParams, long projectId, io.tolgee.model.Language baseLanguage) {
        return null;
    }
    
    private java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> getDataForExport(long projectId, io.tolgee.dtos.request.export.ExportParams exportParams) {
        return null;
    }
    
    private io.tolgee.model.Language getProjectBaseLanguage(long projectId) {
        return null;
    }
}