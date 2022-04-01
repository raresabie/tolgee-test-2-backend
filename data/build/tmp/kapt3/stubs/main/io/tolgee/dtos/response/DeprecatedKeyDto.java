package io.tolgee.dtos.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0011\u0010\b\u001a\u00020\t8G\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lio/tolgee/dtos/response/DeprecatedKeyDto;", "", "fullPathString", "", "(Ljava/lang/String;)V", "getFullPathString", "()Ljava/lang/String;", "setFullPathString", "pathDto", "Lio/tolgee/dtos/PathDTO;", "getPathDto", "()Lio/tolgee/dtos/PathDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
@java.lang.Deprecated()
public final class DeprecatedKeyDto {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 1, max = 300)
    @javax.validation.constraints.NotBlank()
    private java.lang.String fullPathString;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.response.DeprecatedKeyDto copy(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "This means name of key. Will be renamed in v2")
    java.lang.String fullPathString) {
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
    
    public DeprecatedKeyDto() {
        super();
    }
    
    public DeprecatedKeyDto(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "This means name of key. Will be renamed in v2")
    java.lang.String fullPathString) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullPathString() {
        return null;
    }
    
    public final void setFullPathString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    public final io.tolgee.dtos.PathDTO getPathDto() {
        return null;
    }
}