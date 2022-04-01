package io.tolgee.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H&\u00a8\u0006\u0013"}, d2 = {"Lio/tolgee/security/JwtTokenProvider;", "", "generateToken", "Lio/tolgee/security/JwtToken;", "userId", "", "getAuthentication", "Lorg/springframework/security/core/Authentication;", "token", "getUser", "Lio/tolgee/dtos/cacheable/UserAccountDto;", "resolveToken", "req", "Ljavax/servlet/http/HttpServletRequest;", "stringToken", "", "validateToken", "", "authToken", "data"})
public abstract interface JwtTokenProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.security.JwtToken generateToken(long userId);
    
    public abstract boolean validateToken(@org.jetbrains.annotations.NotNull()
    io.tolgee.security.JwtToken authToken);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.security.core.Authentication getAuthentication(@org.jetbrains.annotations.NotNull()
    io.tolgee.security.JwtToken token);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.dtos.cacheable.UserAccountDto getUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.security.JwtToken token);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.security.JwtToken resolveToken(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest req);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.security.JwtToken resolveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String stringToken);
}