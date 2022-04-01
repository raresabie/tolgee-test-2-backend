package io.tolgee.model.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/model/views/ImportFileIssueView;", "", "id", "", "getId", "()J", "params", "", "Lio/tolgee/model/views/ImportFileIssueParamView;", "getParams", "()Ljava/util/List;", "type", "Lio/tolgee/model/dataImport/issues/issueTypes/FileIssueType;", "getType", "()Lio/tolgee/model/dataImport/issues/issueTypes/FileIssueType;", "data"})
public abstract interface ImportFileIssueView {
    
    public abstract long getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.tolgee.model.dataImport.issues.issueTypes.FileIssueType getType();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.tolgee.model.views.ImportFileIssueParamView> getParams();
}