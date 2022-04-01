package io.tolgee.service.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002030*2\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020+J\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002030<2\u0006\u0010;\u001a\u00020+J\u000e\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020>H\u0002J \u0010B\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u0002030*0\b2\u0006\u0010;\u001a\u00020+J\u000e\u0010C\u001a\u00020>2\u0006\u0010D\u001a\u00020+J\u0006\u0010E\u001a\u00020>J\u0006\u0010F\u001a\u00020>R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\fR&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b\"\u0010#R\'\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020&0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b\'\u0010\fR!\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b,\u0010-R\'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b0\u0010\fR/\u00102\u001a \u0012\u0004\u0012\u00020+\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u0002030*0\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\fR\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u000e\u001a\u0004\b7\u00108\u00a8\u0006G"}, d2 = {"Lio/tolgee/service/dataImport/ImportDataManager;", "", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "import", "Lio/tolgee/model/dataImport/Import;", "(Lorg/springframework/context/ApplicationContext;Lio/tolgee/model/dataImport/Import;)V", "existingKeys", "", "", "Lio/tolgee/model/key/Key;", "getExistingKeys", "()Ljava/util/Map;", "existingKeys$delegate", "Lkotlin/Lazy;", "existingMetas", "Lio/tolgee/model/key/KeyMeta;", "getExistingMetas", "existingMetas$delegate", "existingTranslations", "", "Lio/tolgee/model/translation/Translation;", "importService", "Lio/tolgee/service/dataImport/ImportService;", "getImportService", "()Lio/tolgee/service/dataImport/ImportService;", "importService$delegate", "keyMetaService", "Lio/tolgee/service/KeyMetaService;", "getKeyMetaService", "()Lio/tolgee/service/KeyMetaService;", "keyMetaService$delegate", "keyService", "Lio/tolgee/service/KeyService;", "getKeyService", "()Lio/tolgee/service/KeyService;", "keyService$delegate", "storedKeys", "Lio/tolgee/model/dataImport/ImportKey;", "getStoredKeys", "storedKeys$delegate", "storedLanguages", "", "Lio/tolgee/model/dataImport/ImportLanguage;", "getStoredLanguages", "()Ljava/util/List;", "storedLanguages$delegate", "storedMetas", "getStoredMetas", "storedMetas$delegate", "storedTranslations", "Lio/tolgee/model/dataImport/ImportTranslation;", "getStoredTranslations", "translationService", "Lio/tolgee/service/TranslationService;", "getTranslationService", "()Lio/tolgee/service/TranslationService;", "translationService$delegate", "key", "language", "", "handleConflicts", "", "removeEqual", "", "populateExistingTranslations", "populateStoredTranslations", "resetConflicts", "importLanguage", "saveAllStoredKeys", "saveAllStoredTranslations", "data"})
public final class ImportDataManager {
    private final org.springframework.context.ApplicationContext applicationContext = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy importService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy keyService$delegate = null;
    private final kotlin.Lazy keyMetaService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy storedKeys$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy storedLanguages$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<io.tolgee.model.dataImport.ImportLanguage, java.util.Map<io.tolgee.model.dataImport.ImportKey, java.util.List<io.tolgee.model.dataImport.ImportTranslation>>> storedTranslations = null;
    private final java.util.Map<java.lang.Long, java.util.Map<java.lang.String, io.tolgee.model.translation.Translation>> existingTranslations = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy existingKeys$delegate = null;
    private final kotlin.Lazy translationService$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy storedMetas$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy existingMetas$delegate = null;
    
    public ImportDataManager(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.Import p1_1555085778) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.service.dataImport.ImportService getImportService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.service.KeyService getKeyService() {
        return null;
    }
    
    private final io.tolgee.service.KeyMetaService getKeyMetaService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.dataImport.ImportKey> getStoredKeys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.model.dataImport.ImportLanguage> getStoredLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<io.tolgee.model.dataImport.ImportLanguage, java.util.Map<io.tolgee.model.dataImport.ImportKey, java.util.List<io.tolgee.model.dataImport.ImportTranslation>>> getStoredTranslations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.key.Key> getExistingKeys() {
        return null;
    }
    
    private final io.tolgee.service.TranslationService getTranslationService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.key.KeyMeta> getStoredMetas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, io.tolgee.model.key.KeyMeta> getExistingMetas() {
        return null;
    }
    
    /**
     * Returns list of translations provided for a language and a key.
     * It returns collection since translations could collide, when an user uploads multiple files with different values
     * for a key
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.model.dataImport.ImportTranslation> getStoredTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportKey key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.model.dataImport.ImportTranslation> getStoredTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<io.tolgee.model.dataImport.ImportKey, java.util.List<io.tolgee.model.dataImport.ImportTranslation>> populateStoredTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage language) {
        return null;
    }
    
    /**
     * @param removeEqual Whether translations with equal texts should be removed
     */
    public final void handleConflicts(boolean removeEqual) {
    }
    
    private final void populateExistingTranslations() {
    }
    
    public final void saveAllStoredTranslations() {
    }
    
    public final void saveAllStoredKeys() {
    }
    
    public final void resetConflicts(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage importLanguage) {
    }
}