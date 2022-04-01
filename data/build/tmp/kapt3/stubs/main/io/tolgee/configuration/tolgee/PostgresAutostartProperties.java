package io.tolgee.configuration.tolgee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b\u00a8\u0006\""}, d2 = {"Lio/tolgee/configuration/tolgee/PostgresAutostartProperties;", "", "()V", "containerName", "", "getContainerName", "()Ljava/lang/String;", "setContainerName", "(Ljava/lang/String;)V", "databaseName", "getDatabaseName", "setDatabaseName", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "mode", "Lio/tolgee/configuration/tolgee/PostgresAutostartProperties$PostgresAutostartMode;", "getMode", "()Lio/tolgee/configuration/tolgee/PostgresAutostartProperties$PostgresAutostartMode;", "setMode", "(Lio/tolgee/configuration/tolgee/PostgresAutostartProperties$PostgresAutostartMode;)V", "password", "getPassword", "setPassword", "port", "getPort", "setPort", "user", "getUser", "setUser", "PostgresAutostartMode", "data"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "tolgee.postgres-autostart")
public final class PostgresAutostartProperties {
    private boolean enabled = true;
    @org.jetbrains.annotations.NotNull()
    private io.tolgee.configuration.tolgee.PostgresAutostartProperties.PostgresAutostartMode mode = io.tolgee.configuration.tolgee.PostgresAutostartProperties.PostgresAutostartMode.DOCKER;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user = "postgres";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password = "postgres";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String databaseName = "postgres";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String port = "25432";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String containerName = "tolgee_postgres";
    
    public PostgresAutostartProperties() {
        super();
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.tolgee.configuration.tolgee.PostgresAutostartProperties.PostgresAutostartMode getMode() {
        return null;
    }
    
    public final void setMode(@org.jetbrains.annotations.NotNull()
    io.tolgee.configuration.tolgee.PostgresAutostartProperties.PostgresAutostartMode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDatabaseName() {
        return null;
    }
    
    public final void setDatabaseName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPort() {
        return null;
    }
    
    public final void setPort(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContainerName() {
        return null;
    }
    
    public final void setContainerName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/tolgee/configuration/tolgee/PostgresAutostartProperties$PostgresAutostartMode;", "", "(Ljava/lang/String;I)V", "DOCKER", "EMBEDDED", "data"})
    public static enum PostgresAutostartMode {
        /*public static final*/ DOCKER /* = new DOCKER() */,
        /*public static final*/ EMBEDDED /* = new EMBEDDED() */;
        
        PostgresAutostartMode() {
        }
    }
}