package io.tolgee.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lio/tolgee/model/RevisionListener;", "Lorg/hibernate/envers/RevisionListener;", "()V", "factory", "Lorg/springframework/beans/factory/ObjectFactory;", "Lio/tolgee/security/AuthenticationFacade;", "getFactory", "()Lorg/springframework/beans/factory/ObjectFactory;", "setFactory", "(Lorg/springframework/beans/factory/ObjectFactory;)V", "newRevision", "", "revisionEntity", "", "data"})
@org.springframework.beans.factory.annotation.Configurable()
public class RevisionListener implements org.hibernate.envers.RevisionListener {
    @org.springframework.beans.factory.annotation.Autowired()
    public org.springframework.beans.factory.ObjectFactory<io.tolgee.security.AuthenticationFacade> factory;
    
    public RevisionListener() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.beans.factory.ObjectFactory<io.tolgee.security.AuthenticationFacade> getFactory() {
        return null;
    }
    
    public void setFactory(@org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.ObjectFactory<io.tolgee.security.AuthenticationFacade> p0) {
    }
    
    @java.lang.Override()
    public void newRevision(@org.jetbrains.annotations.NotNull()
    java.lang.Object revisionEntity) {
    }
}