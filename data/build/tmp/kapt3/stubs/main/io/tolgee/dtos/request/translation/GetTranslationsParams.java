package io.tolgee.dtos.request.translation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/tolgee/dtos/request/translation/GetTranslationsParams;", "Lio/tolgee/dtos/request/translation/TranslationFilters;", "filterState", "", "", "cursor", "(Ljava/util/List;Ljava/lang/String;)V", "getCursor", "()Ljava/lang/String;", "data"})
public final class GetTranslationsParams extends io.tolgee.dtos.request.translation.TranslationFilters {
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.Parameter(description = "Cursor to get next data")
    private final java.lang.String cursor = null;
    
    public GetTranslationsParams() {
        super(null);
    }
    
    public GetTranslationsParams(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> filterState, @org.jetbrains.annotations.Nullable()
    java.lang.String cursor) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCursor() {
        return null;
    }
}