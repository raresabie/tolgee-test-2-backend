package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/repository/OrganizationRoleRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/OrganizationRole;", "", "countAllByOrganizationIdAndTypeAndUserIdNot", "id", "owner", "Lio/tolgee/model/enums/OrganizationRoleType;", "userId", "deleteByOrganization", "", "organization", "Lio/tolgee/model/Organization;", "findOneByUserIdAndOrganizationId", "organizationId", "data"})
@org.springframework.stereotype.Repository()
public abstract interface OrganizationRoleRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.OrganizationRole, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.OrganizationRole findOneByUserIdAndOrganizationId(long userId, long organizationId);
    
    public abstract long countAllByOrganizationIdAndTypeAndUserIdNot(long id, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.OrganizationRoleType owner, long userId);
    
    public abstract void deleteByOrganization(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization);
}