package io.tolgee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EmailVerification.class)
public abstract class EmailVerification_ extends io.tolgee.model.AuditModel_ {

	public static volatile SingularAttribute<EmailVerification, String> code;
	public static volatile SingularAttribute<EmailVerification, UserAccount> userAccount;
	public static volatile SingularAttribute<EmailVerification, String> newEmail;
	public static volatile SingularAttribute<EmailVerification, Long> id;

	public static final String CODE = "code";
	public static final String USER_ACCOUNT = "userAccount";
	public static final String NEW_EMAIL = "newEmail";
	public static final String ID = "id";

}

