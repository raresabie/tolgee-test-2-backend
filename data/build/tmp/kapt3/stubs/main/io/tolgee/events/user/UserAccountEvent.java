package io.tolgee.events.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/tolgee/events/user/UserAccountEvent;", "Lorg/springframework/context/ApplicationEvent;", "source", "", "userAccount", "Lio/tolgee/model/UserAccount;", "(Ljava/lang/Object;Lio/tolgee/model/UserAccount;)V", "getUserAccount", "()Lio/tolgee/model/UserAccount;", "data"})
public abstract class UserAccountEvent extends org.springframework.context.ApplicationEvent {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.model.UserAccount userAccount = null;
    
    public UserAccountEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object source, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.UserAccount getUserAccount() {
        return null;
    }
}