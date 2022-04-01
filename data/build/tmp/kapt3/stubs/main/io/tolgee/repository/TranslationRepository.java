package io.tolgee.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\'J:\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\'J8\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\'J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020$0\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190 2\u0006\u0010%\u001a\u00020\u0003H\'J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010%\u001a\u00020\u0003H\'\u00a8\u0006\'"}, d2 = {"Lio/tolgee/repository/TranslationRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lio/tolgee/model/translation/Translation;", "", "deleteByIdIn", "", "ids", "", "findOneByKeyAndLanguage", "Ljava/util/Optional;", "key", "Lio/tolgee/model/key/Key;", "language", "Lio/tolgee/model/Language;", "findOneByKeyIdAndLanguageId", "getAllByKeyIdIn", "keyIds", "", "getAllByLanguageId", "", "languageId", "getTranslateMemorySuggestions", "Lorg/springframework/data/domain/Page;", "Lio/tolgee/model/views/TranslationMemoryItemView;", "baseTranslationText", "", "baseLanguage", "targetLanguage", "pageable", "Lorg/springframework/data/domain/Pageable;", "getTranslationMemoryValue", "getTranslations", "", "project", "Lio/tolgee/model/Project;", "languages", "Lio/tolgee/model/views/SimpleTranslationView;", "projectId", "selectIdsByProject", "data"})
@org.springframework.stereotype.Repository()
public abstract interface TranslationRepository extends org.springframework.data.jpa.repository.JpaRepository<io.tolgee.model.translation.Translation, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select t.text as text, l.tag as languageTag, k.name as key from Translation t \n        join t.key k join t.language l where t.key.project.id = :projectId and l.tag in :languages")
    public abstract java.util.List<io.tolgee.model.views.SimpleTranslationView> getTranslations(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> languages, long projectId);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "from Translation t join fetch Key k on t.key = k where k = :key and k.project = :project and t.language in :languages")
    public abstract java.util.Set<io.tolgee.model.translation.Translation> getTranslations(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Project project, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends io.tolgee.model.Language> languages);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<io.tolgee.model.translation.Translation> findOneByKeyAndLanguage(@org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language language);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.tolgee.model.translation.Translation findOneByKeyIdAndLanguageId(long key, long language);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n        from Translation t join fetch t.key k left join fetch k.keyMeta where t.language.id = :languageId\n    ")
    public abstract java.util.List<io.tolgee.model.translation.Translation> getAllByLanguageId(long languageId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Collection<io.tolgee.model.translation.Translation> getAllByKeyIdIn(@org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Long> keyIds);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "select t.id from Translation t where t.key.id in \n        (select k.id from t.key k where k.project.id = :projectId)")
    public abstract java.util.List<java.lang.Long> selectIdsByProject(long projectId);
    
    public abstract void deleteByIdIn(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> ids);
    
    /**
     * inputKey param is optional. When provided, target translation for given won't be returned,
     * because it's the base translation
     */
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n      select target.text as targetTranslationText, baseTranslation.text as baseTranslationText, key.name as keyName, \n      similarity(baseTranslation.text, :baseTranslationText) as similarity\n      from Translation baseTranslation\n      join baseTranslation.key key\n      join Translation target on \n            target.key = key and \n            target.language = :targetLanguage and\n            target.text <> \'\' and\n            target.text is not null\n      where baseTranslation.language = :baseLanguage and\n        similarity(baseTranslation.text, :baseTranslationText) > 0.5 and\n        (:key is null or key <> :key)\n      order by similarity desc\n      ")
    public abstract org.springframework.data.domain.Page<io.tolgee.model.views.TranslationMemoryItemView> getTranslateMemorySuggestions(@org.jetbrains.annotations.NotNull()
    java.lang.String baseTranslationText, @org.jetbrains.annotations.Nullable()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language baseLanguage, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.jpa.repository.Query(value = "\n      select target.text as targetTranslationText, baseTranslation.text as baseTranslationText, key.name as keyName, \n      similarity(baseTranslation.text, :baseTranslationText) as similarity\n      from Translation baseTranslation\n      join baseTranslation.key key\n      join Translation target on \n            target.key = key and \n            target.language = :targetLanguage and\n            target.text <> \'\' and\n            target.text is not null\n      where baseTranslation.language = :baseLanguage and\n        similarity(baseTranslation.text, :baseTranslationText) = 1 and\n        key <> :key\n      order by similarity desc\n      ")
    public abstract java.util.List<io.tolgee.model.views.TranslationMemoryItemView> getTranslationMemoryValue(@org.jetbrains.annotations.NotNull()
    java.lang.String baseTranslationText, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.key.Key key, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language baseLanguage, @org.jetbrains.annotations.NotNull()
    io.tolgee.model.Language targetLanguage, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}