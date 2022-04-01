package io.tolgee.development.testDataBuilder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J&\u0010\u0007\u001a\u00028\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\b\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ&\u0010\u0004\u001a\u00028\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\b\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lio/tolgee/development/testDataBuilder/EntityDataBuilder;", "T", "BuilderType", "", "self", "getSelf", "()Ljava/lang/Object;", "build", "ft", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "data"})
public abstract interface EntityDataBuilder<T extends java.lang.Object, BuilderType extends java.lang.Object> {
    
    public abstract T getSelf();
    
    public abstract T self(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> ft);
    
    public abstract BuilderType build(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super BuilderType, kotlin.Unit> ft);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static <T extends java.lang.Object, BuilderType extends java.lang.Object>T self(@org.jetbrains.annotations.NotNull()
        io.tolgee.development.testDataBuilder.EntityDataBuilder<T, ? extends BuilderType> $this, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> ft) {
            return null;
        }
        
        public static <T extends java.lang.Object, BuilderType extends java.lang.Object>BuilderType build(@org.jetbrains.annotations.NotNull()
        io.tolgee.development.testDataBuilder.EntityDataBuilder<T, ? extends BuilderType> $this, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super BuilderType, kotlin.Unit> ft) {
            return null;
        }
    }
}