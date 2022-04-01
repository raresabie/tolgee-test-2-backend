package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0017J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0019H\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\'\u001a\u00020\"H\u0016J;\u0010(\u001a\b\u0012\u0004\u0012\u00020$0)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001fH\u0016\u00a2\u0006\u0002\u00100J=\u0010(\u001a\b\u0012\u0004\u0012\u00020$0)2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u001fH\u0016\u00a2\u0006\u0002\u00103J\u001c\u00104\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u00106\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u00106\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\"H\u0016J\u0010\u00107\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u0017H\u0017J\u0016\u0010:\u001a\u00020\u001d2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170<H\u0016J\u0018\u0010=\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?H\u0017J\u0010\u0010@\u001a\u0002022\u0006\u0010\'\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@WX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lio/tolgee/service/OrganizationService;", "", "organizationRepository", "Lio/tolgee/repository/OrganizationRepository;", "authenticationFacade", "Lio/tolgee/security/AuthenticationFacade;", "slugGenerator", "Lio/tolgee/util/SlugGenerator;", "organizationRoleService", "Lio/tolgee/service/OrganizationRoleService;", "invitationService", "Lio/tolgee/service/InvitationService;", "avatarService", "Lio/tolgee/service/AvatarService;", "(Lio/tolgee/repository/OrganizationRepository;Lio/tolgee/security/AuthenticationFacade;Lio/tolgee/util/SlugGenerator;Lio/tolgee/service/OrganizationRoleService;Lio/tolgee/service/InvitationService;Lio/tolgee/service/AvatarService;)V", "<set-?>", "Lio/tolgee/service/ProjectService;", "projectService", "getProjectService", "()Lio/tolgee/service/ProjectService;", "setProjectService", "(Lio/tolgee/service/ProjectService;)V", "create", "Lio/tolgee/model/Organization;", "createDto", "Lio/tolgee/dtos/request/organization/OrganizationDto;", "userAccount", "Lio/tolgee/model/UserAccount;", "delete", "", "id", "", "deleteAllByName", "name", "", "edit", "Lio/tolgee/model/views/OrganizationView;", "editDto", "find", "slug", "findPermittedPaged", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "requestParamsDto", "Lio/tolgee/dtos/request/organization/OrganizationRequestParamsDto;", "search", "exceptOrganizationId", "(Lorg/springframework/data/domain/Pageable;Lio/tolgee/dtos/request/organization/OrganizationRequestParamsDto;Ljava/lang/String;Ljava/lang/Long;)Lorg/springframework/data/domain/Page;", "filterCurrentUserOwner", "", "(Lorg/springframework/data/domain/Pageable;ZLjava/lang/String;Ljava/lang/Long;)Lorg/springframework/data/domain/Page;", "generateSlug", "oldSlug", "get", "isThereAnotherOwner", "removeAvatar", "organization", "saveAll", "organizations", "", "setAvatar", "avatar", "Ljava/io/InputStream;", "validateSlugUniqueness", "data"})
@org.springframework.transaction.annotation.Transactional()
@org.springframework.stereotype.Service()
public class OrganizationService {
    private final io.tolgee.repository.OrganizationRepository organizationRepository = null;
    private final io.tolgee.security.AuthenticationFacade authenticationFacade = null;
    private final io.tolgee.util.SlugGenerator slugGenerator = null;
    private final io.tolgee.service.OrganizationRoleService organizationRoleService = null;
    private final io.tolgee.service.InvitationService invitationService = null;
    private final io.tolgee.service.AvatarService avatarService = null;
    public io.tolgee.service.ProjectService projectService;
    
    public OrganizationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.OrganizationRepository organizationRepository, @org.jetbrains.annotations.NotNull()
    io.tolgee.security.AuthenticationFacade authenticationFacade, @org.jetbrains.annotations.NotNull()
    io.tolgee.util.SlugGenerator slugGenerator, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.OrganizationRoleService organizationRoleService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.InvitationService invitationService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.AvatarService avatarService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.ProjectService getProjectService() {
        return null;
    }
    
    @org.springframework.beans.factory.annotation.Autowired()
    public void setProjectService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Organization create(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.organization.OrganizationDto createDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.Organization create(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.organization.OrganizationDto createDto, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.OrganizationView> findPermittedPaged(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, boolean filterCurrentUserOwner, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.Long exceptOrganizationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.OrganizationView> findPermittedPaged(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.organization.OrganizationRequestParamsDto requestParamsDto, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.Long exceptOrganizationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Organization get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Organization find(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.Organization get(@org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.Organization find(@org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.views.OrganizationView edit(long id, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.organization.OrganizationDto editDto) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void delete(long id) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void removeAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization) {
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void setAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization, @org.jetbrains.annotations.NotNull()
    java.io.InputStream avatar) {
    }
    
    /**
     * Checks address part uniqueness
     * @return Returns true if valid
     */
    public boolean validateSlugUniqueness(@org.jetbrains.annotations.NotNull()
    java.lang.String slug) {
        return false;
    }
    
    public boolean isThereAnotherOwner(long id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String generateSlug(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String oldSlug) {
        return null;
    }
    
    public void deleteAllByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public void saveAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.tolgee.model.Organization> organizations) {
    }
}