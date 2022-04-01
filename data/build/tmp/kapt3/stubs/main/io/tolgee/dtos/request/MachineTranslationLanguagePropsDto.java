package io.tolgee.dtos.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J6\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lio/tolgee/dtos/request/MachineTranslationLanguagePropsDto;", "", "targetLanguageId", "", "primaryService", "Lio/tolgee/constants/MtServiceType;", "enabledServices", "", "(Ljava/lang/Long;Lio/tolgee/constants/MtServiceType;Ljava/util/Set;)V", "getEnabledServices", "()Ljava/util/Set;", "setEnabledServices", "(Ljava/util/Set;)V", "getPrimaryService", "()Lio/tolgee/constants/MtServiceType;", "setPrimaryService", "(Lio/tolgee/constants/MtServiceType;)V", "getTargetLanguageId", "()Ljava/lang/Long;", "setTargetLanguageId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Lio/tolgee/constants/MtServiceType;Ljava/util/Set;)Lio/tolgee/dtos/request/MachineTranslationLanguagePropsDto;", "equals", "", "other", "hashCode", "", "toString", "", "data"})
public final class MachineTranslationLanguagePropsDto {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long targetLanguageId;
    @org.jetbrains.annotations.Nullable()
    private io.tolgee.constants.MtServiceType primaryService;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<? extends io.tolgee.constants.MtServiceType> enabledServices;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.MachineTranslationLanguagePropsDto copy(@org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "The language to apply those rules. If null, then this settings are default.")
    java.lang.Long targetLanguageId, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "This service will be used for automated translation")
    io.tolgee.constants.MtServiceType primaryService, @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "List of enabled services")
    java.util.Set<? extends io.tolgee.constants.MtServiceType> enabledServices) {
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
    
    public MachineTranslationLanguagePropsDto() {
        super();
    }
    
    public MachineTranslationLanguagePropsDto(@org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "The language to apply those rules. If null, then this settings are default.")
    java.lang.Long targetLanguageId, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "This service will be used for automated translation")
    io.tolgee.constants.MtServiceType primaryService, @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "List of enabled services")
    java.util.Set<? extends io.tolgee.constants.MtServiceType> enabledServices) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTargetLanguageId() {
        return null;
    }
    
    public final void setTargetLanguageId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.constants.MtServiceType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.constants.MtServiceType getPrimaryService() {
        return null;
    }
    
    public final void setPrimaryService(@org.jetbrains.annotations.Nullable()
    io.tolgee.constants.MtServiceType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<io.tolgee.constants.MtServiceType> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<io.tolgee.constants.MtServiceType> getEnabledServices() {
        return null;
    }
    
    public final void setEnabledServices(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.constants.MtServiceType> p0) {
    }
}