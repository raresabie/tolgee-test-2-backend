package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006("}, d2 = {"Lio/tolgee/model/views/TranslationView;", "", "id", "", "text", "", "state", "Lio/tolgee/model/enums/TranslationState;", "auto", "", "mtProvider", "Lio/tolgee/constants/MtServiceType;", "commentCount", "unresolvedCommentCount", "(JLjava/lang/String;Lio/tolgee/model/enums/TranslationState;ZLio/tolgee/constants/MtServiceType;JJ)V", "getAuto", "()Z", "getCommentCount", "()J", "getId", "getMtProvider", "()Lio/tolgee/constants/MtServiceType;", "getState", "()Lio/tolgee/model/enums/TranslationState;", "getText", "()Ljava/lang/String;", "getUnresolvedCommentCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "data"})
public final class TranslationView {
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String text = null;
    @org.jetbrains.annotations.NotNull()
    private final io.tolgee.model.enums.TranslationState state = null;
    private final boolean auto = false;
    @org.jetbrains.annotations.Nullable()
    private final io.tolgee.constants.MtServiceType mtProvider = null;
    private final long commentCount = 0L;
    private final long unresolvedCommentCount = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.views.TranslationView copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationState state, boolean auto, @org.jetbrains.annotations.Nullable()
    io.tolgee.constants.MtServiceType mtProvider, long commentCount, long unresolvedCommentCount) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public TranslationView(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.enums.TranslationState state, boolean auto, @org.jetbrains.annotations.Nullable()
    io.tolgee.constants.MtServiceType mtProvider, long commentCount, long unresolvedCommentCount) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.enums.TranslationState component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.model.enums.TranslationState getState() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getAuto() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.constants.MtServiceType component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.constants.MtServiceType getMtProvider() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getCommentCount() {
        return 0L;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getUnresolvedCommentCount() {
        return 0L;
    }
}