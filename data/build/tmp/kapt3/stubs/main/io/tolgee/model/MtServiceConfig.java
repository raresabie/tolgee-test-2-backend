package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/model/MtServiceConfig;", "Lio/tolgee/model/StandardAuditModel;", "()V", "enabledServices", "", "Lio/tolgee/constants/MtServiceType;", "getEnabledServices", "()Ljava/util/Set;", "setEnabledServices", "(Ljava/util/Set;)V", "primaryService", "getPrimaryService", "()Lio/tolgee/constants/MtServiceType;", "setPrimaryService", "(Lio/tolgee/constants/MtServiceType;)V", "project", "Lio/tolgee/model/Project;", "getProject", "()Lio/tolgee/model/Project;", "setProject", "(Lio/tolgee/model/Project;)V", "targetLanguage", "Lio/tolgee/model/Language;", "getTargetLanguage", "()Lio/tolgee/model/Language;", "setTargetLanguage", "(Lio/tolgee/model/Language;)V", "data"})
@javax.persistence.Entity()
public class MtServiceConfig extends io.tolgee.model.StandardAuditModel {
    @javax.persistence.OneToOne()
    public io.tolgee.model.Project project;
    
    /**
     * When null, then its default config
     */
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne()
    private io.tolgee.model.Language targetLanguage;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private io.tolgee.constants.MtServiceType primaryService;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ElementCollection(targetClass = io.tolgee.constants.MtServiceType.class)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private java.util.Set<io.tolgee.constants.MtServiceType> enabledServices;
    
    public MtServiceConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project getProject() {
        return null;
    }
    
    public void setProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Language getTargetLanguage() {
        return null;
    }
    
    public void setTargetLanguage(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Language p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.constants.MtServiceType getPrimaryService() {
        return null;
    }
    
    public void setPrimaryService(@org.jetbrains.annotations.Nullable()
    io.tolgee.constants.MtServiceType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.constants.MtServiceType> getEnabledServices() {
        return null;
    }
    
    public void setEnabledServices(@org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.constants.MtServiceType> p0) {
    }
}