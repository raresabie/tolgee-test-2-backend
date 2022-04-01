package io.tolgee.model;

import io.tolgee.model.UserAccount.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserAccount.class)
public abstract class UserAccount_ extends io.tolgee.model.AuditModel_ {

	public static volatile SingularAttribute<UserAccount, String> thirdPartyAuthId;
	public static volatile SingularAttribute<UserAccount, Role> role;
	public static volatile SingularAttribute<UserAccount, EmailVerification> emailVerification;
	public static volatile SingularAttribute<UserAccount, String> resetPasswordCode;
	public static volatile SingularAttribute<UserAccount, MtCreditBucket> mtCreditBucket;
	public static volatile ListAttribute<UserAccount, OrganizationRole> organizationRoles;
	public static volatile SingularAttribute<UserAccount, String> password;
	public static volatile SingularAttribute<UserAccount, String> avatarHash;
	public static volatile SetAttribute<UserAccount, Permission> permissions;
	public static volatile SingularAttribute<UserAccount, String> name;
	public static volatile SingularAttribute<UserAccount, Long> id;
	public static volatile SingularAttribute<UserAccount, String> thirdPartyAuthType;
	public static volatile SingularAttribute<UserAccount, String> username;

	public static final String THIRD_PARTY_AUTH_ID = "thirdPartyAuthId";
	public static final String ROLE = "role";
	public static final String EMAIL_VERIFICATION = "emailVerification";
	public static final String RESET_PASSWORD_CODE = "resetPasswordCode";
	public static final String MT_CREDIT_BUCKET = "mtCreditBucket";
	public static final String ORGANIZATION_ROLES = "organizationRoles";
	public static final String PASSWORD = "password";
	public static final String AVATAR_HASH = "avatarHash";
	public static final String PERMISSIONS = "permissions";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String THIRD_PARTY_AUTH_TYPE = "thirdPartyAuthType";
	public static final String USERNAME = "username";

}

