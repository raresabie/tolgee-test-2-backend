package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lio/tolgee/model/views/UserAccountWithOrganizationRoleView;", "", "id", "", "getId", "()J", "name", "", "getName", "()Ljava/lang/String;", "organizationRole", "Lio/tolgee/model/enums/OrganizationRoleType;", "getOrganizationRole", "()Lio/tolgee/model/enums/OrganizationRoleType;", "setOrganizationRole", "(Lio/tolgee/model/enums/OrganizationRoleType;)V", "username", "getUsername", "setUsername", "(Ljava/lang/String;)V", "data"})
public abstract interface UserAccountWithOrganizationRoleView {
    
    public abstract long getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUsername();
    
    public abstract void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.model.enums.OrganizationRoleType getOrganizationRole();
    
    public abstract void setOrganizationRole(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType p0);
}