package io.tolgee.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0012J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0012J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J4\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lio/tolgee/component/TolgeeEmailSender;", "", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "mailSender", "Lorg/springframework/mail/javamail/JavaMailSender;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;Lorg/springframework/mail/javamail/JavaMailSender;)V", "getInvitationAcceptUrl", "", "code", "getInvitationSentence", "invitation", "Lio/tolgee/model/Invitation;", "sendEmail", "", "params", "Lio/tolgee/dtos/misc/TolgeeEmailParams;", "sendEmailVerification", "userId", "", "email", "resultCallbackUrl", "isSignUp", "", "sendInvitation", "validateProps", "data"})
@org.springframework.stereotype.Component()
public class TolgeeEmailSender {
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final org.springframework.mail.javamail.JavaMailSender mailSender = null;
    
    public TolgeeEmailSender(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    org.springframework.mail.javamail.JavaMailSender mailSender) {
        super();
    }
    
    public void sendEmailVerification(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String resultCallbackUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String code, boolean isSignUp) {
    }
    
    public void sendInvitation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Invitation invitation) {
    }
    
    private java.lang.Object getInvitationSentence(io.tolgee.model.Invitation invitation) {
        return null;
    }
    
    private java.lang.String getInvitationAcceptUrl(java.lang.String code) {
        return null;
    }
    
    private void sendEmail(io.tolgee.dtos.misc.TolgeeEmailParams params) {
    }
    
    private void validateProps() {
    }
}