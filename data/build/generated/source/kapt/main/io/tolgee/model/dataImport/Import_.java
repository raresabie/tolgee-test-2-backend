package io.tolgee.model.dataImport;

import io.tolgee.model.Project;
import io.tolgee.model.UserAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Import.class)
public abstract class Import_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<Import, UserAccount> author;
	public static volatile SingularAttribute<Import, Project> project;
	public static volatile ListAttribute<Import, ImportFile> files;

	public static final String AUTHOR = "author";
	public static final String PROJECT = "project";
	public static final String FILES = "files";

}

