package io.tolgee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Invitation.class)
public abstract class Invitation_ extends io.tolgee.model.AuditModel_ {

	public static volatile SingularAttribute<Invitation, String> code;
	public static volatile SingularAttribute<Invitation, OrganizationRole> organizationRole;
	public static volatile SingularAttribute<Invitation, String> name;
	public static volatile SingularAttribute<Invitation, Permission> permission;
	public static volatile SingularAttribute<Invitation, Long> id;
	public static volatile SingularAttribute<Invitation, String> email;

	public static final String CODE = "code";
	public static final String ORGANIZATION_ROLE = "organizationRole";
	public static final String NAME = "name";
	public static final String PERMISSION = "permission";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

