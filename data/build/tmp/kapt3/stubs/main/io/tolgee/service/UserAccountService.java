package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0017J\u0010\u0010\"\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0012H\u0017J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010)\u001a\u00020&H\u0016J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120+2\b\u0010,\u001a\u0004\u0018\u00010&2\b\u0010-\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120+2\b\u0010)\u001a\u0004\u0018\u00010&H\u0016J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120+2\u0006\u0010-\u001a\u000200H\u0096\u0002J\u0010\u0010/\u001a\u00020\u00122\u0006\u0010)\u001a\u00020&H\u0016J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u0012022\f\u00103\u001a\b\u0012\u0004\u0012\u00020004H\u0016J(\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010&H\u0016J9\u0010<\u001a\b\u0012\u0004\u0012\u00020=062\u0006\u0010>\u001a\u0002002\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010?\u001a\u0004\u0018\u000100H\u0016\u00a2\u0006\u0002\u0010@J9\u0010A\u001a\b\u0012\u0004\u0012\u00020B062\u0006\u0010>\u001a\u0002002\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010?\u001a\u0004\u0018\u000100H\u0016\u00a2\u0006\u0002\u0010@J\u0012\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010-\u001a\u000200H\u0017J\u001a\u0010E\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00122\b\u0010F\u001a\u0004\u0018\u00010&H\u0017J\u0018\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020D2\u0006\u0010!\u001a\u00020\u0012H\u0012J\u0010\u0010I\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0012H\u0017J\u0010\u0010J\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0017J\u0010\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0017J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u0012022\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00120OH\u0016J\u0010\u0010P\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0017J\u0018\u0010Q\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010R\u001a\u00020SH\u0017J\u001a\u0010T\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\b\u0010F\u001a\u0004\u0018\u00010&H\u0017J\u001a\u0010U\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\b\u0010V\u001a\u0004\u0018\u00010&H\u0017J\u0018\u0010W\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010X\u001a\u00020YH\u0017J\u0018\u0010Z\u001a\u00020#2\u0006\u0010X\u001a\u00020Y2\u0006\u0010!\u001a\u00020\u0012H\u0012J\u0018\u0010[\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010X\u001a\u00020YH\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\\"}, d2 = {"Lio/tolgee/service/UserAccountService;", "", "userAccountRepository", "Lio/tolgee/repository/UserAccountRepository;", "applicationEventPublisher", "Lorg/springframework/context/ApplicationEventPublisher;", "tolgeeProperties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "avatarService", "Lio/tolgee/service/AvatarService;", "(Lio/tolgee/repository/UserAccountRepository;Lorg/springframework/context/ApplicationEventPublisher;Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/service/AvatarService;)V", "emailVerificationService", "Lio/tolgee/service/EmailVerificationService;", "getEmailVerificationService", "()Lio/tolgee/service/EmailVerificationService;", "setEmailVerificationService", "(Lio/tolgee/service/EmailVerificationService;)V", "implicitUser", "Lio/tolgee/model/UserAccount;", "getImplicitUser", "()Lio/tolgee/model/UserAccount;", "isAnyUserAccount", "", "()Z", "permissionService", "Lio/tolgee/service/PermissionService;", "getPermissionService", "()Lio/tolgee/service/PermissionService;", "setPermissionService", "(Lio/tolgee/service/PermissionService;)V", "createUser", "request", "Lio/tolgee/dtos/request/auth/SignUpDto;", "userAccount", "delete", "", "dtoToEntity", "encodePassword", "", "rawPassword", "find", "username", "findByThirdParty", "Ljava/util/Optional;", "type", "id", "findOptional", "get", "", "getAllByIds", "", "ids", "", "getAllInOrganization", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/UserAccountWithOrganizationRoleView;", "organizationId", "pageable", "Lorg/springframework/data/domain/Pageable;", "search", "getAllInProject", "Lio/tolgee/model/views/UserAccountInProjectView;", "projectId", "exceptUserId", "(JLorg/springframework/data/domain/Pageable;Ljava/lang/String;Ljava/lang/Long;)Lorg/springframework/data/domain/Page;", "getAllInProjectWithPermittedLanguages", "Lio/tolgee/model/views/UserAccountInProjectWithLanguagesView;", "getDto", "Lio/tolgee/dtos/cacheable/UserAccountDto;", "isResetCodeValid", "code", "publishUserInfoUpdatedEvent", "old", "removeAvatar", "removeResetCode", "save", "user", "saveAll", "userAccounts", "", "saveAndFlush", "setAvatar", "avatar", "Ljava/io/InputStream;", "setResetPasswordCode", "setUserPassword", "password", "update", "dto", "Lio/tolgee/dtos/request/UserUpdateRequestDto;", "updatePassword", "updateUserEmail", "data"})
@org.springframework.stereotype.Service()
public class UserAccountService {
    private final io.tolgee.repository.UserAccountRepository userAccountRepository = null;
    private final org.springframework.context.ApplicationEventPublisher applicationEventPublisher = null;
    private final io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties = null;
    private final io.tolgee.service.AvatarService avatarService = null;
    @org.springframework.beans.factory.annotation.Autowired()
    public io.tolgee.service.EmailVerificationService emailVerificationService;
    @org.springframework.context.annotation.Lazy()
    @org.springframework.beans.factory.annotation.Autowired()
    public io.tolgee.service.PermissionService permissionService;
    
    public UserAccountService(@org.jetbrains.annotations.NotNull()
    io.tolgee.repository.UserAccountRepository userAccountRepository, @org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationEventPublisher applicationEventPublisher, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties tolgeeProperties, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.AvatarService avatarService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.EmailVerificationService getEmailVerificationService() {
        return null;
    }
    
    public void setEmailVerificationService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.EmailVerificationService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.service.PermissionService getPermissionService() {
        return null;
    }
    
    public void setPermissionService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.PermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.UserAccount> findOptional(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.tolgee.model.UserAccount find(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount get(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.UserAccount> get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.cache.annotation.Cacheable(cacheNames = {"userAccounts"}, key = "#id")
    public io.tolgee.dtos.cacheable.UserAccountDto getDto(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#result.id")
    public io.tolgee.model.UserAccount createUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount createUser(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.auth.SignUpDto request) {
        return null;
    }
    
    @org.springframework.cache.annotation.CacheEvict(value = {"userAccounts"}, key = "#userAccount.id")
    public void delete(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.tolgee.model.UserAccount dtoToEntity(@org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.auth.SignUpDto request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.Cacheable(cacheNames = {"userAccounts"}, key = "\'implicit\'")
    public io.tolgee.model.UserAccount getImplicitUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Optional<io.tolgee.model.UserAccount> findByThirdParty(@org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#result.id")
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.UserAccount setResetPasswordCode(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#result.id")
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.UserAccount setUserPassword(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.Nullable()
    java.lang.String password) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public boolean isResetCodeValid(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#result.id")
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.UserAccount removeResetCode(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
        return null;
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#userAccount.id")
    @org.springframework.transaction.annotation.Transactional()
    public void removeAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount) {
    }
    
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#userAccount.id")
    @org.springframework.transaction.annotation.Transactional()
    public void setAvatar(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.NotNull()
    java.io.InputStream avatar) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.UserAccountWithOrganizationRoleView> getAllInOrganization(long organizationId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    java.lang.String search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.UserAccountInProjectView> getAllInProject(long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.Long exceptUserId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<io.tolgee.model.views.UserAccountInProjectWithLanguagesView> getAllInProjectWithPermittedLanguages(long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.Long exceptUserId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String encodePassword(@org.jetbrains.annotations.NotNull()
    java.lang.String rawPassword) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#result.id")
    @org.springframework.transaction.annotation.Transactional()
    public io.tolgee.model.UserAccount update(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.UserUpdateRequestDto dto) {
        return null;
    }
    
    private void updatePassword(io.tolgee.dtos.request.UserUpdateRequestDto dto, io.tolgee.model.UserAccount userAccount) {
    }
    
    private void updateUserEmail(io.tolgee.model.UserAccount userAccount, io.tolgee.dtos.request.UserUpdateRequestDto dto) {
    }
    
    private void publishUserInfoUpdatedEvent(io.tolgee.dtos.cacheable.UserAccountDto old, io.tolgee.model.UserAccount userAccount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.UserAccount> saveAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.UserAccount> userAccounts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#result.id")
    public io.tolgee.model.UserAccount save(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.cache.annotation.CacheEvict(cacheNames = {"userAccounts"}, key = "#result.id")
    public io.tolgee.model.UserAccount saveAndFlush(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<io.tolgee.model.UserAccount> getAllByIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> ids) {
        return null;
    }
    
    public boolean isAnyUserAccount() {
        return false;
    }
}