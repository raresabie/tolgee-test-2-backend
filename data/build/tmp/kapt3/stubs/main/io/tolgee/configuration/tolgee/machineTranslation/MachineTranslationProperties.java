package io.tolgee.configuration.tolgee.machineTranslation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/configuration/tolgee/machineTranslation/MachineTranslationProperties;", "", "google", "Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;", "aws", "Lio/tolgee/configuration/tolgee/machineTranslation/AwsMachineTranslationProperties;", "freeCreditsAmount", "", "(Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;Lio/tolgee/configuration/tolgee/machineTranslation/AwsMachineTranslationProperties;J)V", "getAws", "()Lio/tolgee/configuration/tolgee/machineTranslation/AwsMachineTranslationProperties;", "setAws", "(Lio/tolgee/configuration/tolgee/machineTranslation/AwsMachineTranslationProperties;)V", "getFreeCreditsAmount", "()J", "setFreeCreditsAmount", "(J)V", "getGoogle", "()Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;", "setGoogle", "(Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;)V", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.machine-translation")
public class MachineTranslationProperties {
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties google;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.configuration.tolgee.machineTranslation.AwsMachineTranslationProperties aws;
    private long freeCreditsAmount;
    
    public MachineTranslationProperties() {
        super();
    }
    
    public MachineTranslationProperties(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties google, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.AwsMachineTranslationProperties aws, long freeCreditsAmount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties getGoogle() {
        return null;
    }
    
    public final void setGoogle(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.configuration.tolgee.machineTranslation.AwsMachineTranslationProperties getAws() {
        return null;
    }
    
    public final void setAws(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.AwsMachineTranslationProperties p0) {
    }
    
    public final long getFreeCreditsAmount() {
        return 0L;
    }
    
    public final void setFreeCreditsAmount(long p0) {
    }
}