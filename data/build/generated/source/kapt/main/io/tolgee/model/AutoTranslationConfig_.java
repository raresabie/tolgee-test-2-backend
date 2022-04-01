package io.tolgee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AutoTranslationConfig.class)
public abstract class AutoTranslationConfig_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<AutoTranslationConfig, Project> project;
	public static volatile SingularAttribute<AutoTranslationConfig, Boolean> usingPrimaryMtService;
	public static volatile SingularAttribute<AutoTranslationConfig, Boolean> usingTm;

	public static final String PROJECT = "project";
	public static final String USING_PRIMARY_MT_SERVICE = "usingPrimaryMtService";
	public static final String USING_TM = "usingTm";

}

