package io.tolgee.security.rateLimis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006RD\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015RB\u0010\u0016\u001a2\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00130\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"Lio/tolgee/security/rateLimis/RateLimit;", "", "bucketSizeProvider", "Lkotlin/Function0;", "", "getBucketSizeProvider", "()Lkotlin/jvm/functions/Function0;", "condition", "Lkotlin/Function2;", "Ljavax/servlet/http/HttpServletRequest;", "Lkotlin/ParameterName;", "name", "request", "Lorg/springframework/context/ApplicationContext;", "applicationContext", "", "getCondition", "()Lkotlin/jvm/functions/Function2;", "keyPrefix", "", "getKeyPrefix", "()Ljava/lang/String;", "keyProvider", "getKeyProvider", "lifeCyclePoint", "Lio/tolgee/security/rateLimis/RateLimitLifeCyclePoint;", "getLifeCyclePoint", "()Lio/tolgee/security/rateLimis/RateLimitLifeCyclePoint;", "timeToRefillInMs", "getTimeToRefillInMs", "()I", "urlMatcher", "Lkotlin/text/Regex;", "getUrlMatcher", "()Lkotlin/text/Regex;", "data"})
public abstract interface RateLimit {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.text.Regex getUrlMatcher();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getKeyPrefix();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function2<javax.servlet.http.HttpServletRequest, org.springframework.context.ApplicationContext, java.lang.Boolean> getCondition();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function2<javax.servlet.http.HttpServletRequest, org.springframework.context.ApplicationContext, java.lang.String> getKeyProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function0<java.lang.Integer> getBucketSizeProvider();
    
    public abstract int getTimeToRefillInMs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.security.rateLimis.RateLimitLifeCyclePoint getLifeCyclePoint();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.jvm.functions.Function2<javax.servlet.http.HttpServletRequest, org.springframework.context.ApplicationContext, java.lang.Boolean> getCondition(@org.jetbrains.annotations.NotNull()
        io.tolgee.security.rateLimis.RateLimit $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static io.tolgee.security.rateLimis.RateLimitLifeCyclePoint getLifeCyclePoint(@org.jetbrains.annotations.NotNull()
        io.tolgee.security.rateLimis.RateLimit $this) {
            return null;
        }
    }
}