package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/model/AutoTranslationConfig;", "Lio/tolgee/model/StandardAuditModel;", "()V", "project", "Lio/tolgee/model/Project;", "getProject", "()Lio/tolgee/model/Project;", "setProject", "(Lio/tolgee/model/Project;)V", "usingPrimaryMtService", "", "getUsingPrimaryMtService", "()Z", "setUsingPrimaryMtService", "(Z)V", "usingTm", "getUsingTm", "setUsingTm", "data"})
@javax.persistence.Entity()
public class AutoTranslationConfig extends io.tolgee.model.StandardAuditModel {
    @javax.persistence.OneToOne()
    public io.tolgee.model.Project project;
    private boolean usingTm = false;
    private boolean usingPrimaryMtService = false;
    
    public AutoTranslationConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project getProject() {
        return null;
    }
    
    public void setProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project p0) {
    }
    
    public boolean getUsingTm() {
        return false;
    }
    
    public void setUsingTm(boolean p0) {
    }
    
    public boolean getUsingPrimaryMtService() {
        return false;
    }
    
    public void setUsingPrimaryMtService(boolean p0) {
    }
}