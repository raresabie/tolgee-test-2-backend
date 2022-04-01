package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0012J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0012J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001cH\u0012J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001cH\u0017J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001eH\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0&2\u0006\u0010\'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0*2\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020/H\u0012J\b\u00100\u001a\u00020\u000eH\u0017J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(H\u0016J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,H\u0016J\u001c\u00104\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lio/tolgee/service/InvitationService;", "", "invitationRepository", "Lio/tolgee/repository/InvitationRepository;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "organizationRoleService", "Lio/tolgee/service/OrganizationRoleService;", "permissionService", "Lio/tolgee/service/PermissionService;", "tolgeeEmailSender", "Lio/tolgee/component/TolgeeEmailSender;", "(Lio/tolgee/repository/InvitationRepository;Lio/tolgee/security/AuthenticationFacade;Lio/tolgee/service/OrganizationRoleService;Lio/tolgee/service/PermissionService;Lio/tolgee/component/TolgeeEmailSender;)V", "accept", "", "code", "", "userAccount", "Lio/tolgee/model/UserAccount;", "acceptOrganizationInvitation", "organizationRole", "Lio/tolgee/model/OrganizationRole;", "acceptProjectInvitation", "Lio/tolgee/model/Permission;", "permission", "checkEmailNotAlreadyInvited", "params", "Lio/tolgee/dtos/misc/CreateOrganizationInvitationParams;", "Lio/tolgee/dtos/misc/CreateProjectInvitationParams;", "create", "Lio/tolgee/model/Invitation;", "delete", "invitation", "findById", "Ljava/util/Optional;", "id", "", "getForOrganization", "", "organization", "Lio/tolgee/model/Organization;", "getForProject", "", "project", "Lio/tolgee/model/Project;", "getInvitation", "getInvitationInstance", "Lio/tolgee/dtos/misc/CreateInvitationParams;", "removeExpired", "userOrInvitationWithEmailExists", "", "email", "validateProjectXorOrganization", "data"})
@org.springframework.stereotype.Service()
public class InvitationService {
    private final io.tolgee.repository.InvitationRepository invitationRepository = null;
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    private final io.tolgee.service.OrganizationRoleService organizationRoleService = null;
    private final io.tolgee.service.PermissionService permissionService = null;
    private final io.tolgee.component.TolgeeEmailSender tolgeeEmailSender = null;
    
    @org.springframework.beans.factory.annotation.Autowired()
    public InvitationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.InvitationRepository invitationRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.OrganizationRoleService organizationRoleService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.PermissionService permissionService, @org.jetbrains.annotations.NotNull()
    io.tolgee.component.TolgeeEmailSender tolgeeEmailSender) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Invitation create(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.misc.CreateProjectInvitationParams params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Invitation create(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.misc.CreateOrganizationInvitationParams params) {
        return null;
    }
    
    private io.tolgee.model.Invitation getInvitationInstance(io.tolgee.dtos.misc.CreateInvitationParams params) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void removeExpired() {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void accept(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void accept(@org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
    }
    
    private void validateProjectXorOrganization(io.tolgee.model.Permission permission, io.tolgee.model.OrganizationRole organizationRole) {
    }
    
    private void acceptOrganizationInvitation(io.tolgee.model.UserAccount userAccount, io.tolgee.model.OrganizationRole organizationRole) {
    }
    
    private io.tolgee.model.Permission acceptProjectInvitation(io.tolgee.model.Permission permission, io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Invitation getInvitation(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.Invitation> findById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<io.tolgee.model.Invitation> getForProject(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void delete(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Invitation invitation) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.Invitation> getForOrganization(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
        return null;
    }
    
    private void checkEmailNotAlreadyInvited(io.tolgee.dtos.misc.CreateProjectInvitationParams params) {
    }
    
    private void checkEmailNotAlreadyInvited(io.tolgee.dtos.misc.CreateOrganizationInvitationParams params) {
    }
    
    public boolean userOrInvitationWithEmailExists(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project) {
        return false;
    }
    
    public boolean userOrInvitationWithEmailExists(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
        return false;
    }
}