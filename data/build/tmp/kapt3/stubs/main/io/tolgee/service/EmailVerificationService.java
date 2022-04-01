package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J*\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017J\b\u0010\u001a\u001a\u00020\u0018H\u0012J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0012J\u001a\u0010\u001c\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u0014H\u0012J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0018H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\""}, d2 = {"Lio/tolgee/service/EmailVerificationService;", "", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "emailVerificationRepository", "Lio/tolgee/repository/EmailVerificationRepository;", "tolgeeEmailSender", "Lio/tolgee/component/TolgeeEmailSender;", "applicationEventPublisher", "Lorg/springframework/context/ApplicationEventPublisher;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/repository/EmailVerificationRepository;Lio/tolgee/component/TolgeeEmailSender;Lorg/springframework/context/ApplicationEventPublisher;)V", "userAccountService", "Lio/tolgee/service/UserAccountService;", "getUserAccountService", "()Lio/tolgee/service/UserAccountService;", "setUserAccountService", "(Lio/tolgee/service/UserAccountService;)V", "check", "", "userAccount", "Lio/tolgee/model/UserAccount;", "createForUser", "Lio/tolgee/model/EmailVerification;", "callbackUrl", "", "newEmail", "generateCode", "getCallbackUrl", "setNewEmailIfChanged", "user", "verify", "userId", "", "code", "data"})
@org.springframework.stereotype.Service()
public class EmailVerificationService {
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final io.tolgee.repository.EmailVerificationRepository emailVerificationRepository = null;
    private final io.tolgee.component.TolgeeEmailSender tolgeeEmailSender = null;
    private final org.springframework.context.ApplicationEventPublisher applicationEventPublisher = null;
    @org.springframework.beans.factory.annotation.Autowired()
    @org.springframework.context.annotation.Lazy()
    public io.tolgee.service.UserAccountService userAccountService;
    
    public EmailVerificationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.repository.EmailVerificationRepository emailVerificationRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.TolgeeEmailSender tolgeeEmailSender, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.UserAccountService getUserAccountService() {
        return null;
    }
    
    public void setUserAccountService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.UserAccountService p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.EmailVerification createForUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.Nullable()
    java.lang.String callbackUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String newEmail) {
        return null;
    }
    
    public void check(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
    }
    
    public void verify(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    private void setNewEmailIfChanged(java.lang.String newEmail, io.tolgee.model.UserAccount user) {
    }
    
    private java.lang.String generateCode() {
        return null;
    }
    
    private java.lang.String getCallbackUrl(java.lang.String callbackUrl) {
        return null;
    }
}