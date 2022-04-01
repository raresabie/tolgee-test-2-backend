package io.tolgee.dtos.request.translation.comment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lio/tolgee/dtos/request/translation/comment/TranslationCommentDto;", "Lio/tolgee/dtos/request/translation/comment/ITranslationCommentDto;", "text", "", "state", "Lio/tolgee/model/enums/TranslationCommentState;", "(Ljava/lang/String;Lio/tolgee/model/enums/TranslationCommentState;)V", "getState", "()Lio/tolgee/model/enums/TranslationCommentState;", "setState", "(Lio/tolgee/model/enums/TranslationCommentState;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data"})
public final class TranslationCommentDto implements io.tolgee.dtos.request.translation.comment.ITranslationCommentDto {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @org.hibernate.validator.constraints.Length(max = 10000)
    private java.lang.String text;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.model.enums.TranslationCommentState state;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.translation.comment.TranslationCommentDto copy(@org.jetbrains.annotations.NotNull()
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
    
    public TranslationCommentDto() {
        super();
    }
    
    public TranslationCommentDto(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationCommentState state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
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
    public final io.tolgee.model.enums.TranslationCommentState component2() {
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