package io.tolgee.service.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/tolgee/service/security/ReCaptchaValidationService;", "", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "restTemplate", "Lorg/springframework/web/client/RestTemplate;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;Lorg/springframework/web/client/RestTemplate;)V", "validate", "", "token", "", "ip", "Companion", "data"})
@org.springframework.stereotype.Service()
public class ReCaptchaValidationService {
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final org.springframework.web.client.RestTemplate restTemplate = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.security.ReCaptchaValidationService.Companion Companion = null;
    
    public ReCaptchaValidationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    org.springframework.web.client.RestTemplate restTemplate) {
        super();
    }
    
    public boolean validate(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String ip) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/tolgee/service/security/ReCaptchaValidationService$Companion;", "", "()V", "Response", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lio/tolgee/service/security/ReCaptchaValidationService$Companion$Response;", "", "()V", "challengeTs", "Ljava/util/Date;", "getChallengeTs", "()Ljava/util/Date;", "setChallengeTs", "(Ljava/util/Date;)V", "errorCodes", "", "", "getErrorCodes", "()Ljava/util/List;", "setErrorCodes", "(Ljava/util/List;)V", "hostname", "getHostname", "()Ljava/lang/String;", "setHostname", "(Ljava/lang/String;)V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "data"})
        public static final class Response {
            private boolean success = false;
            @org.jetbrains.annotations.NotNull()
            @com.fasterxml.jackson.annotation.JsonProperty(value = "challenge_ts")
            private java.util.Date challengeTs;
            @org.jetbrains.annotations.NotNull()
            private java.lang.String hostname = "";
            @org.jetbrains.annotations.Nullable()
            @com.fasterxml.jackson.annotation.JsonProperty(value = "error-codes")
            private java.util.List<java.lang.String> errorCodes;
            
            public Response() {
                super();
            }
            
            public final boolean getSuccess() {
                return false;
            }
            
            public final void setSuccess(boolean p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Date getChallengeTs() {
                return null;
            }
            
            public final void setChallengeTs(@org.jetbrains.annotations.NotNull()
            java.util.Date p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getHostname() {
                return null;
            }
            
            public final void setHostname(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<java.lang.String> getErrorCodes() {
                return null;
            }
            
            public final void setErrorCodes(@org.jetbrains.annotations.Nullable()
            java.util.List<java.lang.String> p0) {
            }
        }
    }
}