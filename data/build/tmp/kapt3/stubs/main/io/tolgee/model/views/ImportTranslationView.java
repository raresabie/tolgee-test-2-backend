package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\tR\u0012\u0010\u0011\u001a\u00020\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lio/tolgee/model/views/ImportTranslationView;", "", "conflictId", "", "getConflictId", "()Ljava/lang/Long;", "conflictText", "", "getConflictText", "()Ljava/lang/String;", "id", "getId", "()J", "keyId", "getKeyId", "keyName", "getKeyName", "override", "", "getOverride", "()Z", "resolvedHash", "getResolvedHash", "text", "getText", "data"})
public abstract interface ImportTranslationView {
    
    public abstract long getId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getText();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getKeyName();
    
    public abstract long getKeyId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getConflictId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getConflictText();
    
    public abstract boolean getOverride();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getResolvedHash();
}