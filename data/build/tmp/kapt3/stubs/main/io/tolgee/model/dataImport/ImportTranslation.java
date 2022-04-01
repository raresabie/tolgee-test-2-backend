package io.tolgee.model.dataImport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0003H\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#\u00a8\u0006)"}, d2 = {"Lio/tolgee/model/dataImport/ImportTranslation;", "Lio/tolgee/model/StandardAuditModel;", "text", "", "language", "Lio/tolgee/model/dataImport/ImportLanguage;", "(Ljava/lang/String;Lio/tolgee/model/dataImport/ImportLanguage;)V", "conflict", "Lio/tolgee/model/translation/Translation;", "getConflict", "()Lio/tolgee/model/translation/Translation;", "setConflict", "(Lio/tolgee/model/translation/Translation;)V", "key", "Lio/tolgee/model/dataImport/ImportKey;", "getKey", "()Lio/tolgee/model/dataImport/ImportKey;", "setKey", "(Lio/tolgee/model/dataImport/ImportKey;)V", "getLanguage", "()Lio/tolgee/model/dataImport/ImportLanguage;", "setLanguage", "(Lio/tolgee/model/dataImport/ImportLanguage;)V", "override", "", "getOverride", "()Z", "setOverride", "(Z)V", "resolved", "getResolved", "resolvedHash", "getResolvedHash", "()Ljava/lang/String;", "setResolvedHash", "(Ljava/lang/String;)V", "getText", "setText", "resolve", "", "computeMurmur", "data"})
@javax.persistence.Entity()
public class ImportTranslation extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(columnDefinition = "text")
    private java.lang.String text;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne()
    private io.tolgee.model.dataImport.ImportLanguage language;
    @javax.persistence.ManyToOne(optional = false)
    public io.tolgee.model.dataImport.ImportKey key;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne()
    private io.tolgee.model.translation.Translation conflict;
    
    /**
     * Whether this translation will override the conflict
     */
    @com.sun.istack.NotNull()
    private boolean override = false;
    
    /**
     * If user resolved the conflict, this field stores hash of existing translation text
     * This field is then used to check whether the translation was not changed in meantime
     */
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column()
    private java.lang.String resolvedHash;
    
    public ImportTranslation(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage language) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getText() {
        return null;
    }
    
    public void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.ImportLanguage getLanguage() {
        return null;
    }
    
    public void setLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportLanguage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.dataImport.ImportKey getKey() {
        return null;
    }
    
    public void setKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.dataImport.ImportKey p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.translation.Translation getConflict() {
        return null;
    }
    
    public void setConflict(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.translation.Translation p0) {
    }
    
    public boolean getOverride() {
        return false;
    }
    
    public void setOverride(boolean p0) {
    }
    
    public boolean getResolved() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getResolvedHash() {
        return null;
    }
    
    public void setResolvedHash(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public void resolve() {
    }
    
    private java.lang.String computeMurmur(java.lang.String $this$computeMurmur) {
        return null;
    }
}