package io.tolgee.dtos.request.export;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eH\u00c6\u0003J\t\u0010?\u001a\u00020\bH\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\bH\u00c6\u0003J\t\u0010B\u001a\u00020\nH\u00c6\u0003J\t\u0010C\u001a\u00020\fH\u00c6\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u009b\u0001\u0010H\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\bH\u00c6\u0001J\u0013\u0010I\u001a\u00020\b2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\fH\u00d6\u0001J\t\u0010L\u001a\u00020\u0004H\u00d6\u0001R&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR \u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\b8G\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010/\"\u0004\b1\u00102R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010/\"\u0004\b<\u00102\u00a8\u0006M"}, d2 = {"Lio/tolgee/dtos/request/export/ExportParams;", "", "languages", "", "", "format", "Lio/tolgee/dtos/request/export/ExportFormat;", "splitByScope", "", "splitByScopeDelimiter", "", "splitByScopeDepth", "", "filterKeyId", "", "", "filterKeyIdNot", "filterTag", "filterKeyPrefix", "filterState", "Lio/tolgee/model/enums/TranslationState;", "zip", "(Ljava/util/Set;Lio/tolgee/dtos/request/export/ExportFormat;ZCILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getFilterKeyId", "()Ljava/util/List;", "setFilterKeyId", "(Ljava/util/List;)V", "getFilterKeyIdNot", "setFilterKeyIdNot", "getFilterKeyPrefix", "()Ljava/lang/String;", "setFilterKeyPrefix", "(Ljava/lang/String;)V", "getFilterState", "setFilterState", "getFilterTag", "setFilterTag", "getFormat", "()Lio/tolgee/dtos/request/export/ExportFormat;", "setFormat", "(Lio/tolgee/dtos/request/export/ExportFormat;)V", "getLanguages", "()Ljava/util/Set;", "setLanguages", "(Ljava/util/Set;)V", "shouldContainUntranslated", "getShouldContainUntranslated", "()Z", "getSplitByScope", "setSplitByScope", "(Z)V", "getSplitByScopeDelimiter", "()C", "setSplitByScopeDelimiter", "(C)V", "getSplitByScopeDepth", "()I", "setSplitByScopeDepth", "(I)V", "getZip", "setZip", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data"})
public final class ExportParams {
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Languages to be contained in export.\n                \nIf null, all languages are exported", example = "en")
    private java.util.Set<java.lang.String> languages;
    @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.Parameter(description = "Format to export to")
    private io.tolgee.dtos.request.export.ExportFormat format;
    @io.swagger.v3.oas.annotations.Parameter(description = "When true translations are split to directories by scopes")
    private boolean splitByScope;
    @io.swagger.v3.oas.annotations.Parameter(description = "Scope delimiter.\n\ne.g. For key \"home.header.title\" scopes would result in \"home\" -> \"header\", when splitByScopeDepth is greater than 1.\n    ")
    private char splitByScopeDelimiter;
    @io.swagger.v3.oas.annotations.Parameter(description = "Maximum depth of scoping.\n\ne.g. For key \"home.header.title\" and depth 1, resulting scope is  \"home\".\n\nFor depth 2, resulting scopes are  \"home\" -> \"header\".\n    ")
    private int splitByScopeDepth;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Filter key IDs to be contained in export")
    private java.util.List<java.lang.Long> filterKeyId;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Filter key IDs not to be contained in export")
    private java.util.List<java.lang.Long> filterKeyIdNot;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Filter keys tagged by")
    private java.lang.String filterTag;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Filter keys with prefix")
    private java.lang.String filterKeyPrefix;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Filter translations with state. By default, everything except untranslated is exported.")
    private java.util.List<? extends io.tolgee.model.enums.TranslationState> filterState;
    @io.swagger.v3.oas.annotations.Parameter(description = "If false, it doesn\'t return zip of files, but it returns single file.\n      \nThis is possible only when single language is exported. Otherwise it returns \"400 - Bad Request\" response. \n    ")
    private boolean zip;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.export.ExportParams copy(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> languages, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportFormat format, boolean splitByScope, char splitByScopeDelimiter, int splitByScopeDepth, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> filterKeyId, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> filterKeyIdNot, @org.jetbrains.annotations.Nullable()
    java.lang.String filterTag, @org.jetbrains.annotations.Nullable()
    java.lang.String filterKeyPrefix, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends io.tolgee.model.enums.TranslationState> filterState, boolean zip) {
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
    
    public ExportParams() {
        super();
    }
    
    public ExportParams(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> languages, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportFormat format, boolean splitByScope, char splitByScopeDelimiter, int splitByScopeDepth, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> filterKeyId, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> filterKeyIdNot, @org.jetbrains.annotations.Nullable()
    java.lang.String filterTag, @org.jetbrains.annotations.Nullable()
    java.lang.String filterKeyPrefix, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends io.tolgee.model.enums.TranslationState> filterState, boolean zip) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.String> getLanguages() {
        return null;
    }
    
    public final void setLanguages(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.export.ExportFormat component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.export.ExportFormat getFormat() {
        return null;
    }
    
    public final void setFormat(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportFormat p0) {
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getSplitByScope() {
        return false;
    }
    
    public final void setSplitByScope(boolean p0) {
    }
    
    public final char component4() {
        return '\u0000';
    }
    
    public final char getSplitByScopeDelimiter() {
        return '\u0000';
    }
    
    public final void setSplitByScopeDelimiter(char p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getSplitByScopeDepth() {
        return 0;
    }
    
    public final void setSplitByScopeDepth(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Long> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Long> getFilterKeyId() {
        return null;
    }
    
    public final void setFilterKeyId(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Long> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Long> getFilterKeyIdNot() {
        return null;
    }
    
    public final void setFilterKeyIdNot(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilterTag() {
        return null;
    }
    
    public final void setFilterTag(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilterKeyPrefix() {
        return null;
    }
    
    public final void setFilterKeyPrefix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.tolgee.model.enums.TranslationState> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.tolgee.model.enums.TranslationState> getFilterState() {
        return null;
    }
    
    public final void setFilterState(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends io.tolgee.model.enums.TranslationState> p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getZip() {
        return false;
    }
    
    public final void setZip(boolean p0) {
    }
    
    @io.swagger.v3.oas.annotations.Hidden()
    public final boolean getShouldContainUntranslated() {
        return false;
    }
}