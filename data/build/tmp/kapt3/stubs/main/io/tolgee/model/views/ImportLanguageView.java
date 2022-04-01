package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0012\u0010\u0015\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0012\u0010\u0017\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0012\u0010\u0019\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0012\u0010\u001b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0005R\u0012\u0010\u001d\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005\u00a8\u0006\u001f"}, d2 = {"Lio/tolgee/model/views/ImportLanguageView;", "", "conflictCount", "", "getConflictCount", "()I", "existingLanguageId", "", "getExistingLanguageId", "()Ljava/lang/Long;", "existingLanguageName", "", "getExistingLanguageName", "()Ljava/lang/String;", "existingLanguageTag", "getExistingLanguageTag", "id", "getId", "()J", "importFileId", "getImportFileId", "importFileIssueCount", "getImportFileIssueCount", "importFileName", "getImportFileName", "name", "getName", "resolvedCount", "getResolvedCount", "totalCount", "getTotalCount", "data"})
public abstract interface ImportLanguageView {
    
    public abstract long getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getExistingLanguageId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getExistingLanguageTag();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getExistingLanguageName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getImportFileName();
    
    public abstract long getImportFileId();
    
    public abstract int getImportFileIssueCount();
    
    public abstract int getTotalCount();
    
    public abstract int getConflictCount();
    
    public abstract int getResolvedCount();
}