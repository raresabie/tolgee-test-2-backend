package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0006\bg\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\b2\u0006\u0010\u0012\u001a\u00020\u0003H\'J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\'J0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\'J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\'J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\'J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\'\u00a8\u0006!"}, d2 = {"Lio/tolgee/repository/ProjectRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/Project;", "", "countAllBySlug", "slug", "", "findAllByName", "", "name", "findAllByNameAndUserOwner", "userOwner", "Lio/tolgee/model/UserAccount;", "findAllByOrganizationOwnerId", "organizationOwnerId", "findAllPermitted", "", "", "userAccountId", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/ProjectView;", "pageable", "Lorg/springframework/data/domain/Pageable;", "search", "findAllPermittedInOrganization", "findAllWithLanguages", "ids", "", "findViewById", "projectId", "getWithLanguages", "projectIds", "Companion", "data"})
@org.springframework.stereotype.Repository()
public abstract interface ProjectRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.Project, java.lang.Long> {
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.repository.ProjectRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_VIEW_QUERY = "select r.id as id, r.name as name, r.description as description,\n        r.slug as slug, r.avatarHash as avatarHash,\n        ua as userOwner, o.name as organizationOwnerName, o.slug as organizationOwnerSlug, \n        bl as baseLanguage,\n        o.basePermissions as organizationBasePermissions, role.type as organizationRole, p.type as directPermissions\n        from Project r\n        left join r.baseLanguage bl\n        left join UserAccount ua on ua.id = r.userOwner.id\n        left join Permission p on p.project = r and p.user.id = :userAccountId\n        left join Organization o on r.organizationOwner = o\n        left join OrganizationRole role on role.organization = o and role.user.id = :userAccountId\n        where (p is not null or role is not null)\n        ";
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "from Project r \n        left join fetch Permission p on p.project = r and p.user.id = :userAccountId\n        left join fetch Organization o on r.organizationOwner = o\n        left join fetch OrganizationRole role on role.organization = o and role.user.id = :userAccountId\n        where p is not null or (role is not null)\n        order by r.name\n        ")
    public abstract java.util.List<java.lang.Object[]> findAllPermitted(long userAccountId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select r.id as id, r.name as name, r.description as description,\n        r.slug as slug, r.avatarHash as avatarHash,\n        ua as userOwner, o.name as organizationOwnerName, o.slug as organizationOwnerSlug, \n        bl as baseLanguage,\n        o.basePermissions as organizationBasePermissions, role.type as organizationRole, p.type as directPermissions\n        from Project r\n        left join r.baseLanguage bl\n        left join UserAccount ua on ua.id = r.userOwner.id\n        left join Permission p on p.project = r and p.user.id = :userAccountId\n        left join Organization o on r.organizationOwner = o\n        left join OrganizationRole role on role.organization = o and role.user.id = :userAccountId\n        where (p is not null or role is not null)\n         \n        and (:search is null or (lower(r.name) like lower(concat(\'%\', cast(:search as text), \'%\'))\n        or lower(o.name) like lower(concat(\'%\', cast(:search as text),\'%\')))\n        or lower(ua.name) like lower(concat(\'%\', cast(:search as text),\'%\')))\n    ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.ProjectView> findAllPermitted(long userAccountId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    @org.springframework.data.repository.query.Param(value = "search")
    java.lang.String search);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Project> findAllByOrganizationOwnerId(long organizationOwnerId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n      select r.id as id, r.name as name, r.description as description,\n        r.slug as slug, r.avatarHash as avatarHash,\n        ua as userOwner, o.name as organizationOwnerName, o.slug as organizationOwnerSlug, \n        bl as baseLanguage,\n        o.basePermissions as organizationBasePermissions, role.type as organizationRole, p.type as directPermissions\n        from Project r\n        left join r.baseLanguage bl\n        left join UserAccount ua on ua.id = r.userOwner.id\n        left join Permission p on p.project = r and p.user.id = :userAccountId\n        left join Organization o on r.organizationOwner = o\n        left join OrganizationRole role on role.organization = o and role.user.id = :userAccountId\n        where (p is not null or role is not null)\n         and o.id = :organizationOwnerId and o is not null\n      and ((lower(r.name) like lower(concat(\'%\', cast(:search as text),\'%\'))\n      or lower(o.name) like lower(concat(\'%\', cast(:search as text),\'%\')))\n      or lower(ua.name) like lower(concat(\'%\', cast(:search as text),\'%\')) or cast(:search as text) is null)\n        ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.ProjectView> findAllPermittedInOrganization(long userAccountId, long organizationOwnerId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    java.lang.String search);
    
    public abstract long countAllBySlug(@org.jetbrains.annotations.NotNull()
    java.lang.String slug);
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"SpringDataRepositoryMethodReturnTypeInspection"})
    @org.springframework.data.jpa.repository.Query(value = "\n    select r.id as id, r.name as name, r.description as description,\n        r.slug as slug, r.avatarHash as avatarHash,\n        ua as userOwner, o.name as organizationOwnerName, o.slug as organizationOwnerSlug, \n        bl as baseLanguage,\n        o.basePermissions as organizationBasePermissions, role.type as organizationRole, p.type as directPermissions\n        from Project r\n        left join r.baseLanguage bl\n        left join UserAccount ua on ua.id = r.userOwner.id\n        left join Permission p on p.project = r and p.user.id = :userAccountId\n        left join Organization o on r.organizationOwner = o\n        left join OrganizationRole role on role.organization = o and role.user.id = :userAccountId\n        where (p is not null or role is not null)\n         and r.id = :projectId\n  ")
    public abstract io.tolgee.model.views.ProjectView findViewById(long userAccountId, long projectId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Project> findAllByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n      from Project p \n      left join fetch p.languages\n      where p.id in :ids\n    ")
    public abstract java.util.List<io.tolgee.model.Project> findAllWithLanguages(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> ids);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n      from Project p left join fetch p.languages left join fetch p.baseLanguage where p.id in :projectIds\n    ")
    public abstract java.util.List<io.tolgee.model.Project> getWithLanguages(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> projectIds);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Project> findAllByNameAndUserOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userOwner);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/tolgee/repository/ProjectRepository$Companion;", "", "()V", "BASE_VIEW_QUERY", "", "data"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_VIEW_QUERY = "select r.id as id, r.name as name, r.description as description,\n        r.slug as slug, r.avatarHash as avatarHash,\n        ua as userOwner, o.name as organizationOwnerName, o.slug as organizationOwnerSlug, \n        bl as baseLanguage,\n        o.basePermissions as organizationBasePermissions, role.type as organizationRole, p.type as directPermissions\n        from Project r\n        left join r.baseLanguage bl\n        left join UserAccount ua on ua.id = r.userOwner.id\n        left join Permission p on p.project = r and p.user.id = :userAccountId\n        left join Organization o on r.organizationOwner = o\n        left join OrganizationRole role on role.organization = o and role.user.id = :userAccountId\n        where (p is not null or role is not null)\n        ";
        
        private Companion() {
            super();
        }
    }
}