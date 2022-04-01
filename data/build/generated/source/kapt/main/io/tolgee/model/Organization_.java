package io.tolgee.model;

import io.tolgee.model.Permission.ProjectPermissionType;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Organization.class)
public abstract class Organization_ {

	public static volatile ListAttribute<Organization, Project> projects;
	public static volatile SingularAttribute<Organization, ProjectPermissionType> basePermissions;
	public static volatile SingularAttribute<Organization, String> avatarHash;
	public static volatile ListAttribute<Organization, OrganizationRole> memberRoles;
	public static volatile SingularAttribute<Organization, String> name;
	public static volatile SingularAttribute<Organization, String> description;
	public static volatile SingularAttribute<Organization, String> thirdPartyBillingId;
	public static volatile SingularAttribute<Organization, Long> id;
	public static volatile SingularAttribute<Organization, MtCreditBucket> mtCreditBucket;
	public static volatile SingularAttribute<Organization, String> slug;

	public static final String PROJECTS = "projects";
	public static final String BASE_PERMISSIONS = "basePermissions";
	public static final String AVATAR_HASH = "avatarHash";
	public static final String MEMBER_ROLES = "memberRoles";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String THIRD_PARTY_BILLING_ID = "thirdPartyBillingId";
	public static final String ID = "id";
	public static final String MT_CREDIT_BUCKET = "mtCreditBucket";
	public static final String SLUG = "slug";

}

