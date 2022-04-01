package io.tolgee.model.dataImport;

import io.tolgee.model.translation.Translation;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImportTranslation.class)
public abstract class ImportTranslation_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<ImportTranslation, ImportLanguage> language;
	public static volatile SingularAttribute<ImportTranslation, String> text;
	public static volatile SingularAttribute<ImportTranslation, Boolean> override;
	public static volatile SingularAttribute<ImportTranslation, String> resolvedHash;
	public static volatile SingularAttribute<ImportTranslation, ImportKey> key;
	public static volatile SingularAttribute<ImportTranslation, Translation> conflict;

	public static final String LANGUAGE = "language";
	public static final String TEXT = "text";
	public static final String OVERRIDE = "override";
	public static final String RESOLVED_HASH = "resolvedHash";
	public static final String KEY = "key";
	public static final String CONFLICT = "conflict";

}

