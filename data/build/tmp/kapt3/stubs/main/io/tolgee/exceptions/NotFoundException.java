package io.tolgee.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/exceptions/NotFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "msg", "Lio/tolgee/constants/Message;", "(Lio/tolgee/constants/Message;)V", "getMsg", "()Lio/tolgee/constants/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data"})
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
public final class NotFoundException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.Nullable()
    private final io.tolgee.constants.Message msg = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.exceptions.NotFoundException copy(@org.jetbrains.annotations.Nullable()
    io.tolgee.constants.Message msg) {
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
    
    public NotFoundException() {
        super();
    }
    
    public NotFoundException(@org.jetbrains.annotations.Nullable()
    io.tolgee.constants.Message msg) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.constants.Message component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.tolgee.constants.Message getMsg() {
        return null;
    }
}