package io.tolgee.dtos.request.project;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f\u00a8\u0006*"}, d2 = {"Lio/tolgee/dtos/request/project/CreateProjectDTO;", "", "name", "", "languages", "", "Lio/tolgee/dtos/request/LanguageDto;", "slug", "organizationId", "", "baseLanguageTag", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getBaseLanguageTag", "()Ljava/lang/String;", "setBaseLanguageTag", "(Ljava/lang/String;)V", "getLanguages", "()Ljava/util/List;", "setLanguages", "(Ljava/util/List;)V", "getName", "setName", "getOrganizationId", "()Ljava/lang/Long;", "setOrganizationId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSlug", "setSlug", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lio/tolgee/dtos/request/project/CreateProjectDTO;", "equals", "", "other", "hashCode", "", "toString", "data"})
public final class CreateProjectDTO {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 3, max = 50)
    @javax.validation.constraints.NotBlank()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.Valid()
    @javax.validation.constraints.NotEmpty()
    private java.util.List<io.tolgee.dtos.request.LanguageDto> languages;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Pattern(regexp = "^[a-z0-9-]*[a-z]+[a-z0-9-]*$", message = "invalid_pattern")
    @javax.validation.constraints.Size(min = 3, max = 60)
    private java.lang.String slug;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long organizationId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String baseLanguageTag;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.project.CreateProjectDTO copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<io.tolgee.dtos.request.LanguageDto> languages, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Slug of your project used in url e.g. \"/v2/projects/what-a-project\". If not provided, it will be generated")
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "If not provided, project will be created in user scope")
    java.lang.Long organizationId, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Tag of one of created languages, to select it as base language. If not provided, first language will be selected as base.")
    java.lang.String baseLanguageTag) {
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
    
    public CreateProjectDTO() {
        super();
    }
    
    public CreateProjectDTO(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<io.tolgee.dtos.request.LanguageDto> languages, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Slug of your project used in url e.g. \"/v2/projects/what-a-project\". If not provided, it will be generated")
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "If not provided, project will be created in user scope")
    java.lang.Long organizationId, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Tag of one of created languages, to select it as base language. If not provided, first language will be selected as base.")
    java.lang.String baseLanguageTag) {
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
    public final java.util.List<io.tolgee.dtos.request.LanguageDto> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.tolgee.dtos.request.LanguageDto> getLanguages() {
        return null;
    }
    
    public final void setLanguages(@org.jetbrains.annotations.Nullable()
    java.util.List<io.tolgee.dtos.request.LanguageDto> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOrganizationId() {
        return null;
    }
    
    public final void setOrganizationId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBaseLanguageTag() {
        return null;
    }
    
    public final void setBaseLanguageTag(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}