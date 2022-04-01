package io.tolgee.dtos.request.apiKey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0007J\t\u0010\u0014\u001a\u00020\u0011H\u00d6\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0015"}, d2 = {"Lio/tolgee/dtos/request/apiKey/V2EditApiKeyDto;", "", "scopes", "", "Lio/tolgee/model/enums/ApiScope;", "(Ljava/util/Set;)V", "getScopes", "()Ljava/util/Set;", "setScopes", "component1", "copy", "equals", "", "other", "hashCode", "", "jsonGetScopes", "", "jsonSetScopes", "", "toString", "data"})
public final class V2EditApiKeyDto {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotEmpty()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.apiKey.V2EditApiKeyDto copy(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(example = "\n    [\"screenshots.upload\", \"screenshots.delete\", \"translations.edit\", \"screenshots.view\", \"translations.view\", \"keys.edit\"]\n    ")
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public V2EditApiKeyDto() {
        super();
    }
    
    public V2EditApiKeyDto(@org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(example = "\n    [\"screenshots.upload\", \"screenshots.delete\", \"translations.edit\", \"screenshots.view\", \"translations.view\", \"keys.edit\"]\n    ")
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<io.tolgee.model.enums.ApiScope> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<io.tolgee.model.enums.ApiScope> getScopes() {
        return null;
    }
    
    public final void setScopes(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> p0) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @com.fasterxml.jackson.annotation.JsonSetter(value = "scopes")
    public final void jsonSetScopes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> scopes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    @com.fasterxml.jackson.annotation.JsonGetter(value = "scopes")
    public final java.util.Set<java.lang.String> jsonGetScopes() {
        return null;
    }
}