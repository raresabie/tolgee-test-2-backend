package io.tolgee.dtos.response.ApiKeyDTO;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0015\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eBI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lio/tolgee/dtos/response/ApiKeyDTO/ApiKeyDTO;", "", "id", "", "key", "", "userName", "projectId", "projectName", "scopes", "", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Set;)V", "getId", "()J", "setId", "(J)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getProjectId", "setProjectId", "getProjectName", "setProjectName", "getScopes", "()Ljava/util/Set;", "setScopes", "(Ljava/util/Set;)V", "getUserName", "setUserName", "Companion", "data"})
public final class ApiKeyDTO {
    private long id;
    @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Resulting user\'s api key")
    private java.lang.String key;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String userName;
    private long projectId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String projectName;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<java.lang.String> scopes;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.dtos.response.ApiKeyDTO.ApiKeyDTO.Companion Companion = null;
    
    public ApiKeyDTO() {
        super();
    }
    
    public ApiKeyDTO(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, long projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectName, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> scopes) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getProjectId() {
        return 0L;
    }
    
    public final void setProjectId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProjectName() {
        return null;
    }
    
    public final void setProjectName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getScopes() {
        return null;
    }
    
    public final void setScopes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/tolgee/dtos/response/ApiKeyDTO/ApiKeyDTO$Companion;", "", "()V", "fromEntity", "Lio/tolgee/dtos/response/ApiKeyDTO/ApiKeyDTO;", "apiKey", "Lio/tolgee/model/ApiKey;", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.dtos.response.ApiKeyDTO.ApiKeyDTO fromEntity(@org.jetbrains.annotations.NotNull()
        io.tolgee.model.ApiKey apiKey) {
            return null;
        }
    }
}