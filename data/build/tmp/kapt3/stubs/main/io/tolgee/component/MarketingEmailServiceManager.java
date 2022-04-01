package io.tolgee.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0012J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0012J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0017J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/tolgee/component/MarketingEmailServiceManager;", "", "sendInBlueProperties", "Lio/tolgee/configuration/tolgee/SendInBlueProperties;", "contactsApi", "LsibApi/ContactsApi;", "(Lio/tolgee/configuration/tolgee/SendInBlueProperties;LsibApi/ContactsApi;)V", "getCreateContactDto", "LsibModel/CreateContact;", "email", "", "name", "getUpdateContactDto", "LsibModel/UpdateContact;", "newEmail", "newName", "submitNewContact", "", "updateContact", "oldEmail", "data"})
@org.springframework.stereotype.Component()
public class MarketingEmailServiceManager {
    private final io.tolgee.configuration.tolgee.SendInBlueProperties sendInBlueProperties = null;
    private final sibApi.ContactsApi contactsApi = null;
    
    public MarketingEmailServiceManager(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.SendInBlueProperties sendInBlueProperties, @org.jetbrains.annotations.Nullable()
    sibApi.ContactsApi contactsApi) {
        super();
    }
    
    @org.springframework.scheduling.annotation.Async()
    public void submitNewContact(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.springframework.scheduling.annotation.Async()
    public void updateContact(@org.jetbrains.annotations.NotNull()
    java.lang.String oldEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String newEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String newName) {
    }
    
    private sibModel.UpdateContact getUpdateContactDto(java.lang.String newEmail, java.lang.String newName) {
        return null;
    }
    
    private sibModel.CreateContact getCreateContactDto(java.lang.String email, java.lang.String name) {
        return null;
    }
}