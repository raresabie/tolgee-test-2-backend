package io.tolgee.model;

import io.tolgee.model.Permission.ProjectPermissionType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Permission.class)
public abstract class Permission_ extends io.tolgee.model.AuditModel_ {

	public static volatile SetAttribute<Permission, Language> languages;
	public static volatile SingularAttribute<Permission, Invitation> invitation;
	public static volatile SingularAttribute<Permission, Project> project;
	public static volatile SingularAttribute<Permission, Long> id;
	public static volatile SingularAttribute<Permission, ProjectPermissionType> type;
	public static volatile SingularAttribute<Permission, UserAccount> user;

	public static final String LANGUAGES = "languages";
	public static final String INVITATION = "invitation";
	public static final String PROJECT = "project";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String USER = "user";

}

