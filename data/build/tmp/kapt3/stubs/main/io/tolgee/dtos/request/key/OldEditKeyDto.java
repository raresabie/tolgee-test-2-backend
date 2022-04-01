package io.tolgee.dtos.request.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/dtos/request/key/OldEditKeyDto;", "", "currentName", "", "newName", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrentName", "()Ljava/lang/String;", "setCurrentName", "(Ljava/lang/String;)V", "getNewName", "setNewName", "newPathDto", "Lio/tolgee/dtos/PathDTO;", "getNewPathDto", "()Lio/tolgee/dtos/PathDTO;", "oldPathDto", "getOldPathDto", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
public final class OldEditKeyDto {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private java.lang.String currentName;
    @org.jetbrains.annotations.NotNull()
    @org.hibernate.validator.constraints.Length(max = 200)
    @javax.validation.constraints.NotBlank()
    private java.lang.String newName;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.key.OldEditKeyDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String currentName, @org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
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
    
    public OldEditKeyDto() {
        super();
    }
    
    public OldEditKeyDto(@org.jetbrains.annotations.NotNull()
    java.lang.String currentName, @org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentName() {
        return null;
    }
    
    public final void setCurrentName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewName() {
        return null;
    }
    
    public final void setNewName(@org.jetbrains.annotations.NotNull()
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