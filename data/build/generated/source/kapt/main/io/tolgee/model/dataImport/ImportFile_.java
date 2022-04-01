package io.tolgee.model.dataImport;

import io.tolgee.model.dataImport.issues.ImportFileIssue;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImportFile.class)
public abstract class ImportFile_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile ListAttribute<ImportFile, ImportLanguage> languages;
	public static volatile ListAttribute<ImportFile, ImportKey> keys;
	public static volatile SingularAttribute<ImportFile, String> name;
	public static volatile SingularAttribute<ImportFile, ImportFile> archive;
	public static volatile ListAttribute<ImportFile, ImportFileIssue> issues;

	public static final String LANGUAGES = "languages";
	public static final String KEYS = "keys";
	public static final String NAME = "name";
	public static final String ARCHIVE = "archive";
	public static final String ISSUES = "issues";

}

