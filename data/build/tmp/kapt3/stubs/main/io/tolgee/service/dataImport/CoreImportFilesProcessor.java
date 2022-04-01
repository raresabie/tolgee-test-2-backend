package io.tolgee.service.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J8\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u00020.2 \u00108\u001a\u001c\u0012\u0004\u0012\u00020:\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010;\u0012\u0004\u0012\u00020109H\u0002J>\u0010<\u001a\b\u0012\u0004\u0012\u000206052\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010;2 \u00108\u001a\u001c\u0012\u0004\u0012\u00020:\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010;\u0012\u0004\u0012\u00020109J\u000e\u0010>\u001a\u0004\u0018\u00010?*\u00020@H\u0002J\u0014\u0010A\u001a\u00020B*\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J\f\u0010F\u001a\u000201*\u00020CH\u0002J\f\u0010G\u001a\u000201*\u00020CH\u0002J\f\u0010H\u001a\u000201*\u00020CH\u0002J\f\u0010I\u001a\u000201*\u00020CH\u0002J\f\u0010J\u001a\u00020K*\u00020.H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u00020-*\u00020.8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010/\u00a8\u0006L"}, d2 = {"Lio/tolgee/service/dataImport/CoreImportFilesProcessor;", "", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "import", "Lio/tolgee/model/dataImport/Import;", "(Lorg/springframework/context/ApplicationContext;Lio/tolgee/model/dataImport/Import;)V", "getApplicationContext", "()Lorg/springframework/context/ApplicationContext;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "getAuthenticationFacade", "()Lio/tolgee/security/AuthenticationFacade;", "authenticationFacade$delegate", "Lkotlin/Lazy;", "getImport", "()Lio/tolgee/model/dataImport/Import;", "importDataManager", "Lio/tolgee/service/dataImport/ImportDataManager;", "importService", "Lio/tolgee/service/dataImport/ImportService;", "getImportService", "()Lio/tolgee/service/dataImport/ImportService;", "importService$delegate", "keyMetaService", "Lio/tolgee/service/KeyMetaService;", "getKeyMetaService", "()Lio/tolgee/service/KeyMetaService;", "keyMetaService$delegate", "languageService", "Lio/tolgee/service/LanguageService;", "getLanguageService", "()Lio/tolgee/service/LanguageService;", "languageService$delegate", "processorFactory", "Lio/tolgee/service/dataImport/processors/ProcessorFactory;", "getProcessorFactory", "()Lio/tolgee/service/dataImport/processors/ProcessorFactory;", "processorFactory$delegate", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "getTolgeeProperties", "()Lio/tolgee/configuration/tolgee/TolgeeProperties;", "tolgeeProperties$delegate", "isArchive", "", "Lio/tolgee/dtos/dataImport/ImportFileDto;", "(Lio/tolgee/dtos/dataImport/ImportFileDto;)Z", "addToStoredTranslations", "", "translation", "Lio/tolgee/model/dataImport/ImportTranslation;", "processFileOrArchive", "", "Lio/tolgee/exceptions/ErrorResponseBody;", "file", "messageClient", "Lkotlin/Function2;", "Lio/tolgee/dtos/dataImport/ImportStreamingProgressMessageType;", "", "processFiles", "files", "findMatchingExisting", "Lio/tolgee/model/Language;", "Lio/tolgee/model/dataImport/ImportLanguage;", "getOrCreateKey", "Lio/tolgee/model/dataImport/ImportKey;", "Lio/tolgee/service/dataImport/processors/FileProcessorContext;", "name", "", "mergeKeyMetas", "processLanguages", "processResult", "processTranslations", "saveFileEntity", "Lio/tolgee/model/dataImport/ImportFile;", "data"})
public final class CoreImportFilesProcessor {
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.context.ApplicationContext applicationContext = null;
    private final kotlin.Lazy importService$delegate = null;
    private final kotlin.Lazy keyMetaService$delegate = null;
    private final kotlin.Lazy languageService$delegate = null;
    private final kotlin.Lazy processorFactory$delegate = null;
    private final kotlin.Lazy tolgeeProperties$delegate = null;
    private final kotlin.Lazy authenticationFacade$delegate = null;
    private final io.tolgee.service.dataImport.ImportDataManager importDataManager = null;
    
    public CoreImportFilesProcessor(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p1_1555085778) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.context.ApplicationContext getApplicationContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.dataImport.Import getImport() {
        return null;
    }
    
    private final io.tolgee.service.dataImport.ImportService getImportService() {
        return null;
    }
    
    private final io.tolgee.service.KeyMetaService getKeyMetaService() {
        return null;
    }
    
    private final io.tolgee.service.LanguageService getLanguageService() {
        return null;
    }
    
    private final io.tolgee.service.dataImport.processors.ProcessorFactory getProcessorFactory() {
        return null;
    }
    
    private final io.tolgee.configuration.tolgee.TolgeeProperties getTolgeeProperties() {
        return null;
    }
    
    private final io.tolgee.security.AuthenticationFacade getAuthenticationFacade() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.exceptions.ErrorResponseBody> processFiles(@org.jetbrains.annotations.Nullable()
    java.util.List<io.tolgee.dtos.dataImport.ImportFileDto> files, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, ? super java.util.List<? extends java.lang.Object>, kotlin.Unit> messageClient) {
        return null;
    }
    
    private final java.util.List<io.tolgee.exceptions.ErrorResponseBody> processFileOrArchive(io.tolgee.dtos.dataImport.ImportFileDto file, kotlin.jvm.functions.Function2<? super io.tolgee.dtos.dataImport.ImportStreamingProgressMessageType, ? super java.util.List<? extends java.lang.Object>, kotlin.Unit> messageClient) {
        return null;
    }
    
    private final boolean isArchive(io.tolgee.dtos.dataImport.ImportFileDto $this$isArchive) {
        return false;
    }
    
    private final io.tolgee.model.dataImport.ImportFile saveFileEntity(io.tolgee.dtos.dataImport.ImportFileDto $this$saveFileEntity) {
        return null;
    }
    
    private final void processResult(io.tolgee.service.dataImport.processors.FileProcessorContext $this$processResult) {
    }
    
    private final void processLanguages(io.tolgee.service.dataImport.processors.FileProcessorContext $this$processLanguages) {
    }
    
    private final void addToStoredTranslations(io.tolgee.model.dataImport.ImportTranslation translation) {
    }
    
    private final io.tolgee.model.dataImport.ImportKey getOrCreateKey(io.tolgee.service.dataImport.processors.FileProcessorContext $this$getOrCreateKey, java.lang.String name) {
        return null;
    }
    
    private final io.tolgee.model.Language findMatchingExisting(io.tolgee.model.dataImport.ImportLanguage $this$findMatchingExisting) {
        return null;
    }
    
    private final void processTranslations(io.tolgee.service.dataImport.processors.FileProcessorContext $this$processTranslations) {
    }
    
    private final void mergeKeyMetas(io.tolgee.service.dataImport.processors.FileProcessorContext $this$mergeKeyMetas) {
    }
}