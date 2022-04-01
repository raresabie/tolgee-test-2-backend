package io.tolgee.model.translation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B#\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\t\u00a8\u0006."}, d2 = {"Lio/tolgee/model/translation/Translation;", "Lio/tolgee/model/StandardAuditModel;", "text", "", "key", "Lio/tolgee/model/key/Key;", "language", "Lio/tolgee/model/Language;", "(Ljava/lang/String;Lio/tolgee/model/key/Key;Lio/tolgee/model/Language;)V", "(Ljava/lang/String;)V", "auto", "", "getAuto", "()Z", "setAuto", "(Z)V", "comments", "", "Lio/tolgee/model/translation/TranslationComment;", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "getKey", "()Lio/tolgee/model/key/Key;", "setKey", "(Lio/tolgee/model/key/Key;)V", "getLanguage", "()Lio/tolgee/model/Language;", "setLanguage", "(Lio/tolgee/model/Language;)V", "mtProvider", "Lio/tolgee/constants/MtServiceType;", "getMtProvider", "()Lio/tolgee/constants/MtServiceType;", "setMtProvider", "(Lio/tolgee/constants/MtServiceType;)V", "state", "Lio/tolgee/model/enums/TranslationState;", "getState", "()Lio/tolgee/model/enums/TranslationState;", "setState", "(Lio/tolgee/model/enums/TranslationState;)V", "getText", "()Ljava/lang/String;", "setText", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"key_id", "language_id"}, name = "translation_key_language")})
@javax.persistence.Entity()
public class Translation extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(columnDefinition = "text")
    private java.lang.String text;
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne(optional = false)
    public io.tolgee.model.key.Key key;
    @javax.persistence.ManyToOne()
    public io.tolgee.model.Language language;
    @org.jetbrains.annotations.NotNull()
    @org.hibernate.annotations.ColumnDefault(value = "2")
    @javax.persistence.Enumerated()
    private io.tolgee.model.enums.TranslationState state = io.tolgee.model.enums.TranslationState.TRANSLATED;
    
    /**
     * Was translated automatically?
     */
    @org.hibernate.annotations.ColumnDefault(value = "false")
    private boolean auto = false;
    
    /**
     * Which machine translation provider was used to translate this value?
     */
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Enumerated()
    private io.tolgee.constants.MtServiceType mtProvider;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "translation")
    private java.util.List<io.tolgee.model.translation.TranslationComment> comments;
    
    public Translation() {
        super();
    }
    
    public Translation(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
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
    public io.tolgee.model.key.Key getKey() {
        return null;
    }
    
    public void setKey(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Language getLanguage() {
        return null;
    }
    
    public void setLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.enums.TranslationState getState() {
        return null;
    }
    
    public void setState(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationState p0) {
    }
    
    public boolean getAuto() {
        return false;
    }
    
    public void setAuto(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.constants.MtServiceType getMtProvider() {
        return null;
    }
    
    public void setMtProvider(@org.jetbrains.annotations.Nullable()
    io.tolgee.constants.MtServiceType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.translation.TranslationComment> getComments() {
        return null;
    }
    
    public void setComments(@org.jetbrains.annotations.NotNull()
    java.util.List<io.tolgee.model.translation.TranslationComment> p0) {
    }
    
    public Translation(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language) {
        super();
    }
}