package io.tolgee.model.translation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/model/translation/TranslationComment;", "Lio/tolgee/model/StandardAuditModel;", "text", "", "state", "Lio/tolgee/model/enums/TranslationCommentState;", "translation", "Lio/tolgee/model/translation/Translation;", "(Ljava/lang/String;Lio/tolgee/model/enums/TranslationCommentState;Lio/tolgee/model/translation/Translation;)V", "author", "Lio/tolgee/model/UserAccount;", "getAuthor", "()Lio/tolgee/model/UserAccount;", "setAuthor", "(Lio/tolgee/model/UserAccount;)V", "getState", "()Lio/tolgee/model/enums/TranslationCommentState;", "setState", "(Lio/tolgee/model/enums/TranslationCommentState;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getTranslation", "()Lio/tolgee/model/translation/Translation;", "setTranslation", "(Lio/tolgee/model/translation/Translation;)V", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Entity()
public class TranslationComment extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @org.hibernate.validator.constraints.Length(max = 10000)
    @javax.persistence.Column(columnDefinition = "text")
    private java.lang.String text;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.model.enums.TranslationCommentState state;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne()
    private io.tolgee.model.translation.Translation translation;
    @javax.persistence.ManyToOne(optional = false)
    public io.tolgee.model.UserAccount author;
    
    public TranslationComment(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationCommentState state, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation translation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getText() {
        return null;
    }
    
    public void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.enums.TranslationCommentState getState() {
        return null;
    }
    
    public void setState(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationCommentState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.translation.Translation getTranslation() {
        return null;
    }
    
    public void setTranslation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount getAuthor() {
        return null;
    }
    
    public void setAuthor(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount p0) {
    }
}