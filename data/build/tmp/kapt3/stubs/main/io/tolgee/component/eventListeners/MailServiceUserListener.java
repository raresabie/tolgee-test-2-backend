package io.tolgee.component.eventListeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/component/eventListeners/MailServiceUserListener;", "", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "marketingEmailServiceManager", "Lio/tolgee/component/MarketingEmailServiceManager;", "(Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/component/MarketingEmailServiceManager;)V", "onUserCreated", "", "event", "Lio/tolgee/events/user/OnUserCreated;", "onUserEmailVerifiedFirst", "Lio/tolgee/events/user/OnUserEmailVerifiedFirst;", "onUserUpdated", "Lio/tolgee/events/user/OnUserUpdated;", "data"})
@org.springframework.stereotype.Component()
public class MailServiceUserListener {
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final io.tolgee.component.MarketingEmailServiceManager marketingEmailServiceManager = null;
    
    public MailServiceUserListener(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.MarketingEmailServiceManager marketingEmailServiceManager) {
        super();
    }
    
    @org.springframework.context.event.EventListener(value = {io.tolgee.events.user.OnUserCreated.class})
    public void onUserCreated(@org.jetbrains.annotations.NotNull()
    io.tolgee.events.user.OnUserCreated event) {
    }
    
    @org.springframework.context.event.EventListener(value = {io.tolgee.events.user.OnUserEmailVerifiedFirst.class})
    public void onUserEmailVerifiedFirst(@org.jetbrains.annotations.NotNull()
    io.tolgee.events.user.OnUserEmailVerifiedFirst event) {
    }
    
    @org.springframework.context.event.EventListener(value = {io.tolgee.events.user.OnUserUpdated.class})
    public void onUserUpdated(@org.jetbrains.annotations.NotNull()
    io.tolgee.events.user.OnUserUpdated event) {
    }
}