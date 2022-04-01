package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&JI\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\'\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0016"}, d2 = {"Lio/tolgee/repository/OrganizationRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/Organization;", "", "countAllBySlug", "slug", "", "findAllByName", "", "name", "findAllPermitted", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/OrganizationView;", "userId", "pageable", "Lorg/springframework/data/domain/Pageable;", "roleType", "Lio/tolgee/model/enums/OrganizationRoleType;", "search", "exceptOrganizationId", "(Ljava/lang/Long;Lorg/springframework/data/domain/Pageable;Lio/tolgee/model/enums/OrganizationRoleType;Ljava/lang/String;Ljava/lang/Long;)Lorg/springframework/data/domain/Page;", "getOneBySlug", "data"})
@org.springframework.stereotype.Repository()
public abstract interface OrganizationRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.Organization, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.Organization getOneBySlug(@org.jetbrains.annotations.NotNull()
    java.lang.String slug);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select o.id as id, o.name as name, o.description as description, o.slug as slug,\n        o.basePermissions as basePermissions, r.type as currentUserRole, o.avatarHash as avatarHash\n        from Organization o \n        join OrganizationRole r on r.user.id = :userId \n        and r.organization = o and (r.type = :roleType or :roleType is null)\n        and (:search is null or (lower(o.name) like lower(concat(\'%\', cast(:search as text), \'%\'))))\n        and (:exceptOrganizationId is null or (o.id <> :exceptOrganizationId))\n        ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.OrganizationView> findAllPermitted(@org.jetbrains.annotations.Nullable()
    java.lang.Long userId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.enums.OrganizationRoleType roleType, @org.jetbrains.annotations.Nullable()
    java.lang.String search, @org.jetbrains.annotations.Nullable()
    java.lang.Long exceptOrganizationId);
    
    public abstract long countAllBySlug(@org.jetbrains.annotations.NotNull()
    java.lang.String slug);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Organization> findAllByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}