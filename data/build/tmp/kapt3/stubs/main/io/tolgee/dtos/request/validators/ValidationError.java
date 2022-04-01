package io.tolgee.dtos.request.validators;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/dtos/request/validators/ValidationError;", "", "type", "Lio/tolgee/dtos/request/validators/ValidationErrorType;", "message", "Lio/tolgee/constants/Message;", "parameters", "", "", "(Lio/tolgee/dtos/request/validators/ValidationErrorType;Lio/tolgee/constants/Message;[Ljava/lang/String;)V", "getMessage", "()Lio/tolgee/constants/Message;", "getParameters", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getType", "()Lio/tolgee/dtos/request/validators/ValidationErrorType;", "data"})
public final class ValidationError {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] parameters = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.dtos.request.validators.ValidationErrorType type = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.constants.Message message = null;
    
    public ValidationError(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.validators.ValidationErrorType type, @org.jetbrains.annotations.NotNull()
    io.tolgee.constants.Message message, @org.jetbrains.annotations.NotNull()
    java.lang.String... parameters) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.validators.ValidationErrorType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.constants.Message getMessage() {
        return null;
    }
}