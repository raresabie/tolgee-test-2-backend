package io.tolgee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UploadedImage.class)
public abstract class UploadedImage_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<UploadedImage, String> filename;
	public static volatile SingularAttribute<UploadedImage, UserAccount> userAccount;

	public static final String FILENAME = "filename";
	public static final String USER_ACCOUNT = "userAccount";

}

