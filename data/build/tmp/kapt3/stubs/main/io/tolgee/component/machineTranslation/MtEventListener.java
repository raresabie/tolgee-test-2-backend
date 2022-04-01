package io.tolgee.component.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/tolgee/component/machineTranslation/MtEventListener;", "", "mtCreditBucketService", "Lio/tolgee/service/machineTranslation/MtCreditBucketService;", "(Lio/tolgee/service/machineTranslation/MtCreditBucketService;)V", "onAfterMtEvent", "", "event", "Lio/tolgee/events/OnAfterMachineTranslationEvent;", "onBeforeMtEvent", "Lio/tolgee/events/OnBeforeMachineTranslationEvent;", "data"})
@org.springframework.stereotype.Component()
public class MtEventListener {
    private final io.tolgee.service.machineTranslation.MtCreditBucketService mtCreditBucketService = null;
    
    public MtEventListener(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.machineTranslation.MtCreditBucketService mtCreditBucketService) {
        super();
    }
    
    @org.springframework.context.event.EventListener(value = {io.tolgee.events.OnBeforeMachineTranslationEvent.class})
    public void onBeforeMtEvent(@org.jetbrains.annotations.NotNull()
    io.tolgee.events.OnBeforeMachineTranslationEvent event) {
    }
    
    @org.springframework.context.event.EventListener(value = {io.tolgee.events.OnAfterMachineTranslationEvent.class})
    public void onAfterMtEvent(@org.jetbrains.annotations.NotNull()
    io.tolgee.events.OnAfterMachineTranslationEvent event) {
    }
}