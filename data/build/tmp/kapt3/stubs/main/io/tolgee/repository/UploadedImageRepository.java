package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lio/tolgee/repository/UploadedImageRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/UploadedImage;", "", "countAllByUserAccount", "userAccount", "Lio/tolgee/model/UserAccount;", "findAllByIdIn", "", "filenames", "", "findAllOlder", "date", "Ljava/util/Date;", "data"})
@org.springframework.stereotype.Repository()
public abstract interface UploadedImageRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.UploadedImage, java.lang.Long> {
    
    public abstract long countAllByUserAccount(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.UserAccount userAccount);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.EntityGraph(attributePaths = {"userAccount"})
    public abstract java.util.List<io.tolgee.model.UploadedImage> findAllByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> filenames);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "from UploadedImage where createdAt < :date")
    public abstract java.util.List<io.tolgee.model.UploadedImage> findAllOlder(@org.jetbrains.annotations.NotNull()
    java.util.Date date);
}