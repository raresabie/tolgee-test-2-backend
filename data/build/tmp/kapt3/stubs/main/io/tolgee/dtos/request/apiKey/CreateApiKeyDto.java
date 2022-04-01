package io.tolgee.dtos.request.apiKey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0007J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005H\u0007J\t\u0010\u001c\u001a\u00020\u0019H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lio/tolgee/dtos/request/apiKey/CreateApiKeyDto;", "", "projectId", "", "scopes", "", "Lio/tolgee/model/enums/ApiScope;", "(JLjava/util/Set;)V", "getProjectId", "()J", "setProjectId", "(J)V", "getScopes", "()Ljava/util/Set;", "setScopes", "(Ljava/util/Set;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "jsonGetScopes", "", "jsonSetScopes", "", "toString", "data"})
public final class CreateApiKeyDto {
    @javax.validation.constraints.Min(value = 1L)
    @javax.validation.constraints.NotNull()
    private long projectId;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotEmpty()
    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.apiKey.CreateApiKeyDto copy(long projectId, @org.jetbrains.annotations.NotNull()
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
    
    public CreateApiKeyDto() {
        super();
    }
    
    public CreateApiKeyDto(long projectId, @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(example = "\n    [\"screenshots.upload\", \"screenshots.delete\", \"translations.edit\", \"screenshots.view\", \"translations.view\", \"keys.edit\"]\n    ")
    java.util.Set<? extends io.tolgee.model.enums.ApiScope> scopes) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getProjectId() {
        return 0L;
    }
    
    public final void setProjectId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<io.tolgee.model.enums.ApiScope> component2() {
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