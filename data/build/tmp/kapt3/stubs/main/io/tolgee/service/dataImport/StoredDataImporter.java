package io.tolgee.service.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001d\u001a\u00020\u001eJ\f\u0010\u001f\u001a\u00020\u001e*\u00020\u001aH\u0002J\f\u0010\u001d\u001a\u00020\u001e*\u00020 H\u0002J\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \r*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u00020\u0013*\u00020\u001a8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006!"}, d2 = {"Lio/tolgee/service/dataImport/StoredDataImporter;", "", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "import", "Lio/tolgee/model/dataImport/Import;", "forceMode", "Lio/tolgee/service/dataImport/ForceMode;", "(Lorg/springframework/context/ApplicationContext;Lio/tolgee/model/dataImport/Import;Lio/tolgee/service/dataImport/ForceMode;)V", "importDataManager", "Lio/tolgee/service/dataImport/ImportDataManager;", "keyMetaService", "Lio/tolgee/service/KeyMetaService;", "kotlin.jvm.PlatformType", "keyService", "Lio/tolgee/service/KeyService;", "keysToSave", "", "", "Lio/tolgee/model/key/Key;", "translationService", "Lio/tolgee/service/TranslationService;", "translationsToSave", "", "Lio/tolgee/model/translation/Translation;", "existingKey", "Lio/tolgee/model/dataImport/ImportTranslation;", "getExistingKey", "(Lio/tolgee/model/dataImport/ImportTranslation;)Lio/tolgee/model/key/Key;", "doImport", "", "checkConflictResolved", "Lio/tolgee/model/dataImport/ImportLanguage;", "data"})
public final class StoredDataImporter {
    private final io.tolgee.service.dataImport.ForceMode forceMode = null;
    private final io.tolgee.service.dataImport.ImportDataManager importDataManager = null;
    private final io.tolgee.service.KeyService keyService = null;
    private final io.tolgee.service.KeyMetaService keyMetaService = null;
    private final java.util.List<io.tolgee.model.translation.Translation> translationsToSave = null;
    
    /**
     * We need to persist data after everything is checked for resolved conflicts since
     * thrown ImportConflictNotResolvedException commits the transaction,
     * looking for key in this map is also faster then querying database
     */
    private final java.util.Map<java.lang.String, io.tolgee.model.key.Key> keysToSave = null;
    
    /**
     * We need to persist data after everything is checked for resolved conflicts since
     * thrown ImportConflictNotResolvedException commits the transaction
     */
    private final io.tolgee.service.TranslationService translationService = null;
    
    public StoredDataImporter(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p1_1555085778, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.ForceMode forceMode) {
        super();
    }
    
    public final void doImport() {
    }
    
    private final void doImport(io.tolgee.model.dataImport.ImportLanguage $this$doImport) {
    }
    
    private final void doImport(io.tolgee.model.dataImport.ImportTranslation $this$doImport) {
    }
    
    private final io.tolgee.model.key.Key getExistingKey(io.tolgee.model.dataImport.ImportTranslation $this$existingKey) {
        return null;
    }
    
    private final void checkConflictResolved(io.tolgee.model.dataImport.ImportTranslation $this$checkConflictResolved) {
    }
}