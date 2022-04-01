package io.tolgee.service.export.dataProvider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002J\b\u0010,\u001a\u00020%H\u0002J\b\u0010-\u001a\u00020%H\u0002J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\b\u00101\u001a\u00020%H\u0002J\u0014\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J6\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J2\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020706j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000207`82\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0002R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lio/tolgee/service/export/dataProvider/ExportDataProvider;", "", "entityManager", "Ljavax/persistence/EntityManager;", "exportParams", "Lio/tolgee/dtos/request/export/ExportParams;", "projectId", "", "(Ljavax/persistence/EntityManager;Lio/tolgee/dtos/request/export/ExportParams;J)V", "cb", "Ljavax/persistence/criteria/CriteriaBuilder;", "getCb", "()Ljavax/persistence/criteria/CriteriaBuilder;", "key", "Ljavax/persistence/criteria/Root;", "Lio/tolgee/model/key/Key;", "keyMetaJoin", "Ljavax/persistence/criteria/Join;", "Lio/tolgee/model/key/KeyMeta;", "languageJoin", "Ljavax/persistence/criteria/SetJoin;", "Lio/tolgee/model/Project;", "Lio/tolgee/model/Language;", "projectJoin", "query", "Ljavax/persistence/criteria/CriteriaQuery;", "Lio/tolgee/service/export/dataProvider/ExportDataView;", "getQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", "tagJoin", "Lio/tolgee/model/key/Tag;", "translationJoin", "Lio/tolgee/model/translation/Translation;", "whereConditions", "", "Ljavax/persistence/criteria/Predicate;", "addJoins", "", "addSelect", "addWhereConditions", "filterKeyId", "filterKeyIdNot", "filterKeyPrefix", "filterProjectId", "filterState", "filterTag", "getData", "", "Lio/tolgee/service/export/dataProvider/ExportTranslationView;", "initQuery", "joinLanguage", "joinTranslation", "language", "transformResult", "Ljava/util/HashMap;", "Lio/tolgee/service/export/dataProvider/ExportKeyView;", "Lkotlin/collections/HashMap;", "resultList", "data"})
public final class ExportDataProvider {
    private final javax.persistence.EntityManager entityManager = null;
    private final io.tolgee.dtos.request.export.ExportParams exportParams = null;
    private final long projectId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final javax.persistence.criteria.CriteriaBuilder cb = null;
    @org.jetbrains.annotations.NotNull()
    private final javax.persistence.criteria.CriteriaQuery<io.tolgee.service.export.dataProvider.ExportDataView> query = null;
    private javax.persistence.criteria.Root<io.tolgee.model.key.Key> key;
    private javax.persistence.criteria.SetJoin<io.tolgee.model.key.KeyMeta, io.tolgee.model.key.Tag> tagJoin;
    private javax.persistence.criteria.Join<io.tolgee.model.key.Key, io.tolgee.model.key.KeyMeta> keyMetaJoin;
    private javax.persistence.criteria.SetJoin<io.tolgee.model.key.Key, io.tolgee.model.translation.Translation> translationJoin;
    private javax.persistence.criteria.SetJoin<io.tolgee.model.Project, io.tolgee.model.Language> languageJoin;
    private javax.persistence.criteria.Join<io.tolgee.model.key.Key, io.tolgee.model.Project> projectJoin;
    private java.util.List<javax.persistence.criteria.Predicate> whereConditions;
    
    public ExportDataProvider(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager, @org.jetbrains.annotations.NotNull()
    io.tolgee.dtos.request.export.ExportParams exportParams, long projectId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.persistence.criteria.CriteriaBuilder getCb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.persistence.criteria.CriteriaQuery<io.tolgee.service.export.dataProvider.ExportDataView> getQuery() {
        return null;
    }
    
    private final void initQuery() {
    }
    
    private final void addJoins() {
    }
    
    private final void addSelect() {
    }
    
    private final void addWhereConditions() {
    }
    
    private final void filterProjectId() {
    }
    
    private final void filterTag() {
    }
    
    private final void filterKeyId() {
    }
    
    private final void filterKeyIdNot() {
    }
    
    private final void filterKeyPrefix() {
    }
    
    private final void filterState() {
    }
    
    private final javax.persistence.criteria.SetJoin<io.tolgee.model.key.Key, io.tolgee.model.translation.Translation> joinTranslation(javax.persistence.criteria.Root<io.tolgee.model.key.Key> key, javax.persistence.criteria.SetJoin<io.tolgee.model.Project, io.tolgee.model.Language> language) {
        return null;
    }
    
    private final javax.persistence.criteria.SetJoin<io.tolgee.model.Project, io.tolgee.model.Language> joinLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.tolgee.service.export.dataProvider.ExportTranslationView> getData() {
        return null;
    }
    
    private final java.util.HashMap<java.lang.Long, io.tolgee.service.export.dataProvider.ExportKeyView> transformResult(java.util.List<io.tolgee.service.export.dataProvider.ExportDataView> resultList) {
        return null;
    }
}