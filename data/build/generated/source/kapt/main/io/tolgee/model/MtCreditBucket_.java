package io.tolgee.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MtCreditBucket.class)
public abstract class MtCreditBucket_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<MtCreditBucket, Date> refilled;
	public static volatile SingularAttribute<MtCreditBucket, Long> credits;
	public static volatile SingularAttribute<MtCreditBucket, UserAccount> userAccount;
	public static volatile SingularAttribute<MtCreditBucket, Organization> organization;

	public static final String REFILLED = "refilled";
	public static final String CREDITS = "credits";
	public static final String USER_ACCOUNT = "userAccount";
	public static final String ORGANIZATION = "organization";

}

