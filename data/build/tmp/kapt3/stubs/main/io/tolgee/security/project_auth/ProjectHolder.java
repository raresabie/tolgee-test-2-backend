package io.tolgee.security.project_auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/tolgee/security/project_auth/ProjectHolder;", "", "projectService", "Lio/tolgee/service/ProjectService;", "(Lio/tolgee/service/ProjectService;)V", "isProjectInitialized", "", "()Z", "project", "Lio/tolgee/dtos/cacheable/ProjectDto;", "getProject", "()Lio/tolgee/dtos/cacheable/ProjectDto;", "setProject", "(Lio/tolgee/dtos/cacheable/ProjectDto;)V", "projectEntity", "Lio/tolgee/model/Project;", "getProjectEntity", "()Lio/tolgee/model/Project;", "projectEntity$delegate", "Lkotlin/Lazy;", "data"})
@org.springframework.web.context.annotation.RequestScope()
@org.springframework.stereotype.Component()
public class ProjectHolder {
    private final io.tolgee.service.ProjectService projectService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy projectEntity$delegate = null;
    public io.tolgee.dtos.cacheable.ProjectDto project;
    
    public ProjectHolder(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService projectService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project getProjectEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.dtos.cacheable.ProjectDto getProject() {
        return null;
    }
    
    public void setProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.cacheable.ProjectDto p0) {
    }
    
    public boolean isProjectInitialized() {
        return false;
    }
}