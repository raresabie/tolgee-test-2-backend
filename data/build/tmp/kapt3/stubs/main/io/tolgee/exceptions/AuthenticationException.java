package io.tolgee.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/tolgee/exceptions/AuthenticationException;", "Lio/tolgee/exceptions/ErrorException;", "message", "Lio/tolgee/constants/Message;", "(Lio/tolgee/constants/Message;)V", "httpStatus", "Lorg/springframework/http/HttpStatus;", "getHttpStatus", "()Lorg/springframework/http/HttpStatus;", "data"})
public final class AuthenticationException extends io.tolgee.exceptions.ErrorException {
    
    public AuthenticationException(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.Message message) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.http.HttpStatus getHttpStatus() {
        return null;
    }
}