package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006%"}, d2 = {"Lio/tolgee/model/Language;", "Lio/tolgee/model/StandardAuditModel;", "()V", "flagEmoji", "", "getFlagEmoji", "()Ljava/lang/String;", "setFlagEmoji", "(Ljava/lang/String;)V", "name", "getName", "setName", "originalName", "getOriginalName", "setOriginalName", "project", "Lio/tolgee/model/Project;", "getProject", "()Lio/tolgee/model/Project;", "setProject", "(Lio/tolgee/model/Project;)V", "tag", "getTag", "setTag", "translations", "", "Lio/tolgee/model/translation/Translation;", "getTranslations", "()Ljava/util/Set;", "setTranslations", "(Ljava/util/Set;)V", "toString", "updateByDTO", "", "dto", "Lio/tolgee/dtos/request/LanguageDto;", "Companion", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"project_id", "name"}, name = "language_project_name"), @javax.persistence.UniqueConstraint(columnNames = {"project_id", "tag"}, name = "language_tag_name")}, indexes = {@javax.persistence.Index(columnList = "tag", name = "index_tag"), @javax.persistence.Index(columnList = "tag, project_id", name = "index_tag_project")})
@javax.persistence.EntityListeners(value = {io.tolgee.model.Language.Companion.LanguageListeners.class})
@javax.persistence.Entity()
public class Language extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToMany(fetch = javax.persistence.FetchType.LAZY, mappedBy = "language")
    private java.util.Set<io.tolgee.model.translation.Translation> translations;
    @javax.persistence.ManyToOne()
    public io.tolgee.model.Project project;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotEmpty()
    @javax.persistence.Column(nullable = false)
    private java.lang.String tag = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String originalName;
    @org.jetbrains.annotations.Nullable()
    @javax.validation.constraints.Size(max = 20)
    @javax.persistence.Column(length = 20)
    private java.lang.String flagEmoji;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.model.Language.Companion Companion = null;
    
    public Language() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.Set<io.tolgee.model.translation.Translation> getTranslations() {
        return null;
    }
    
    public void setTranslations(@org.jetbrains.annotations.Nullable()
    java.util.Set<io.tolgee.model.translation.Translation> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project getProject() {
        return null;
    }
    
    public void setProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTag() {
        return null;
    }
    
    public void setTag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getOriginalName() {
        return null;
    }
    
    public void setOriginalName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getFlagEmoji() {
        return null;
    }
    
    public void setFlagEmoji(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public void updateByDTO(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.LanguageDto dto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.tolgee.model.Language fromRequestDTO(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.LanguageDto dto) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lio/tolgee/model/Language$Companion;", "", "()V", "fromRequestDTO", "Lio/tolgee/model/Language;", "dto", "Lio/tolgee/dtos/request/LanguageDto;", "LanguageListeners", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final io.tolgee.model.Language fromRequestDTO(@org.jetbrains.annotations.NotNull()
        io.tolgee.dtos.request.LanguageDto dto) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lio/tolgee/model/Language$Companion$LanguageListeners;", "", "()V", "provider", "Lorg/springframework/beans/factory/ObjectFactory;", "Lio/tolgee/service/dataImport/ImportService;", "getProvider", "()Lorg/springframework/beans/factory/ObjectFactory;", "setProvider", "(Lorg/springframework/beans/factory/ObjectFactory;)V", "preRemove", "", "language", "Lio/tolgee/model/Language;", "data"})
        @org.springframework.beans.factory.annotation.Configurable()
        public static class LanguageListeners {
            @org.springframework.beans.factory.annotation.Autowired()
            public org.springframework.beans.factory.ObjectFactory<io.tolgee.service.dataImport.ImportService> provider;
            
            public LanguageListeners() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public org.springframework.beans.factory.ObjectFactory<io.tolgee.service.dataImport.ImportService> getProvider() {
                return null;
            }
            
            public void setProvider(@org.jetbrains.annotations.NotNull()
            org.springframework.beans.factory.ObjectFactory<io.tolgee.service.dataImport.ImportService> p0) {
            }
            
            @org.springframework.transaction.annotation.Transactional()
            @javax.persistence.PreRemove()
            public void preRemove(@org.jetbrains.annotations.NotNull()
            io.tolgee.model.Language language) {
            }
        }
    }
}