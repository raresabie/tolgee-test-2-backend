package io.tolgee.repository.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\'J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/repository/machineTranslation/MtServiceConfigRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/MtServiceConfig;", "", "deleteAllByProjectId", "", "projectId", "deleteAllByTargetLanguageId", "targetLanguageId", "findAllByProjectId", "", "findAllByTargetLanguageId", "languageId", "findAllByTargetLanguageIdIn", "languageIds", "project", "Lio/tolgee/model/Project;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface MtServiceConfigRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.MtServiceConfig, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n    select ptsc from MtServiceConfig ptsc\n    join Language l on l.id = :languageId \n        and (\n            ptsc.targetLanguage.id = :languageId \n            or (ptsc.targetLanguage.id is null and ptsc.project.id = l.project.id)\n            )\n  ")
    public abstract java.util.List<io.tolgee.model.MtServiceConfig> findAllByTargetLanguageId(long languageId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.MtServiceConfig> findAllByProjectId(long projectId);
    
    public abstract void deleteAllByTargetLanguageId(long targetLanguageId);
    
    public abstract void deleteAllByProjectId(long projectId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n    select ptsc from MtServiceConfig ptsc\n    where ptsc.targetLanguage.id in :languageIds \n        or (ptsc.targetLanguage.id is null and ptsc.project = :project)\n  ")
    public abstract java.util.List<io.tolgee.model.MtServiceConfig> findAllByTargetLanguageIdIn(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> languageIds, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project);
}