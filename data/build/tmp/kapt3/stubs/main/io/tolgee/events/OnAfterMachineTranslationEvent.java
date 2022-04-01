package io.tolgee.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lio/tolgee/events/OnAfterMachineTranslationEvent;", "Lio/tolgee/events/MachineTranslationEvent;", "source", "", "textToTranslate", "", "project", "Lio/tolgee/model/Project;", "expectedSumPrice", "", "actualSumPrice", "(Ljava/lang/Object;Ljava/lang/String;Lio/tolgee/model/Project;II)V", "getActualSumPrice", "()I", "data"})
public final class OnAfterMachineTranslationEvent extends io.tolgee.events.MachineTranslationEvent {
    
    /**
     * The actual total price of translation actually consumed
     */
    private final int actualSumPrice = 0;
    
    public OnAfterMachineTranslationEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object source, @org.jetbrains.annotations.NotNull()
    java.lang.String textToTranslate, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, int expectedSumPrice, int actualSumPrice) {
        super(null, null, null, 0);
    }
    
    /**
     * The actual total price of translation actually consumed
     */
    public final int getActualSumPrice() {
        return 0;
    }
}