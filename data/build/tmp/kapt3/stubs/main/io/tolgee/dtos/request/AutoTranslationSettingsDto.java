package io.tolgee.dtos.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/dtos/request/AutoTranslationSettingsDto;", "", "usingTranslationMemory", "", "usingMachineTranslation", "(ZZ)V", "getUsingMachineTranslation", "()Z", "setUsingMachineTranslation", "(Z)V", "getUsingTranslationMemory", "setUsingTranslationMemory", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "data"})
public final class AutoTranslationSettingsDto {
    private boolean usingTranslationMemory;
    private boolean usingMachineTranslation;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.AutoTranslationSettingsDto copy(@io.swagger.v3.oas.annotations.media.Schema(description = "If true, new keys will be automatically translated using translation memory when 100% match is found")
    boolean usingTranslationMemory, @io.swagger.v3.oas.annotations.media.Schema(description = "If true, new keys will be automatically translated using primary machine translation service.When \"usingTranslationMemory\" is enabled, it tries to translate it with translation memory first.")
    boolean usingMachineTranslation) {
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
    
    public AutoTranslationSettingsDto() {
        super();
    }
    
    public AutoTranslationSettingsDto(@io.swagger.v3.oas.annotations.media.Schema(description = "If true, new keys will be automatically translated using translation memory when 100% match is found")
    boolean usingTranslationMemory, @io.swagger.v3.oas.annotations.media.Schema(description = "If true, new keys will be automatically translated using primary machine translation service.When \"usingTranslationMemory\" is enabled, it tries to translate it with translation memory first.")
    boolean usingMachineTranslation) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getUsingTranslationMemory() {
        return false;
    }
    
    public final void setUsingTranslationMemory(boolean p0) {
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getUsingMachineTranslation() {
        return false;
    }
    
    public final void setUsingMachineTranslation(boolean p0) {
    }
}