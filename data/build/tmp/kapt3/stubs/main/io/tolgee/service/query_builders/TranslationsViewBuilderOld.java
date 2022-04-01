package io.tolgee.service.query_builders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0002%&B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\"\u001a\b\u0012\u0004\u0012\u0002H#0\r\"\u0004\b\u0000\u0010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lio/tolgee/service/query_builders/TranslationsViewBuilderOld;", "", "cb", "Ljavax/persistence/criteria/CriteriaBuilder;", "project", "Lio/tolgee/model/Project;", "languages", "", "Lio/tolgee/model/Language;", "searchString", "", "(Ljavax/persistence/criteria/CriteriaBuilder;Lio/tolgee/model/Project;Ljava/util/Set;Ljava/lang/String;)V", "countQuery", "Ljavax/persistence/criteria/CriteriaQuery;", "", "getCountQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", "dataQuery", "getDataQuery", "fullTextFields", "", "Ljavax/persistence/criteria/Expression;", "getFullTextFields", "()Ljava/util/Set;", "setFullTextFields", "(Ljava/util/Set;)V", "restrictions", "Ljavax/persistence/criteria/Predicate;", "getRestrictions", "setRestrictions", "selection", "Ljavax/persistence/criteria/Selection;", "getSelection", "setSelection", "getBaseQuery", "T", "query1", "Companion", "Result", "data"})
public final class TranslationsViewBuilderOld {
    private final javax.persistence.criteria.CriteriaBuilder cb = null;
    private final io.tolgee.model.Project project = null;
    private final java.util.Set<io.tolgee.model.Language> languages = null;
    private final java.lang.String searchString = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<javax.persistence.criteria.Selection<?>> selection;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<javax.persistence.criteria.Expression<java.lang.String>> fullTextFields;
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<javax.persistence.criteria.Predicate> restrictions;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.query_builders.TranslationsViewBuilderOld.Companion Companion = null;
    
    public TranslationsViewBuilderOld(@org.jetbrains.annotations.NotNull()
    javax.persistence.criteria.CriteriaBuilder cb, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.Language> languages, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<javax.persistence.criteria.Selection<?>> getSelection() {
        return null;
    }
    
    public final void setSelection(@org.jetbrains.annotations.NotNull()
    java.util.Set<javax.persistence.criteria.Selection<?>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<javax.persistence.criteria.Expression<java.lang.String>> getFullTextFields() {
        return null;
    }
    
    public final void setFullTextFields(@org.jetbrains.annotations.NotNull()
    java.util.Set<javax.persistence.criteria.Expression<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<javax.persistence.criteria.Predicate> getRestrictions() {
        return null;
    }
    
    public final void setRestrictions(@org.jetbrains.annotations.NotNull()
    java.util.Set<javax.persistence.criteria.Predicate> p0) {
    }
    
    private final <T extends java.lang.Object>javax.persistence.criteria.CriteriaQuery<T> getBaseQuery(javax.persistence.criteria.CriteriaQuery<T> query1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.persistence.criteria.CriteriaQuery<java.lang.Object> getDataQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.persistence.criteria.CriteriaQuery<java.lang.Long> getCountQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.tolgee.service.query_builders.TranslationsViewBuilderOld.Result getData(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager em, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.Language> languages, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString, int limit, int offset) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0004"}, d2 = {"Lio/tolgee/service/query_builders/TranslationsViewBuilderOld$Result;", "", "count", "", "data", "", "(JLjava/util/List;)V", "getCount", "()J", "setCount", "(J)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", ""})
    public static final class Result {
        private long count;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<? extends java.lang.Object> data;
        
        @org.jetbrains.annotations.NotNull()
        public final io.tolgee.service.query_builders.TranslationsViewBuilderOld.Result copy(long count, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> data) {
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
        
        public Result(long count, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> data) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getCount() {
            return 0L;
        }
        
        public final void setCount(long p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Object> getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u00a8\u0006\u0011"}, d2 = {"Lio/tolgee/service/query_builders/TranslationsViewBuilderOld$Companion;", "", "()V", "getData", "Lio/tolgee/service/query_builders/TranslationsViewBuilderOld$Result;", "em", "Ljavax/persistence/EntityManager;", "project", "Lio/tolgee/model/Project;", "languages", "", "Lio/tolgee/model/Language;", "searchString", "", "limit", "", "offset", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final io.tolgee.service.query_builders.TranslationsViewBuilderOld.Result getData(@org.jetbrains.annotations.NotNull()
        javax.persistence.EntityManager em, @org.jetbrains.annotations.Nullable()
        io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
        java.util.Set<? extends io.tolgee.model.Language> languages, @org.jetbrains.annotations.Nullable()
        java.lang.String searchString, int limit, int offset) {
            return null;
        }
    }
}