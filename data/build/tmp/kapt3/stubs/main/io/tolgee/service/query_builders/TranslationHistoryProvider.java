package io.tolgee.service.query_builders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0002JR\u0010\u001f\u001a\u00020\r\"\u0004\b\u0000\u0010 *\u00020\r2\u0006\u0010!\u001a\u00020\"26\u0010#\u001a2\u0012\u0013\u0012\u0011H \u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0013\u0012\u00110\u001b\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b((\u0012\u0004\u0012\u00020)0$H\u0002J\n\u0010*\u001a\u00020)*\u00020\rJ\u0012\u0010+\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u001b0\u001dH\u0002R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lio/tolgee/service/query_builders/TranslationHistoryProvider;", "", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "translationId", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "(Lorg/springframework/context/ApplicationContext;JLorg/springframework/data/domain/Pageable;)V", "auditReader", "Lorg/hibernate/envers/AuditReader;", "kotlin.jvm.PlatformType", "baseQuery", "Lorg/hibernate/envers/query/AuditQuery;", "getBaseQuery", "()Lorg/hibernate/envers/query/AuditQuery;", "entityManager", "Ljavax/persistence/EntityManager;", "projections", "", "Lio/tolgee/service/query_builders/TranslationHistoryProvider$Projection;", "userAccountService", "Lio/tolgee/service/UserAccountService;", "getCount", "getDataQuery", "getHistory", "Lorg/springframework/data/domain/PageImpl;", "Lio/tolgee/dtos/query_results/TranslationHistoryView;", "parseData", "", "rawData", "addProjection", "T", "auditProjection", "Lorg/hibernate/envers/query/projection/AuditProjection;", "assigner", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "item", "", "addTranslateIdRestriction", "addUserData", "Projection", "data"})
public class TranslationHistoryProvider {
    private final long translationId = 0L;
    private final org.springframework.data.domain.Pageable pageable = null;
    private final javax.persistence.EntityManager entityManager = null;
    private final org.hibernate.envers.AuditReader auditReader = null;
    private final java.util.List<io.tolgee.service.query_builders.TranslationHistoryProvider.Projection<?>> projections = null;
    private final io.tolgee.service.UserAccountService userAccountService = null;
    
    public TranslationHistoryProvider(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext, long translationId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        super();
    }
    
    private final org.hibernate.envers.query.AuditQuery getBaseQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.data.domain.PageImpl<io.tolgee.dtos.query_results.TranslationHistoryView> getHistory() {
        return null;
    }
    
    private final void addUserData(java.util.List<io.tolgee.dtos.query_results.TranslationHistoryView> $this$addUserData) {
    }
    
    private final java.util.List<io.tolgee.dtos.query_results.TranslationHistoryView> parseData(java.util.List<java.lang.Object> rawData) {
        return null;
    }
    
    private final org.hibernate.envers.query.AuditQuery getDataQuery() {
        return null;
    }
    
    public final void addTranslateIdRestriction(@org.jetbrains.annotations.NotNull()
    org.hibernate.envers.query.AuditQuery $this$addTranslateIdRestriction) {
    }
    
    private final <T extends java.lang.Object>org.hibernate.envers.query.AuditQuery addProjection(org.hibernate.envers.query.AuditQuery $this$addProjection, org.hibernate.envers.query.projection.AuditProjection auditProjection, kotlin.jvm.functions.Function2<? super T, ? super io.tolgee.dtos.query_results.TranslationHistoryView, kotlin.Unit> assigner) {
        return null;
    }
    
    private final long getCount() {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00126\u0010\u0005\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\u0002\u0010\rRA\u0010\u0005\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lio/tolgee/service/query_builders/TranslationHistoryProvider$Projection;", "T", "", "auditProjection", "Lorg/hibernate/envers/query/projection/AuditProjection;", "assigner", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lio/tolgee/dtos/query_results/TranslationHistoryView;", "item", "", "(Lorg/hibernate/envers/query/projection/AuditProjection;Lkotlin/jvm/functions/Function2;)V", "getAssigner", "()Lkotlin/jvm/functions/Function2;", "getAuditProjection", "()Lorg/hibernate/envers/query/projection/AuditProjection;", "data"})
    public static final class Projection<T extends java.lang.Object> {
        @org.jetbrains.annotations.NotNull()
        private final org.hibernate.envers.query.projection.AuditProjection auditProjection = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function2<T, io.tolgee.dtos.query_results.TranslationHistoryView, kotlin.Unit> assigner = null;
        
        public Projection(@org.jetbrains.annotations.NotNull()
        org.hibernate.envers.query.projection.AuditProjection auditProjection, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super T, ? super io.tolgee.dtos.query_results.TranslationHistoryView, kotlin.Unit> assigner) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.hibernate.envers.query.projection.AuditProjection getAuditProjection() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<T, io.tolgee.dtos.query_results.TranslationHistoryView, kotlin.Unit> getAssigner() {
            return null;
        }
    }
}