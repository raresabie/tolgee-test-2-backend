package io.tolgee.dtos.request.translation.comment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00068\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lio/tolgee/dtos/request/translation/comment/TranslationCommentWithLangKeyDto;", "Lio/tolgee/dtos/request/translation/comment/ITranslationCommentDto;", "keyId", "", "languageId", "text", "", "state", "Lio/tolgee/model/enums/TranslationCommentState;", "(JJLjava/lang/String;Lio/tolgee/model/enums/TranslationCommentState;)V", "getKeyId", "()J", "getLanguageId", "getState", "()Lio/tolgee/model/enums/TranslationCommentState;", "setState", "(Lio/tolgee/model/enums/TranslationCommentState;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data"})
public final class TranslationCommentWithLangKeyDto implements io.tolgee.dtos.request.translation.comment.ITranslationCommentDto {
    @javax.validation.constraints.NotNull()
    private final long keyId = 0L;
    @javax.validation.constraints.NotNull()
    private final long languageId = 0L;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @org.hibernate.validator.constraints.Length(max = 10000)
    private java.lang.String text;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.model.enums.TranslationCommentState state;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.translation.comment.TranslationCommentWithLangKeyDto copy(long keyId, long languageId, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationCommentState state) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TranslationCommentWithLangKeyDto() {
        super();
    }
    
    public TranslationCommentWithLangKeyDto(long keyId, long languageId, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationCommentState state) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getKeyId() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getLanguageId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getText() {
        return null;
    }
    
    @java.lang.Override()
    public void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.enums.TranslationCommentState component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.tolgee.model.enums.TranslationCommentState getState() {
        return null;
    }
    
    @java.lang.Override()
    public void setState(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationCommentState p0) {
    }
}