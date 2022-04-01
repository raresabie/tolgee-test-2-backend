package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\'J;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\'\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lio/tolgee/repository/UserAccountRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/UserAccount;", "", "findByThirdPartyAuthTypeAndThirdPartyAuthId", "Ljava/util/Optional;", "thirdPartyAuthId", "", "thirdPartyAuthType", "findByUsername", "username", "getAllInOrganization", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/UserAccountWithOrganizationRoleView;", "organizationId", "pageable", "Lorg/springframework/data/domain/Pageable;", "search", "getAllInProject", "Lio/tolgee/model/views/UserAccountInProjectView;", "projectId", "exceptUserId", "(JLorg/springframework/data/domain/Pageable;Ljava/lang/String;Ljava/lang/Long;)Lorg/springframework/data/domain/Page;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface UserAccountRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.UserAccount, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.UserAccount> findByUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.UserAccount> findByThirdPartyAuthTypeAndThirdPartyAuthId(@org.jetbrains.annotations.NotNull()
    java.lang.String thirdPartyAuthId, @org.jetbrains.annotations.NotNull()
    java.lang.String thirdPartyAuthType);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select userAccount.id as id, userAccount.name as name, userAccount.username as username, memberRole.type as organizationRole from UserAccount userAccount \n        join OrganizationRole memberRole on memberRole.user = userAccount and memberRole.organization.id = :organizationId\n        where ((lower(userAccount.name)\n        like lower(concat(\'%\', cast(:search as text),\'%\')) \n        or lower(userAccount.username) like lower(concat(\'%\', cast(:search as text),\'%\'))) or cast(:search as text) is null)\n        ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.UserAccountWithOrganizationRoleView> getAllInOrganization(long organizationId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n        select ua.id as id, ua.name as name, ua.username as username, p.type as directPermissions, orl.type as organizationRole,\n        orl.organization.id as oid, o.basePermissions as organizationBasePermissions from UserAccount ua, Project r \n        left join Permission p on ua = p.user and p.project.id = :projectId\n        left join OrganizationRole orl on orl.user = ua and r.organizationOwner = orl.organization\n        left join Organization  o on orl.organization = o\n        where r.id = :projectId and (p is not null or orl is not null)\n        and ( :exceptUserId is null or ua.id <> :exceptUserId)\n        and ((lower(ua.name)\n        like lower(concat(\'%\', cast(:search as text),\'%\'))\n        or lower(ua.username) like lower(concat(\'%\', cast(:search as text),\'%\'))) or cast(:search as text) is null)\n    ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.UserAccountInProjectView> getAllInProject(long projectId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.Long exceptUserId);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}