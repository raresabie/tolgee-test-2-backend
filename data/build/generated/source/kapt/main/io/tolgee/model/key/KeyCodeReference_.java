package io.tolgee.model.key;

import io.tolgee.model.UserAccount;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(KeyCodeReference.class)
public abstract class KeyCodeReference_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<KeyCodeReference, String> path;
	public static volatile SingularAttribute<KeyCodeReference, Boolean> fromImport;
	public static volatile SingularAttribute<KeyCodeReference, KeyMeta> keyMeta;
	public static volatile SingularAttribute<KeyCodeReference, UserAccount> author;
	public static volatile SingularAttribute<KeyCodeReference, Long> line;

	public static final String PATH = "path";
	public static final String FROM_IMPORT = "fromImport";
	public static final String KEY_META = "keyMeta";
	public static final String AUTHOR = "author";
	public static final String LINE = "line";

}

