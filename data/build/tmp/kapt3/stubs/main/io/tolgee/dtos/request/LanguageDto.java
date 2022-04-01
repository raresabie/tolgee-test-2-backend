package io.tolgee.dtos.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lio/tolgee/dtos/request/LanguageDto;", "", "name", "", "originalName", "tag", "flagEmoji", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlagEmoji", "()Ljava/lang/String;", "setFlagEmoji", "(Ljava/lang/String;)V", "getName", "setName", "getOriginalName", "setOriginalName", "getTag", "setTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
public final class LanguageDto {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 100)
    @javax.validation.constraints.NotBlank()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 100)
    @javax.validation.constraints.NotBlank()
    private java.lang.String originalName;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Pattern(regexp = "^[^,]*$", message = "can not contain coma")
    @javax.validation.constraints.Size(max = 20)
    @javax.validation.constraints.NotBlank()
    private java.lang.String tag;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 20)
    private java.lang.String flagEmoji;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.LanguageDto copy(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(example = "Czech", description = "Language name in english")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "cs-CZ", description = "Language tag according to BCP 47 definition")
    java.lang.String originalName, @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(example = "\u010de\u0161tina", description = "Language name in this language")
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "\ud83c\udde8\ud83c\uddff", description = "Language flag emoji as UTF-8 emoji")
    java.lang.String flagEmoji) {
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
    
    public LanguageDto() {
        super();
    }
    
    public LanguageDto(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(example = "Czech", description = "Language name in english")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "cs-CZ", description = "Language tag according to BCP 47 definition")
    java.lang.String originalName, @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(example = "\u010de\u0161tina", description = "Language name in this language")
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(example = "\ud83c\udde8\ud83c\uddff", description = "Language flag emoji as UTF-8 emoji")
    java.lang.String flagEmoji) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalName() {
        return null;
    }
    
    public final void setOriginalName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFlagEmoji() {
        return null;
    }
    
    public final void setFlagEmoji(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}