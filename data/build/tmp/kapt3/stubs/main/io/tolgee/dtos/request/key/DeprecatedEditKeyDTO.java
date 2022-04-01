package io.tolgee.dtos.request.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/dtos/request/key/DeprecatedEditKeyDTO;", "", "oldFullPathString", "", "newFullPathString", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewFullPathString", "()Ljava/lang/String;", "setNewFullPathString", "(Ljava/lang/String;)V", "newPathDto", "Lio/tolgee/dtos/PathDTO;", "getNewPathDto", "()Lio/tolgee/dtos/PathDTO;", "getOldFullPathString", "setOldFullPathString", "oldPathDto", "getOldPathDto", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
@java.lang.Deprecated()
public final class DeprecatedEditKeyDTO {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private java.lang.String oldFullPathString;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private java.lang.String newFullPathString;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.key.DeprecatedEditKeyDTO copy(@org.jetbrains.annotations.NotNull()
    java.lang.String oldFullPathString, @org.jetbrains.annotations.NotNull()
    java.lang.String newFullPathString) {
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
    
    public DeprecatedEditKeyDTO() {
        super();
    }
    
    public DeprecatedEditKeyDTO(@org.jetbrains.annotations.NotNull()
    java.lang.String oldFullPathString, @org.jetbrains.annotations.NotNull()
    java.lang.String newFullPathString) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOldFullPathString() {
        return null;
    }
    
    public final void setOldFullPathString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewFullPathString() {
        return null;
    }
    
    public final void setNewFullPathString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    @io.swagger.v3.oas.annotations.Hidden()
    public final io.tolgee.dtos.PathDTO getOldPathDto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    @io.swagger.v3.oas.annotations.Hidden()
    public final io.tolgee.dtos.PathDTO getNewPathDto() {
        return null;
    }
}