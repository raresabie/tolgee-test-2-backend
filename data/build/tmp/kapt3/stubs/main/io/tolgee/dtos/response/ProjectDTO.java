package io.tolgee.dtos.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, d2 = {"Lio/tolgee/dtos/response/ProjectDTO;", "", "id", "", "name", "", "permissionType", "Lio/tolgee/model/Permission$ProjectPermissionType;", "(Ljava/lang/Long;Ljava/lang/String;Lio/tolgee/model/Permission$ProjectPermissionType;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPermissionType", "()Lio/tolgee/model/Permission$ProjectPermissionType;", "setPermissionType", "(Lio/tolgee/model/Permission$ProjectPermissionType;)V", "Companion", "data"})
public class ProjectDTO {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private io.tolgee.model.Permission.ProjectPermissionType permissionType;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.dtos.response.ProjectDTO.Companion Companion = null;
    
    public ProjectDTO() {
        super();
    }
    
    public ProjectDTO(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType permissionType) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.Permission.ProjectPermissionType getPermissionType() {
        return null;
    }
    
    public final void setPermissionType(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.Permission.ProjectPermissionType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.tolgee.dtos.response.ProjectDTO fromEntityAndPermission(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Permission.ProjectPermissionType permissionType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lio/tolgee/dtos/response/ProjectDTO$Companion;", "", "()V", "fromEntityAndPermission", "Lio/tolgee/dtos/response/ProjectDTO;", "project", "Lio/tolgee/model/Project;", "permissionType", "Lio/tolgee/model/Permission$ProjectPermissionType;", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final io.tolgee.dtos.response.ProjectDTO fromEntityAndPermission(@org.jetbrains.annotations.NotNull()
        io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
        io.tolgee.model.Permission.ProjectPermissionType permissionType) {
            return null;
        }
    }
}