package io.tolgee.dtos.query_results;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u00067"}, d2 = {"Lio/tolgee/dtos/query_results/TranslationHistoryView;", "", "()V", "authorAvatarHash", "", "getAuthorAvatarHash", "()Ljava/lang/String;", "setAuthorAvatarHash", "(Ljava/lang/String;)V", "authorEmail", "getAuthorEmail", "setAuthorEmail", "authorId", "", "getAuthorId", "()Ljava/lang/Long;", "setAuthorId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "authorName", "getAuthorName", "setAuthorName", "auto", "", "getAuto", "()Ljava/lang/Boolean;", "setAuto", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mtProvider", "Lio/tolgee/constants/MtServiceType;", "getMtProvider", "()Lio/tolgee/constants/MtServiceType;", "setMtProvider", "(Lio/tolgee/constants/MtServiceType;)V", "revisionType", "Lorg/hibernate/envers/RevisionType;", "getRevisionType", "()Lorg/hibernate/envers/RevisionType;", "setRevisionType", "(Lorg/hibernate/envers/RevisionType;)V", "state", "Lio/tolgee/model/enums/TranslationState;", "getState", "()Lio/tolgee/model/enums/TranslationState;", "setState", "(Lio/tolgee/model/enums/TranslationState;)V", "text", "getText", "setText", "timestamp", "getTimestamp", "()J", "setTimestamp", "(J)V", "data"})
public final class TranslationHistoryView {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String text;
    @org.jetbrains.annotations.Nullable()
    private io.tolgee.model.enums.TranslationState state;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean auto;
    @org.jetbrains.annotations.Nullable()
    private io.tolgee.constants.MtServiceType mtProvider;
    private long timestamp = 0L;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String authorName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String authorAvatarHash;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String authorEmail;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long authorId;
    @org.jetbrains.annotations.NotNull()
    private org.hibernate.envers.RevisionType revisionType = org.hibernate.envers.RevisionType.ADD;
    
    public TranslationHistoryView() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.model.enums.TranslationState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.Nullable()
    io.tolgee.model.enums.TranslationState p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAuto() {
        return null;
    }
    
    public final void setAuto(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.constants.MtServiceType getMtProvider() {
        return null;
    }
    
    public final void setMtProvider(@org.jetbrains.annotations.Nullable()
    io.tolgee.constants.MtServiceType p0) {
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final void setTimestamp(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthorName() {
        return null;
    }
    
    public final void setAuthorName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthorAvatarHash() {
        return null;
    }
    
    public final void setAuthorAvatarHash(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAuthorEmail() {
        return null;
    }
    
    public final void setAuthorEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAuthorId() {
        return null;
    }
    
    public final void setAuthorId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hibernate.envers.RevisionType getRevisionType() {
        return null;
    }
    
    public final void setRevisionType(@org.jetbrains.annotations.NotNull()
    org.hibernate.envers.RevisionType p0) {
    }
}