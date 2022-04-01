package io.tolgee.dialects.postgres;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lio/tolgee/dialects/postgres/CustomPostgreSQLDialect;", "Lorg/hibernate/dialect/PostgreSQL10Dialect;", "()V", "renderOrderByElement", "", "expression", "collation", "order", "nulls", "Lorg/hibernate/NullPrecedence;", "data"})
public final class CustomPostgreSQLDialect extends org.hibernate.dialect.PostgreSQL10Dialect {
    
    public CustomPostgreSQLDialect() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String renderOrderByElement(@org.jetbrains.annotations.Nullable()
    java.lang.String expression, @org.jetbrains.annotations.Nullable()
    java.lang.String collation, @org.jetbrains.annotations.Nullable()
    java.lang.String order, @org.jetbrains.annotations.Nullable()
    org.hibernate.NullPrecedence nulls) {
        return null;
    }
}