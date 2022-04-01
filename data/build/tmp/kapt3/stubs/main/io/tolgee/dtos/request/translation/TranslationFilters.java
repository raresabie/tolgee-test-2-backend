package io.tolgee.dtos.request.translation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\"\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005R \u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R&\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0005R\u001e\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR \u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR \u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0016\"\u0004\b(\u0010\u0018R&\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018\u00a8\u00062"}, d2 = {"Lio/tolgee/dtos/request/translation/TranslationFilters;", "", "filterState", "", "", "(Ljava/util/List;)V", "filterHasNoScreenshot", "", "getFilterHasNoScreenshot", "()Z", "setFilterHasNoScreenshot", "(Z)V", "filterHasScreenshot", "getFilterHasScreenshot", "setFilterHasScreenshot", "filterKeyId", "", "getFilterKeyId", "()Ljava/util/List;", "setFilterKeyId", "filterKeyName", "getFilterKeyName", "()Ljava/lang/String;", "setFilterKeyName", "(Ljava/lang/String;)V", "getFilterState", "filterTag", "getFilterTag", "setFilterTag", "filterTranslatedAny", "getFilterTranslatedAny", "setFilterTranslatedAny", "filterTranslatedInLang", "getFilterTranslatedInLang", "setFilterTranslatedInLang", "filterUntranslatedAny", "getFilterUntranslatedAny", "setFilterUntranslatedAny", "filterUntranslatedInLang", "getFilterUntranslatedInLang", "setFilterUntranslatedInLang", "languages", "", "getLanguages", "()Ljava/util/Set;", "setLanguages", "(Ljava/util/Set;)V", "search", "getSearch", "setSearch", "data"})
public class TranslationFilters {
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Translation state in the format: languageTag,state. You can use this parameter multiple times.\n\nWhen used with multiple states for same language it is applied with logical OR. \n \nWhen used with multiple languages, it is applied with logical AND.\n    ", examples = {@io.swagger.v3.oas.annotations.media.ExampleObject(value = "en,TRANSLATED"), @io.swagger.v3.oas.annotations.media.ExampleObject(value = "en-US,UNTRANSLATED"), @io.swagger.v3.oas.annotations.media.ExampleObject(value = "fr,REVIEWED")})
    private final java.util.List<java.lang.String> filterState = null;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Languages to be contained in response.\n                \nTo add multiple languages, repeat this param (eg. ?languages=en&languages=de)", example = "en")
    private java.util.Set<java.lang.String> languages;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "String to search in key name or translation text")
    private java.lang.String search;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only one key with provided name")
    private java.lang.String filterKeyName;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only one key with provided id")
    private java.util.List<java.lang.Long> filterKeyId;
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only keys, where translation is missing in any language")
    private boolean filterUntranslatedAny = false;
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only keys, where translation is provided in any language")
    private boolean filterTranslatedAny = false;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only keys, where translation is missing in specified language", example = "en-US")
    private java.lang.String filterUntranslatedInLang;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only keys, where translation is provided in specified language", example = "en-US")
    private java.lang.String filterTranslatedInLang;
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only keys with screenshots")
    private boolean filterHasScreenshot = false;
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only keys without screenshots")
    private boolean filterHasNoScreenshot = false;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Selects only keys with provided tag")
    private java.util.List<java.lang.String> filterTag;
    
    public TranslationFilters() {
        super();
    }
    
    public TranslationFilters(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> filterState) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<java.lang.String> getFilterState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.String> getLanguages() {
        return null;
    }
    
    public final void setLanguages(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilterKeyName() {
        return null;
    }
    
    public final void setFilterKeyName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Long> getFilterKeyId() {
        return null;
    }
    
    public final void setFilterKeyId(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> p0) {
    }
    
    public final boolean getFilterUntranslatedAny() {
        return false;
    }
    
    public final void setFilterUntranslatedAny(boolean p0) {
    }
    
    public final boolean getFilterTranslatedAny() {
        return false;
    }
    
    public final void setFilterTranslatedAny(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilterUntranslatedInLang() {
        return null;
    }
    
    public final void setFilterUntranslatedInLang(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilterTranslatedInLang() {
        return null;
    }
    
    public final void setFilterTranslatedInLang(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getFilterHasScreenshot() {
        return false;
    }
    
    public final void setFilterHasScreenshot(boolean p0) {
    }
    
    public final boolean getFilterHasNoScreenshot() {
        return false;
    }
    
    public final void setFilterHasNoScreenshot(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getFilterTag() {
        return null;
    }
    
    public final void setFilterTag(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
}