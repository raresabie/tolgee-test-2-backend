package io.tolgee.model;

import io.tolgee.model.enums.OrganizationRoleType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrganizationRole.class)
public abstract class OrganizationRole_ extends io.tolgee.model.AuditModel_ {

	public static volatile SingularAttribute<OrganizationRole, Invitation> invitation;
	public static volatile SingularAttribute<OrganizationRole, Organization> organization;
	public static volatile SingularAttribute<OrganizationRole, Long> id;
	public static volatile SingularAttribute<OrganizationRole, OrganizationRoleType> type;
	public static volatile SingularAttribute<OrganizationRole, UserAccount> user;

	public static final String INVITATION = "invitation";
	public static final String ORGANIZATION = "organization";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String USER = "user";

}

