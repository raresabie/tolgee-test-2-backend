package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lio/tolgee/model/views/ImportFileIssueParamView;", "", "type", "Lio/tolgee/model/dataImport/issues/paramTypes/FileIssueParamType;", "getType", "()Lio/tolgee/model/dataImport/issues/paramTypes/FileIssueParamType;", "value", "", "getValue", "()Ljava/lang/String;", "data"})
public abstract interface ImportFileIssueParamView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.model.dataImport.issues.paramTypes.FileIssueParamType getType();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getValue();
}