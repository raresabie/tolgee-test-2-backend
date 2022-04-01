package io.tolgee.dtos.cacheable;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0003JV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lio/tolgee/dtos/cacheable/PermissionDto;", "Ljava/io/Serializable;", "id", "", "userId", "invitationId", "type", "Lio/tolgee/model/Permission$ProjectPermissionType;", "projectId", "languageIds", "", "(JLjava/lang/Long;Ljava/lang/Long;Lio/tolgee/model/Permission$ProjectPermissionType;JLjava/util/Set;)V", "getId", "()J", "getInvitationId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLanguageIds", "()Ljava/util/Set;", "getProjectId", "getType", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Lio/tolgee/model/Permission$ProjectPermissionType;JLjava/util/Set;)Lio/tolgee/dtos/cacheable/PermissionDto;", "equals", "", "other", "", "hashCode", "", "toString", "", "data"})
public final class PermissionDto implements java.io.Serializable {
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long userId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long invitationId = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.model.Permission.ProjectPermissionType type = null;
    private final long projectId = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Set<java.lang.Long> languageIds = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.cacheable.PermissionDto copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Long userId, @org.jetbrains.annotations.Nullable()
    java.lang.Long invitationId, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType type, long projectId, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.Long> languageIds) {
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
    
    public PermissionDto(long id, @org.jetbrains.annotations.Nullable()
    java.lang.Long userId, @org.jetbrains.annotations.Nullable()
    java.lang.Long invitationId, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType type, long projectId, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.Long> languageIds) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getInvitationId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Permission.ProjectPermissionType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.Permission.ProjectPermissionType getType() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getProjectId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.Long> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<java.lang.Long> getLanguageIds() {
        return null;
    }
}