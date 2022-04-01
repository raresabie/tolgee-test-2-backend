package io.tolgee.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/tolgee/exceptions/UnexpectedGoogleApiResponseException;", "", "response", "Lorg/springframework/http/ResponseEntity;", "Lio/tolgee/service/security/ReCaptchaValidationService$Companion$Response;", "(Lorg/springframework/http/ResponseEntity;)V", "getResponse", "()Lorg/springframework/http/ResponseEntity;", "data"})
public final class UnexpectedGoogleApiResponseException extends java.lang.Throwable {
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.http.ResponseEntity<io.tolgee.service.security.ReCaptchaValidationService.Companion.Response> response = null;
    
    public UnexpectedGoogleApiResponseException(@org.jetbrains.annotations.NotNull()
    org.springframework.http.ResponseEntity<io.tolgee.service.security.ReCaptchaValidationService.Companion.Response> response) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.http.ResponseEntity<io.tolgee.service.security.ReCaptchaValidationService.Companion.Response> getResponse() {
        return null;
    }
}