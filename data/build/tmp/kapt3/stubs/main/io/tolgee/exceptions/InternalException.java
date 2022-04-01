package io.tolgee.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lio/tolgee/exceptions/InternalException;", "Lio/tolgee/exceptions/ErrorException;", "message", "Lio/tolgee/constants/Message;", "params", "", "Ljava/io/Serializable;", "(Lio/tolgee/constants/Message;Ljava/util/List;)V", "(Lio/tolgee/constants/Message;)V", "httpStatus", "Lorg/springframework/http/HttpStatus;", "getHttpStatus", "()Lorg/springframework/http/HttpStatus;", "data"})
public final class InternalException extends io.tolgee.exceptions.ErrorException {
    
    public InternalException(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.Message message, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.io.Serializable> params) {
        super(null, null);
    }
    
    public InternalException(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.Message message) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.springframework.http.HttpStatus getHttpStatus() {
        return null;
    }
}