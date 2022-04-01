package io.tolgee.service.export.exporters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u0013H&J\u001a\u0010\u0015\u001a\u00020\u0007*\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lio/tolgee/service/export/exporters/FileExporter;", "", "exportParams", "Lio/tolgee/dtos/request/export/ExportParams;", "getExportParams", "()Lio/tolgee/dtos/request/export/ExportParams;", "fileExtension", "", "getFileExtension", "()Ljava/lang/String;", "translations", "", "Lio/tolgee/service/export/dataProvider/ExportTranslationView;", "getTranslations", "()Ljava/util/List;", "getRealScopeDepth", "", "path", "produceFiles", "", "Ljava/io/InputStream;", "getFileAbsolutePath", "data"})
public abstract interface FileExporter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> getTranslations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.dtos.request.export.ExportParams getExportParams();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFileExtension();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.io.InputStream> produceFiles();
    
    public abstract int getRealScopeDepth(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> path);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getFileAbsolutePath(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.export.dataProvider.ExportTranslationView $this$getFileAbsolutePath, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> path);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static int getRealScopeDepth(@org.jetbrains.annotations.NotNull()
        io.tolgee.service.export.exporters.FileExporter $this, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> path) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.lang.String getFileAbsolutePath(@org.jetbrains.annotations.NotNull()
        io.tolgee.service.export.exporters.FileExporter $this, @org.jetbrains.annotations.NotNull()
        io.tolgee.service.export.dataProvider.ExportTranslationView $this$getFileAbsolutePath, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> path) {
            return null;
        }
    }
}