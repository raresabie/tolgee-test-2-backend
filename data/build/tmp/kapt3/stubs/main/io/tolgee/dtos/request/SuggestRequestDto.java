package io.tolgee.dtos.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lio/tolgee/dtos/request/SuggestRequestDto;", "", "keyId", "", "targetLanguageId", "baseText", "", "(JJLjava/lang/String;)V", "getBaseText", "()Ljava/lang/String;", "setBaseText", "(Ljava/lang/String;)V", "getKeyId", "()J", "setKeyId", "(J)V", "getTargetLanguageId", "setTargetLanguageId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data"})
public final class SuggestRequestDto {
    private long keyId;
    private long targetLanguageId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String baseText;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.dtos.request.SuggestRequestDto copy(@io.swagger.v3.oas.annotations.media.Schema(description = "Key Id to get results for. Use when key is stored already.")
    long keyId, long targetLanguageId, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Text value of base translation. Useful, when base translation is not stored yet.")
    java.lang.String baseText) {
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
    
    public SuggestRequestDto() {
        super();
    }
    
    public SuggestRequestDto(@io.swagger.v3.oas.annotations.media.Schema(description = "Key Id to get results for. Use when key is stored already.")
    long keyId, long targetLanguageId, @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Text value of base translation. Useful, when base translation is not stored yet.")
    java.lang.String baseText) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getKeyId() {
        return 0L;
    }
    
    public final void setKeyId(long p0) {
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getTargetLanguageId() {
        return 0L;
    }
    
    public final void setTargetLanguageId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBaseText() {
        return null;
    }
    
    public final void setBaseText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}