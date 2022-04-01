package io.tolgee.model;

import java.lang.System;

@kotlin.Suppress(names = {"JoinDeclarationAndAssignment"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001B-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u00020\n8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u00020\b8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lio/tolgee/model/ApiKey;", "Lio/tolgee/model/StandardAuditModel;", "key", "", "scopesEnum", "", "Lio/tolgee/model/enums/ApiScope;", "userAccount", "Lio/tolgee/model/UserAccount;", "project", "Lio/tolgee/model/Project;", "(Ljava/lang/String;Ljava/util/Set;Lio/tolgee/model/UserAccount;Lio/tolgee/model/Project;)V", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getProject", "()Lio/tolgee/model/Project;", "setProject", "(Lio/tolgee/model/Project;)V", "getScopesEnum", "()Ljava/util/Set;", "setScopesEnum", "(Ljava/util/Set;)V", "getUserAccount", "()Lio/tolgee/model/UserAccount;", "setUserAccount", "(Lio/tolgee/model/UserAccount;)V", "data"})
@org.hibernate.envers.Audited()
@javax.persistence.Table(uniqueConstraints = {@javax.persistence.UniqueConstraint(columnNames = {"key"}, name = "api_key_unique")})
@javax.persistence.Entity()
public class ApiKey extends io.tolgee.model.StandardAuditModel {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    @javax.validation.constraints.NotEmpty()
    private java.lang.String key;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ElementCollection(targetClass = io.tolgee.model.enums.ApiScope.class, fetch = javax.persistence.FetchType.EAGER)
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.ORDINAL)
    private java.util.Set<io.tolgee.model.enums.ApiScope> scopesEnum;
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne()
    public io.tolgee.model.UserAccount userAccount;
    @javax.validation.constraints.NotNull()
    @javax.persistence.ManyToOne()
    public io.tolgee.model.Project project;
    
    public ApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotEmpty()
    @javax.validation.constraints.NotNull()
    java.util.Set<io.tolgee.model.enums.ApiScope> scopesEnum) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getKey() {
        return null;
    }
    
    public void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.enums.ApiScope> getScopesEnum() {
        return null;
    }
    
    public void setScopesEnum(@org.jetbrains.annotations.NotNull()
    java.util.Set<io.tolgee.model.enums.ApiScope> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount getUserAccount() {
        return null;
    }
    
    public void setUserAccount(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Project getProject() {
        return null;
    }
    
    public void setProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project p0) {
    }
    
    public ApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopesEnum, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        super();
    }
}