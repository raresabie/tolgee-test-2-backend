package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u0018"}, d2 = {"Lio/tolgee/repository/InvitationRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/Invitation;", "", "countByUserOrInvitationWithEmailAndOrganization", "", "email", "", "organization", "Lio/tolgee/model/Organization;", "countByUserOrInvitationWithEmailAndProject", "project", "Lio/tolgee/model/Project;", "deleteAllByCreatedAtLessThan", "", "date", "Ljava/util/Date;", "findAllByPermissionProjectOrderByCreatedAt", "Ljava/util/LinkedHashSet;", "findOneByCode", "Ljava/util/Optional;", "code", "getAllByOrganizationRoleOrganizationOrderByCreatedAt", "", "data"})
@org.springframework.stereotype.Repository()
public abstract interface InvitationRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.Invitation, java.lang.Long> {
    
    public abstract void deleteAllByCreatedAtLessThan(@org.jetbrains.annotations.NotNull()
    java.util.Date date);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.Invitation> findOneByCode(@org.jetbrains.annotations.Nullable()
    java.lang.String code);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.LinkedHashSet<io.tolgee.model.Invitation> findAllByPermissionProjectOrderByCreatedAt(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.Invitation> getAllByOrganizationRoleOrganizationOrderByCreatedAt(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization);
    
    @org.springframework.data.jpa.repository.Query(value = "\n    select count(p) from Permission p\n    left join p.invitation i\n    left join p.user u\n    where \n        (i.email = :email or u.username = :email) and\n        p.project = :project\n  ")
    public abstract int countByUserOrInvitationWithEmailAndProject(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project);
    
    @org.springframework.data.jpa.repository.Query(value = "\n    select count(orl.id) from OrganizationRole orl\n    left join orl.invitation i\n    left join orl.user u\n    where \n        (i.email = :email or u.username = :email) and\n        orl.organization = :organization\n  ")
    public abstract int countByUserOrInvitationWithEmailAndOrganization(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Organization organization);
}