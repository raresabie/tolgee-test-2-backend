package io.tolgee.dtos.request.validators.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lio/tolgee/dtos/request/validators/exceptions/ValidationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "Lio/tolgee/constants/Message;", "parameters", "", "", "(Lio/tolgee/constants/Message;[Ljava/lang/String;)V", "validationErrors", "", "Lio/tolgee/dtos/request/validators/ValidationError;", "(Ljava/util/Collection;)V", "", "getValidationErrors", "()Ljava/util/Set;", "data"})
public final class ValidationException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<io.tolgee.dtos.request.validators.ValidationError> validationErrors = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<io.tolgee.dtos.request.validators.ValidationError> getValidationErrors() {
        return null;
    }
    
    public ValidationException(@org.jetbrains.annotations.NotNull()
    io.tolgee.constants.Message message, @org.jetbrains.annotations.NotNull()
    java.lang.String... parameters) {
        super();
    }
    
    public ValidationException(@org.jetbrains.annotations.Nullable()
    java.util.Collection<io.tolgee.dtos.request.validators.ValidationError> validationErrors) {
        super();
    }
}