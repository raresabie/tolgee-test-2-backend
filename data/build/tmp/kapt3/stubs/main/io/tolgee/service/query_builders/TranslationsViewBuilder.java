package io.tolgee.service.query_builders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 U2\u00020\u0001:\u0001UBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0011J\b\u0010B\u001a\u00020CH\u0002J$\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\b2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020H0GH\u0002J\b\u0010I\u001a\u00020CH\u0002J\b\u0010J\u001a\u00020CH\u0002J,\u0010K\u001a\u00020C2\u0006\u0010E\u001a\u00020\b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000f0,2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001d0,H\u0002J\"\u0010N\u001a\b\u0012\u0004\u0012\u0002HO0\u0013\"\u0004\b\u0000\u0010O2\f\u00100\u001a\b\u0012\u0004\u0012\u0002HO0\u0013H\u0002J\n\u0010P\u001a\u0004\u0018\u00010=H\u0002J$\u0010Q\u001a\u00020=*\u00020\u00032\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000f0$2\b\u0010S\u001a\u0004\u0018\u00010\u000fH\u0002J$\u0010T\u001a\u00020=*\u00020\u00032\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000f0$2\b\u0010S\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00170\u00138BX\u0082\u0004\u00a2\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015R/\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0018\u00010\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0$0#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050,X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0,X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u00100\u001a\u0006\u0012\u0002\b\u00030\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u00103R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050$X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:09X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0$0#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010>\u001a\n ?*\u0004\u0018\u00010=0=*\b\u0012\u0004\u0012\u00020\u000f0$8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b>\u0010@R&\u0010A\u001a\n ?*\u0004\u0018\u00010=0=*\b\u0012\u0004\u0012\u00020\u000f0$8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bA\u0010@\u00a8\u0006V"}, d2 = {"Lio/tolgee/service/query_builders/TranslationsViewBuilder;", "", "cb", "Ljavax/persistence/criteria/CriteriaBuilder;", "projectId", "", "languages", "", "Lio/tolgee/model/Language;", "params", "Lio/tolgee/dtos/request/translation/TranslationFilters;", "sort", "Lorg/springframework/data/domain/Sort;", "cursor", "", "", "Lio/tolgee/dtos/response/CursorValue;", "(Ljavax/persistence/criteria/CriteriaBuilder;JLjava/util/Set;Lio/tolgee/dtos/request/translation/TranslationFilters;Lorg/springframework/data/domain/Sort;Ljava/util/Map;)V", "countQuery", "Ljavax/persistence/criteria/CriteriaQuery;", "getCountQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", "dataQuery", "", "getDataQuery$annotations", "()V", "getDataQuery", "filterByStateMap", "", "Lio/tolgee/model/enums/TranslationState;", "getFilterByStateMap", "()Ljava/util/Map;", "filterByStateMap$delegate", "Lkotlin/Lazy;", "fullTextFields", "", "Ljavax/persistence/criteria/Expression;", "groupByExpressions", "isKeyIdsQuery", "", "()Z", "setKeyIdsQuery", "(Z)V", "keyIdExpression", "Ljavax/persistence/criteria/Path;", "keyIdsQuery", "getKeyIdsQuery", "keyNameExpression", "query", "getQuery", "setQuery", "(Ljavax/persistence/criteria/CriteriaQuery;)V", "root", "Ljavax/persistence/criteria/Root;", "Lio/tolgee/model/key/Key;", "screenshotCountExpression", "selection", "Ljava/util/LinkedHashMap;", "Ljavax/persistence/criteria/Selection;", "translationsTextFields", "whereConditions", "Ljavax/persistence/criteria/Predicate;", "isNotNullOrBlank", "kotlin.jvm.PlatformType", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "isNullOrBlank", "addLeftJoinedColumns", "", "addNotFilteringTranslationFields", "language", "translation", "Ljavax/persistence/criteria/SetJoin;", "Lio/tolgee/model/translation/Translation;", "addScreenshotCounts", "applyGlobalFilters", "applyTranslationFilters", "translationTextField", "translationStateField", "getBaseQuery", "T", "getCursorPredicate", "greaterThanOrEqualToNullable", "expression", "value", "lessThanOrEqualToNullable", "Companion", "data"})
public final class TranslationsViewBuilder {
    private final javax.persistence.criteria.CriteriaBuilder cb = null;
    private final long projectId = 0L;
    private final java.util.Set<io.tolgee.model.Language> languages = null;
    private final io.tolgee.dtos.request.translation.TranslationFilters params = null;
    private final org.springframework.data.domain.Sort sort = null;
    private final java.util.Map<java.lang.String, io.tolgee.dtos.response.CursorValue> cursor = null;
    private java.util.LinkedHashMap<java.lang.String, javax.persistence.criteria.Selection<?>> selection;
    private java.util.Set<javax.persistence.criteria.Expression<java.lang.String>> fullTextFields;
    private java.util.Set<javax.persistence.criteria.Predicate> whereConditions;
    private javax.persistence.criteria.Path<java.lang.String> keyNameExpression;
    private javax.persistence.criteria.Path<java.lang.Long> keyIdExpression;
    private java.util.Set<javax.persistence.criteria.Expression<java.lang.String>> translationsTextFields;
    private javax.persistence.criteria.Root<io.tolgee.model.key.Key> root;
    private javax.persistence.criteria.Expression<java.lang.Long> screenshotCountExpression;
    private final java.util.Set<javax.persistence.criteria.Expression<?>> groupByExpressions = null;
    public javax.persistence.criteria.CriteriaQuery<?> query;
    private boolean isKeyIdsQuery = false;
    private final kotlin.Lazy filterByStateMap$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.tolgee.service.query_builders.TranslationsViewBuilder.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_NAME_FIELD = null;
    
    public TranslationsViewBuilder(@org.jetbrains.annotations.NotNull()
    javax.persistence.criteria.CriteriaBuilder cb, long projectId, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.Language> languages, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.translation.TranslationFilters params, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Sort sort, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, io.tolgee.dtos.response.CursorValue> cursor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.persistence.criteria.CriteriaQuery<?> getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    javax.persistence.criteria.CriteriaQuery<?> p0) {
    }
    
    public final boolean isKeyIdsQuery() {
        return false;
    }
    
    public final void setKeyIdsQuery(boolean p0) {
    }
    
    private final <T extends java.lang.Object>javax.persistence.criteria.CriteriaQuery<T> getBaseQuery(javax.persistence.criteria.CriteriaQuery<T> query) {
        return null;
    }
    
    /**
     * This function body is inspired by this thread
     * https://stackoverflow.com/questions/38017054/mysql-cursor-based-pagination-with-multiple-columns
     */
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "TYPE_MISMATCH_WARNING"})
    private final javax.persistence.criteria.Predicate getCursorPredicate() {
        return null;
    }
    
    @kotlin.Suppress(names = {"TYPE_MISMATCH_WARNING"})
    private final javax.persistence.criteria.Predicate greaterThanOrEqualToNullable(javax.persistence.criteria.CriteriaBuilder $this$greaterThanOrEqualToNullable, javax.persistence.criteria.Expression<java.lang.String> expression, java.lang.String value) {
        return null;
    }
    
    @kotlin.Suppress(names = {"TYPE_MISMATCH_WARNING"})
    private final javax.persistence.criteria.Predicate lessThanOrEqualToNullable(javax.persistence.criteria.CriteriaBuilder $this$lessThanOrEqualToNullable, javax.persistence.criteria.Expression<java.lang.String> expression, java.lang.String value) {
        return null;
    }
    
    private final void addScreenshotCounts() {
    }
    
    private final void addLeftJoinedColumns() {
    }
    
    private final void addNotFilteringTranslationFields(io.tolgee.model.Language language, javax.persistence.criteria.SetJoin<io.tolgee.model.key.Key, io.tolgee.model.translation.Translation> translation) {
    }
    
    private final void applyTranslationFilters(io.tolgee.model.Language language, javax.persistence.criteria.Path<java.lang.String> translationTextField, javax.persistence.criteria.Path<io.tolgee.model.enums.TranslationState> translationStateField) {
    }
    
    private final void applyGlobalFilters() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    private static void getDataQuery$annotations() {
    }
    
    private final javax.persistence.criteria.CriteriaQuery<java.lang.Object[]> getDataQuery() {
        return null;
    }
    
    private final javax.persistence.criteria.Predicate isNotNullOrBlank(javax.persistence.criteria.Expression<java.lang.String> $this$isNotNullOrBlank) {
        return null;
    }
    
    private final javax.persistence.criteria.Predicate isNullOrBlank(javax.persistence.criteria.Expression<java.lang.String> $this$isNullOrBlank) {
        return null;
    }
    
    private final javax.persistence.criteria.CriteriaQuery<java.lang.Long> getCountQuery() {
        return null;
    }
    
    private final javax.persistence.criteria.CriteriaQuery<java.lang.Long> getKeyIdsQuery() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.util.List<io.tolgee.model.enums.TranslationState>> getFilterByStateMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.springframework.data.domain.Page<io.tolgee.model.views.KeyWithTranslationsView> getData(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, long projectId, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends io.tolgee.model.Language> languages, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.translation.TranslationFilters params, @org.jetbrains.annotations.Nullable()
    java.lang.String cursor) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JJ\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007J4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lio/tolgee/service/query_builders/TranslationsViewBuilder$Companion;", "", "()V", "KEY_NAME_FIELD", "", "getKEY_NAME_FIELD", "()Ljava/lang/String;", "getData", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/KeyWithTranslationsView;", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "projectId", "", "languages", "", "Lio/tolgee/model/Language;", "pageable", "Lorg/springframework/data/domain/Pageable;", "params", "Lio/tolgee/dtos/request/translation/TranslationFilters;", "cursor", "getSelectAllKeys", "", "data"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKEY_NAME_FIELD() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.springframework.data.domain.Page<io.tolgee.model.views.KeyWithTranslationsView> getData(@org.jetbrains.annotations.NotNull()
        org.springframework.context.ApplicationContext applicationContext, long projectId, @org.jetbrains.annotations.NotNull()
        java.util.Set<? extends io.tolgee.model.Language> languages, @org.jetbrains.annotations.NotNull()
        org.springframework.data.domain.Pageable pageable, @org.jetbrains.annotations.NotNull()
        io.tolgee.dtos.request.translation.TranslationFilters params, @org.jetbrains.annotations.Nullable()
        java.lang.String cursor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getSelectAllKeys(@org.jetbrains.annotations.NotNull()
        org.springframework.context.ApplicationContext applicationContext, long projectId, @org.jetbrains.annotations.NotNull()
        java.util.Set<? extends io.tolgee.model.Language> languages, @org.jetbrains.annotations.NotNull()
        io.tolgee.dtos.request.translation.TranslationFilters params) {
            return null;
        }
    }
}