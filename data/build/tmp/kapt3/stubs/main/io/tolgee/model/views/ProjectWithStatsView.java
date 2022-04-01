package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lio/tolgee/model/views/ProjectWithStatsView;", "Lio/tolgee/model/views/ProjectWithLanguagesView;", "view", "stats", "Lio/tolgee/dtos/query_results/ProjectStatistics;", "languages", "", "Lio/tolgee/model/Language;", "(Lio/tolgee/model/views/ProjectWithLanguagesView;Lio/tolgee/dtos/query_results/ProjectStatistics;Ljava/util/List;)V", "getLanguages", "()Ljava/util/List;", "getStats", "()Lio/tolgee/dtos/query_results/ProjectStatistics;", "data"})
public final class ProjectWithStatsView extends io.tolgee.model.views.ProjectWithLanguagesView {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.query_results.ProjectStatistics stats = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.tolgee.model.Language> languages = null;
    
    public ProjectWithStatsView(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.views.ProjectWithLanguagesView view, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.query_results.ProjectStatistics stats, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.Language> languages) {
        super(0L, null, null, null, null, null, null, null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.query_results.ProjectStatistics getStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.model.Language> getLanguages() {
        return null;
    }
}