package io.tolgee.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/tolgee/component/AutoTranslationListener;", "Lorg/springframework/context/ApplicationListener;", "Lio/tolgee/events/OnTranslationsSet;", "autoTranslationService", "Lio/tolgee/service/AutoTranslationService;", "(Lio/tolgee/service/AutoTranslationService;)V", "onApplicationEvent", "", "event", "data"})
@org.springframework.stereotype.Component()
public class AutoTranslationListener implements org.springframework.context.ApplicationListener<io.tolgee.events.OnTranslationsSet> {
    private final io.tolgee.service.AutoTranslationService autoTranslationService = null;
    
    public AutoTranslationListener(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.AutoTranslationService autoTranslationService) {
        super();
    }
    
    @java.lang.Override()
    public void onApplicationEvent(@org.jetbrains.annotations.NotNull()
    io.tolgee.events.OnTranslationsSet event) {
    }
}