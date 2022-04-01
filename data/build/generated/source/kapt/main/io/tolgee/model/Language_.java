package io.tolgee.model;

import io.tolgee.model.translation.Translation;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Language.class)
public abstract class Language_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<Language, String> originalName;
	public static volatile SetAttribute<Language, Translation> translations;
	public static volatile SingularAttribute<Language, String> name;
	public static volatile SingularAttribute<Language, String> flagEmoji;
	public static volatile SingularAttribute<Language, Project> project;
	public static volatile SingularAttribute<Language, String> tag;

	public static final String ORIGINAL_NAME = "originalName";
	public static final String TRANSLATIONS = "translations";
	public static final String NAME = "name";
	public static final String FLAG_EMOJI = "flagEmoji";
	public static final String PROJECT = "project";
	public static final String TAG = "tag";

}

