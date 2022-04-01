package io.tolgee.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lio/tolgee/exceptions/ErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "Lio/tolgee/constants/Message;", "params", "", "Ljava/io/Serializable;", "(Lio/tolgee/constants/Message;Ljava/util/List;)V", "(Lio/tolgee/constants/Message;)V", "code", "", "(Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "errorResponseBody", "Lio/tolgee/exceptions/ErrorResponseBody;", "getErrorResponseBody", "()Lio/tolgee/exceptions/ErrorResponseBody;", "httpStatus", "Lorg/springframework/http/HttpStatus;", "getHttpStatus", "()Lorg/springframework/http/HttpStatus;", "getParams", "()Ljava/util/List;", "data"})
public abstract class ErrorException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.io.Serializable> params = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String code = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.io.Serializable> getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public ErrorException(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.Message message, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.io.Serializable> params) {
        super();
    }
    
    public ErrorException(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.Message message) {
        super();
    }
    
    public ErrorException(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.io.Serializable> params) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.exceptions.ErrorResponseBody getErrorResponseBody() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.springframework.http.HttpStatus getHttpStatus();
}