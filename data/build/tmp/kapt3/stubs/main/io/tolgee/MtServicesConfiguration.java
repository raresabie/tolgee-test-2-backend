package io.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/tolgee/MtServicesConfiguration;", "", "googleMachineTranslationProperties", "Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;", "awsMachineTranslationProperties", "Lio/tolgee/configuration/tolgee/machineTranslation/AwsMachineTranslationProperties;", "(Lio/tolgee/configuration/tolgee/machineTranslation/GoogleMachineTranslationProperties;Lio/tolgee/configuration/tolgee/machineTranslation/AwsMachineTranslationProperties;)V", "getAwsTranslationService", "Lcom/amazonaws/services/translate/AmazonTranslate;", "getGoogleTranslationService", "Lcom/google/cloud/translate/Translate;", "data"})
@org.springframework.context.annotation.Configuration()
public class MtServicesConfiguration {
    private final io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties googleMachineTranslationProperties = null;
    private final io.tolgee.configuration.tolgee.machineTranslation.AwsMachineTranslationProperties awsMachineTranslationProperties = null;
    
    public MtServicesConfiguration(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.GoogleMachineTranslationProperties googleMachineTranslationProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.machineTranslation.AwsMachineTranslationProperties awsMachineTranslationProperties) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.context.annotation.Bean()
    public com.google.cloud.translate.Translate getGoogleTranslationService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.context.annotation.Bean()
    public com.amazonaws.services.translate.AmazonTranslate getAwsTranslationService() {
        return null;
    }
}