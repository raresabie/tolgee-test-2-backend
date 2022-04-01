package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010%\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001aH\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J\u0018\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010*\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010+\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010,\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010-\u001a\u00020\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0/H\u0016J \u00100\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00101\u001a\u000202H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lio/tolgee/service/OrganizationRoleService;", "", "organizationRoleRepository", "Lio/tolgee/repository/OrganizationRoleRepository;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "userAccountService", "Lio/tolgee/service/UserAccountService;", "entityManager", "Ljavax/persistence/EntityManager;", "(Lio/tolgee/repository/OrganizationRoleRepository;Lio/tolgee/security/AuthenticationFacade;Lio/tolgee/service/UserAccountService;Ljavax/persistence/EntityManager;)V", "acceptInvitation", "", "organizationRole", "Lio/tolgee/model/OrganizationRole;", "userAccount", "Lio/tolgee/model/UserAccount;", "checkUserIsMemberOrOwner", "organizationId", "", "userId", "checkUserIsOwner", "createForInvitation", "invitation", "Lio/tolgee/model/Invitation;", "type", "Lio/tolgee/model/enums/OrganizationRoleType;", "organization", "Lio/tolgee/model/Organization;", "delete", "id", "deleteAllInOrganization", "findType", "getType", "grantMemberRoleToUser", "user", "grantOwnerRoleToUser", "grantRoleToUser", "organizationRoleType", "isAnotherOwnerInOrganization", "", "isUserMemberOrOwner", "isUserOwner", "leave", "removeUser", "saveAll", "organizationRoles", "", "setMemberRole", "dto", "Lio/tolgee/dtos/request/organization/SetOrganizationRoleDto;", "data"})
@org.springframework.transaction.annotation.Transactional()
@org.springframework.stereotype.Service()
public class OrganizationRoleService {
    private final io.tolgee.repository.OrganizationRoleRepository organizationRoleRepository = null;
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    private final io.tolgee.service.UserAccountService userAccountService = null;
    private final javax.persistence.EntityManager entityManager = null;
    
    public OrganizationRoleService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.OrganizationRoleRepository organizationRoleRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.UserAccountService userAccountService, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    public void checkUserIsOwner(long userId, long organizationId) {
    }
    
    public void checkUserIsOwner(long organizationId) {
    }
    
    public void checkUserIsMemberOrOwner(long userId, long organizationId) {
    }
    
    public void checkUserIsMemberOrOwner(long organizationId) {
    }
    
    public boolean isUserMemberOrOwner(long userId, long organizationId) {
        return false;
    }
    
    public boolean isUserOwner(long userId, long organizationId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.enums.OrganizationRoleType getType(long userId, long organizationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.enums.OrganizationRoleType getType(long organizationId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.enums.OrganizationRoleType findType(long userId, long organizationId) {
        return null;
    }
    
    public void grantRoleToUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount user, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType organizationRoleType) {
    }
    
    public void leave(long organizationId) {
    }
    
    public void removeUser(long organizationId, long userId) {
    }
    
    public void deleteAllInOrganization(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
    }
    
    public void delete(long id) {
    }
    
    public void grantMemberRoleToUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount user, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
    }
    
    public void grantOwnerRoleToUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount user, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
    }
    
    public void setMemberRole(long organizationId, long userId, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.organization.SetOrganizationRoleDto dto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.OrganizationRole createForInvitation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Invitation invitation, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType type, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
        return null;
    }
    
    public void acceptInvitation(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.OrganizationRole organizationRole, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
    }
    
    public boolean isAnotherOwnerInOrganization(long id) {
        return false;
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.OrganizationRole> organizationRoles) {
    }
}