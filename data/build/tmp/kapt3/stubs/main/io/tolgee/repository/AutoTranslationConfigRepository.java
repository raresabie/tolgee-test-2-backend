package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lio/tolgee/repository/AutoTranslationConfigRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/AutoTranslationConfig;", "", "findOneByProject", "project", "Lio/tolgee/model/Project;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface AutoTranslationConfigRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.AutoTranslationConfig, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.AutoTranslationConfig findOneByProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project);
}