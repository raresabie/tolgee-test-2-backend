package io.tolgee.security.rateLimis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lio/tolgee/security/rateLimis/UsageEntry;", "", "time", "Ljava/util/Date;", "availableTokens", "", "(Ljava/util/Date;I)V", "getAvailableTokens", "()I", "setAvailableTokens", "(I)V", "getTime", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "serialize", "", "toString", "Companion", "data"})
public final class UsageEntry {
    @org.jetbrains.annotations.NotNull()
    private java.util.Date time;
    private int availableTokens;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.security.rateLimis.UsageEntry.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.security.rateLimis.UsageEntry copy(@org.jetbrains.annotations.NotNull()
    java.util.Date time, int availableTokens) {
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
    
    public UsageEntry(@org.jetbrains.annotations.NotNull()
    java.util.Date time, int availableTokens) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAvailableTokens() {
        return 0;
    }
    
    public final void setAvailableTokens(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String serialize() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/tolgee/security/rateLimis/UsageEntry$Companion;", "", "()V", "deserialize", "Lio/tolgee/security/rateLimis/UsageEntry;", "str", "", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.tolgee.security.rateLimis.UsageEntry deserialize(@org.jetbrains.annotations.NotNull()
        java.lang.String str) {
            return null;
        }
    }
}