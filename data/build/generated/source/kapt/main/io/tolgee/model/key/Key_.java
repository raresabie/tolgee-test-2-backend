package io.tolgee.model.key;

import io.tolgee.model.Project;
import io.tolgee.model.Screenshot;
import io.tolgee.model.translation.Translation;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Key.class)
public abstract class Key_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<Key, KeyMeta> keyMeta;
	public static volatile SetAttribute<Key, Translation> translations;
	public static volatile SingularAttribute<Key, String> name;
	public static volatile SingularAttribute<Key, Project> project;
	public static volatile SetAttribute<Key, Screenshot> screenshots;

	public static final String KEY_META = "keyMeta";
	public static final String TRANSLATIONS = "translations";
	public static final String NAME = "name";
	public static final String PROJECT = "project";
	public static final String SCREENSHOTS = "screenshots";

}

