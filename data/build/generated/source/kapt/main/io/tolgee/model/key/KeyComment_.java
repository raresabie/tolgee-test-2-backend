package io.tolgee.model.key;

import io.tolgee.model.UserAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(KeyComment.class)
public abstract class KeyComment_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<KeyComment, Boolean> fromImport;
	public static volatile SingularAttribute<KeyComment, KeyMeta> keyMeta;
	public static volatile SingularAttribute<KeyComment, UserAccount> author;
	public static volatile SingularAttribute<KeyComment, String> text;

	public static final String FROM_IMPORT = "fromImport";
	public static final String KEY_META = "keyMeta";
	public static final String AUTHOR = "author";
	public static final String TEXT = "text";

}

