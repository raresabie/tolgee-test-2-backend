package io.tolgee.dtos.query_results;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lio/tolgee/dtos/query_results/ProjectStatistics;", "", "projectId", "", "keyCount", "languageCount", "translationStateCounts", "", "Lio/tolgee/model/enums/TranslationState;", "(JJJLjava/util/Map;)V", "getKeyCount", "()J", "getLanguageCount", "getProjectId", "getTranslationStateCounts", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data"})
public final class ProjectStatistics {
    private final long projectId = 0L;
    private final long keyCount = 0L;
    private final long languageCount = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<io.tolgee.model.enums.TranslationState, java.lang.Long> translationStateCounts = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.query_results.ProjectStatistics copy(long projectId, long keyCount, long languageCount, @org.jetbrains.annotations.NotNull()
    java.util.Map<io.tolgee.model.enums.TranslationState, java.lang.Long> translationStateCounts) {
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
    
    public ProjectStatistics(long projectId, long keyCount, long languageCount, @org.jetbrains.annotations.NotNull()
    java.util.Map<io.tolgee.model.enums.TranslationState, java.lang.Long> translationStateCounts) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getProjectId() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getKeyCount() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getLanguageCount() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<io.tolgee.model.enums.TranslationState, java.lang.Long> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<io.tolgee.model.enums.TranslationState, java.lang.Long> getTranslationStateCounts() {
        return null;
    }
}