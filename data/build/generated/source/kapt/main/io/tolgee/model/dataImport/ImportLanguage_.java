package io.tolgee.model.dataImport;

import io.tolgee.model.Language;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImportLanguage.class)
public abstract class ImportLanguage_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<ImportLanguage, ImportFile> file;
	public static volatile ListAttribute<ImportLanguage, ImportTranslation> translations;
	public static volatile SingularAttribute<ImportLanguage, String> name;
	public static volatile SingularAttribute<ImportLanguage, Language> existingLanguage;

	public static final String FILE = "file";
	public static final String TRANSLATIONS = "translations";
	public static final String NAME = "name";
	public static final String EXISTING_LANGUAGE = "existingLanguage";

}

