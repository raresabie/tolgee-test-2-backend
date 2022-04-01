package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/tolgee/configuration/tolgee/ImportProperties;", "", "()V", "createImplicitApiKey", "", "getCreateImplicitApiKey", "()Z", "setCreateImplicitApiKey", "(Z)V", "dir", "", "getDir", "()Ljava/lang/String;", "setDir", "(Ljava/lang/String;)V", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.import")
public final class ImportProperties {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dir;
    private boolean createImplicitApiKey = false;
    
    public ImportProperties() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDir() {
        return null;
    }
    
    public final void setDir(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getCreateImplicitApiKey() {
        return false;
    }
    
    public final void setCreateImplicitApiKey(boolean p0) {
    }
}