package io.tolgee.model.key;

import io.tolgee.model.dataImport.ImportKey;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(KeyMeta.class)
public abstract class KeyMeta_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile ListAttribute<KeyMeta, KeyComment> comments;
	public static volatile ListAttribute<KeyMeta, KeyCodeReference> codeReferences;
	public static volatile SingularAttribute<KeyMeta, ImportKey> importKey;
	public static volatile SingularAttribute<KeyMeta, Key> key;
	public static volatile SetAttribute<KeyMeta, Tag> tags;

	public static final String COMMENTS = "comments";
	public static final String CODE_REFERENCES = "codeReferences";
	public static final String IMPORT_KEY = "importKey";
	public static final String KEY = "key";
	public static final String TAGS = "tags";

}

