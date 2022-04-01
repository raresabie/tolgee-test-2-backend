package io.tolgee.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/service/StartupImportService;", "", "importService", "Lio/tolgee/service/dataImport/ImportService;", "projectService", "Lio/tolgee/service/ProjectService;", "userAccountService", "Lio/tolgee/service/UserAccountService;", "properties", "Lio/tolgee/configuration/tolgee/TolgeeProperties;", "apiKeyService", "Lio/tolgee/service/ApiKeyService;", "(Lio/tolgee/service/dataImport/ImportService;Lio/tolgee/service/ProjectService;Lio/tolgee/service/UserAccountService;Lio/tolgee/configuration/tolgee/TolgeeProperties;Lio/tolgee/service/ApiKeyService;)V", "importFiles", "", "data"})
@org.springframework.stereotype.Service()
public class StartupImportService {
    private final io.tolgee.service.dataImport.ImportService importService = null;
    private final io.tolgee.service.ProjectService projectService = null;
    private final io.tolgee.service.UserAccountService userAccountService = null;
    private final io.tolgee.configuration.tolgee.TolgeeProperties properties = null;
    private final io.tolgee.service.ApiKeyService apiKeyService = null;
    
    public StartupImportService(@org.jetbrains.annotations.NotNull()
    io.tolgee.service.dataImport.ImportService importService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ProjectService projectService, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.UserAccountService userAccountService, @org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.TolgeeProperties properties, @org.jetbrains.annotations.NotNull()
    io.tolgee.service.ApiKeyService apiKeyService) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional()
    public void importFiles() {
    }
}