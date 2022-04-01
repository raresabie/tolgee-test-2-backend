package io.tolgee.events.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lio/tolgee/events/user/OnUserUpdated;", "Lorg/springframework/context/ApplicationEvent;", "source", "", "oldUserAccount", "Lio/tolgee/dtos/cacheable/UserAccountDto;", "newUserAccount", "(Ljava/lang/Object;Lio/tolgee/dtos/cacheable/UserAccountDto;Lio/tolgee/dtos/cacheable/UserAccountDto;)V", "getNewUserAccount", "()Lio/tolgee/dtos/cacheable/UserAccountDto;", "getOldUserAccount", "data"})
public final class OnUserUpdated extends org.springframework.context.ApplicationEvent {
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.cacheable.UserAccountDto oldUserAccount = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.cacheable.UserAccountDto newUserAccount = null;
    
    public OnUserUpdated(@org.jetbrains.annotations.NotNull()
    java.lang.Object source, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.cacheable.UserAccountDto oldUserAccount, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.cacheable.UserAccountDto newUserAccount) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.cacheable.UserAccountDto getOldUserAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.cacheable.UserAccountDto getNewUserAccount() {
        return null;
    }
}