package io.tolgee.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/events/MachineTranslationEvent;", "Lorg/springframework/context/ApplicationEvent;", "source", "", "textToTranslate", "", "project", "Lio/tolgee/model/Project;", "expectedSumPrice", "", "(Ljava/lang/Object;Ljava/lang/String;Lio/tolgee/model/Project;I)V", "getExpectedSumPrice", "()I", "getProject", "()Lio/tolgee/model/Project;", "getTextToTranslate", "()Ljava/lang/String;", "data"})
public class MachineTranslationEvent extends org.springframework.context.ApplicationEvent {
    
    /**
     * The text which is going to be translated
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String textToTranslate = null;
    
    /**
     * The project containing translation
     */
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.model.Project project = null;
    
    /**
     * The total price of translation in credits, which was expected
     */
    private final int expectedSumPrice = 0;
    
    public MachineTranslationEvent(@org.jetbrains.annotations.NotNull()
    java.lang.Object source, @org.jetbrains.annotations.NotNull()
    java.lang.String textToTranslate, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, int expectedSumPrice) {
        super(null);
    }
    
    /**
     * The text which is going to be translated
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextToTranslate() {
        return null;
    }
    
    /**
     * The project containing translation
     */
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Project getProject() {
        return null;
    }
    
    /**
     * The total price of translation in credits, which was expected
     */
    public final int getExpectedSumPrice() {
        return 0;
    }
}