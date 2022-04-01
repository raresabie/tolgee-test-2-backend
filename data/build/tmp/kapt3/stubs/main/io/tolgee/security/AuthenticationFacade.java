package io.tolgee.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/tolgee/security/AuthenticationFacade;", "", "configuration", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "userAccountService", "Lio/tolgee/service/UserAccountService;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/service/UserAccountService;)V", "apiKey", "Lio/tolgee/model/ApiKey;", "getApiKey", "()Lio/tolgee/model/ApiKey;", "authentication", "Lorg/springframework/security/core/Authentication;", "getAuthentication", "()Lorg/springframework/security/core/Authentication;", "isApiKeyAuthentication", "", "()Z", "userAccount", "Lio/tolgee/dtos/cacheable/UserAccountDto;", "getUserAccount", "()Lio/tolgee/dtos/cacheable/UserAccountDto;", "userAccountEntity", "Lio/tolgee/model/UserAccount;", "getUserAccountEntity", "()Lio/tolgee/model/UserAccount;", "userAccountOrNull", "getUserAccountOrNull", "data"})
@org.springframework.stereotype.Component()
public class AuthenticationFacade {
    private final io.tolgee.configuration.tolgee.TolgeeProperties configuration = null;
    private final io.tolgee.service.UserAccountService userAccountService = null;
    
    public AuthenticationFacade(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties configuration, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.UserAccountService userAccountService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.springframework.security.core.Authentication getAuthentication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.dtos.cacheable.UserAccountDto getUserAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.dtos.cacheable.UserAccountDto getUserAccountOrNull() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount getUserAccountEntity() {
        return null;
    }
    
    public boolean isApiKeyAuthentication() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.ApiKey getApiKey() {
        return null;
    }
}