package io.tolgee.model.key;

import io.tolgee.model.Project;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tag.class)
public abstract class Tag_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SetAttribute<Tag, KeyMeta> keyMetas;
	public static volatile SingularAttribute<Tag, String> name;
	public static volatile SingularAttribute<Tag, Project> project;

	public static final String KEY_METAS = "keyMetas";
	public static final String NAME = "name";
	public static final String PROJECT = "project";

}

