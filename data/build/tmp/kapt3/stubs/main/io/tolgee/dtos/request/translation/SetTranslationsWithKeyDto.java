package io.tolgee.dtos.request.translation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u00c6\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u00c6\u0003J=\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lio/tolgee/dtos/request/translation/SetTranslationsWithKeyDto;", "", "key", "", "translations", "", "languagesToReturn", "", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "getKey", "()Ljava/lang/String;", "getLanguagesToReturn", "()Ljava/util/Set;", "getTranslations", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
@org.springframework.validation.annotation.Validated()
public final class SetTranslationsWithKeyDto {
    
    /**
     * Key full path is stored as name in entity
     */
    @org.jetbrains.annotations.NotNull()
    @org.hibernate.validator.constraints.Length(max = 200)
    @javax.validation.constraints.NotBlank()
    private final java.lang.String key = null;
    
    /**
     * Map of language tag -> text
     */
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> translations = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Set<java.lang.String> languagesToReturn = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.translation.SetTranslationsWithKeyDto copy(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Key name to set translations for", example = "what_a_key_to_translate")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Object mapping language tag to translation", example = "{\"en\": \"What a translated value!\", \"cs\": \"Jak\u00e1 to p\u0159elo\u017een\u00e1 hodnota!\"}")
    java.util.Map<java.lang.String, java.lang.String> translations, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "List of languages to return translations for. \n\nIf not provided, only modified translation will be provided.\n    ", example = "[\"en\", \"de\", \"fr\"]")
    java.util.Set<java.lang.String> languagesToReturn) {
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
    
    public SetTranslationsWithKeyDto() {
        super();
    }
    
    public SetTranslationsWithKeyDto(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Key name to set translations for", example = "what_a_key_to_translate")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Object mapping language tag to translation", example = "{\"en\": \"What a translated value!\", \"cs\": \"Jak\u00e1 to p\u0159elo\u017een\u00e1 hodnota!\"}")
    java.util.Map<java.lang.String, java.lang.String> translations, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "List of languages to return translations for. \n\nIf not provided, only modified translation will be provided.\n    ", example = "[\"en\", \"de\", \"fr\"]")
    java.util.Set<java.lang.String> languagesToReturn) {
        super();
    }
    
    /**
     * Key full path is stored as name in entity
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Key full path is stored as name in entity
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    /**
     * Map of language tag -> text
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return null;
    }
    
    /**
     * Map of language tag -> text
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getTranslations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.String> getLanguagesToReturn() {
        return null;
    }
}