package io.tolgee.model;

import io.tolgee.constants.MtServiceType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MtServiceConfig.class)
public abstract class MtServiceConfig_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<MtServiceConfig, Language> targetLanguage;
	public static volatile SingularAttribute<MtServiceConfig, MtServiceType> primaryService;
	public static volatile SingularAttribute<MtServiceConfig, Project> project;
	public static volatile SetAttribute<MtServiceConfig, MtServiceType> enabledServices;

	public static final String TARGET_LANGUAGE = "targetLanguage";
	public static final String PRIMARY_SERVICE = "primaryService";
	public static final String PROJECT = "project";
	public static final String ENABLED_SERVICES = "enabledServices";

}

