package io.tolgee.model.dataImport.issues;

import io.tolgee.model.dataImport.issues.paramTypes.FileIssueParamType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImportFileIssueParam.class)
public abstract class ImportFileIssueParam_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<ImportFileIssueParam, ImportFileIssue> issue;
	public static volatile SingularAttribute<ImportFileIssueParam, FileIssueParamType> type;
	public static volatile SingularAttribute<ImportFileIssueParam, String> value;

	public static final String ISSUE = "issue";
	public static final String TYPE = "type";
	public static final String VALUE = "value";

}

