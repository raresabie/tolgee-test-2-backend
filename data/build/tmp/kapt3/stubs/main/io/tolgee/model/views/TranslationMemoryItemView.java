package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lio/tolgee/model/views/TranslationMemoryItemView;", "", "baseTranslationText", "", "getBaseTranslationText", "()Ljava/lang/String;", "keyName", "getKeyName", "similarity", "", "getSimilarity", "()F", "targetTranslationText", "getTargetTranslationText", "data"})
public abstract interface TranslationMemoryItemView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBaseTranslationText();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTargetTranslationText();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getKeyName();
    
    public abstract float getSimilarity();
}