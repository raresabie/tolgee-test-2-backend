package io.tolgee.model.dataImport.issues;

import io.tolgee.model.dataImport.ImportFile;
import io.tolgee.model.dataImport.issues.issueTypes.FileIssueType;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ImportFileIssue.class)
public abstract class ImportFileIssue_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<ImportFileIssue, ImportFile> file;
	public static volatile SingularAttribute<ImportFileIssue, FileIssueType> type;
	public static volatile ListAttribute<ImportFileIssue, ImportFileIssueParam> params;

	public static final String FILE = "file";
	public static final String TYPE = "type";
	public static final String PARAMS = "params";

}

