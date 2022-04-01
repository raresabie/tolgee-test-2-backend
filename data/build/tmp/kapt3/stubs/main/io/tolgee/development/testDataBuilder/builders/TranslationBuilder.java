package io.tolgee.development.testDataBuilder.builders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J)\u0010\u0011\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0017\u00a2\u0006\u0002\b\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0006"}, d2 = {"Lio/tolgee/development/testDataBuilder/builders/TranslationBuilder;", "Lio/tolgee/development/testDataBuilder/builders/BaseEntityDataBuilder;", "Lio/tolgee/model/translation/Translation;", "projectBuilder", "Lio/tolgee/development/testDataBuilder/builders/ProjectBuilder;", "(Lio/tolgee/development/testDataBuilder/builders/ProjectBuilder;)V", "data", "Lio/tolgee/development/testDataBuilder/builders/TranslationBuilder$DATA;", "getData", "()Lio/tolgee/development/testDataBuilder/builders/TranslationBuilder$DATA;", "getProjectBuilder", "()Lio/tolgee/development/testDataBuilder/builders/ProjectBuilder;", "self", "getSelf", "()Lio/tolgee/model/translation/Translation;", "setSelf", "(Lio/tolgee/model/translation/Translation;)V", "addComment", "Lio/tolgee/development/testDataBuilder/builders/TranslationCommentBuilder;", "ft", "Lkotlin/Function1;", "Lio/tolgee/model/translation/TranslationComment;", "", "Lio/tolgee/development/testDataBuilder/FT;", "Lkotlin/ExtensionFunctionType;", "DATA"})
public final class TranslationBuilder extends io.tolgee.development.testDataBuilder.builders.BaseEntityDataBuilder<io.tolgee.model.translation.Translation, io.tolgee.development.testDataBuilder.builders.TranslationBuilder> {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.development.testDataBuilder.builders.ProjectBuilder projectBuilder = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.development.testDataBuilder.builders.TranslationBuilder.DATA data = null;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.model.translation.Translation self;
    
    public TranslationBuilder(@org.jetbrains.annotations.NotNull()
    io.tolgee.development.testDataBuilder.builders.ProjectBuilder projectBuilder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.development.testDataBuilder.builders.ProjectBuilder getProjectBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.development.testDataBuilder.builders.TranslationBuilder.DATA getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.tolgee.model.translation.Translation getSelf() {
        return null;
    }
    
    public void setSelf(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.translation.Translation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.development.testDataBuilder.builders.TranslationCommentBuilder addComment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.tolgee.model.translation.TranslationComment, kotlin.Unit> ft) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lio/tolgee/development/testDataBuilder/builders/TranslationBuilder$DATA;", "", "()V", "comments", "", "Lio/tolgee/development/testDataBuilder/builders/TranslationCommentBuilder;", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "data"})
    public static final class DATA {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<io.tolgee.development.testDataBuilder.builders.TranslationCommentBuilder> comments;
        
        public DATA() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<io.tolgee.development.testDataBuilder.builders.TranslationCommentBuilder> getComments() {
            return null;
        }
        
        public final void setComments(@org.jetbrains.annotations.NotNull()
        java.util.List<io.tolgee.development.testDataBuilder.builders.TranslationCommentBuilder> p0) {
        }
    }
}