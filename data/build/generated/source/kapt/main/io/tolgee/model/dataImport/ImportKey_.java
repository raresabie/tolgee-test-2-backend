package io.tolgee.model.dataImport;

import io.tolgee.model.key.KeyMeta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImportKey.class)
public abstract class ImportKey_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<ImportKey, KeyMeta> keyMeta;
	public static volatile ListAttribute<ImportKey, ImportTranslation> translations;
	public static volatile SingularAttribute<ImportKey, String> name;
	public static volatile ListAttribute<ImportKey, ImportFile> files;

	public static final String KEY_META = "keyMeta";
	public static final String TRANSLATIONS = "translations";
	public static final String NAME = "name";
	public static final String FILES = "files";

}

