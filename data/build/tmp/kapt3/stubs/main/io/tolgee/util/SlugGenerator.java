package io.tolgee.util;

import java.lang.System;

@kotlin.Suppress(names = {"SpringJavaInjectionPointsAutowiringInspection"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002JC\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u000b\u0012\b\b\u0005\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\f0\nH\u0016J\f\u0010\r\u001a\u00020\u0004*\u00020\u0007H\u0012\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/util/SlugGenerator;", "", "()V", "generate", "", "name", "minLength", "", "maxLength", "checkUniquenessCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "emptyOnZero", "Companion", "data"})
@org.springframework.stereotype.Component()
public class SlugGenerator {
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.util.SlugGenerator.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELIMITER = "-";
    
    public SlugGenerator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String generate(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int minLength, int maxLength, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> checkUniquenessCallback) {
        return null;
    }
    
    private java.lang.String emptyOnZero(int $this$emptyOnZero) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/tolgee/util/SlugGenerator$Companion;", "", "()V", "DELIMITER", "", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}