package io.tolgee.model;

import io.tolgee.model.enums.ApiScope;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ApiKey.class)
public abstract class ApiKey_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SetAttribute<ApiKey, ApiScope> scopesEnum;
	public static volatile SingularAttribute<ApiKey, UserAccount> userAccount;
	public static volatile SingularAttribute<ApiKey, Project> project;
	public static volatile SingularAttribute<ApiKey, String> key;

	public static final String SCOPES_ENUM = "scopesEnum";
	public static final String USER_ACCOUNT = "userAccount";
	public static final String PROJECT = "project";
	public static final String KEY = "key";

}

