package io.tolgee.model;

import io.tolgee.model.key.Key;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Project.class)
public abstract class Project_ extends io.tolgee.model.AuditModel_ {

	public static volatile SingularAttribute<Project, AutoTranslationConfig> autoTranslationConfig;
	public static volatile SetAttribute<Project, Language> languages;
	public static volatile SetAttribute<Project, Key> keys;
	public static volatile SetAttribute<Project, ApiKey> apiKeys;
	public static volatile SingularAttribute<Project, String> description;
	public static volatile SingularAttribute<Project, UserAccount> userOwner;
	public static volatile SingularAttribute<Project, String> avatarHash;
	public static volatile SetAttribute<Project, Permission> permissions;
	public static volatile SingularAttribute<Project, String> name;
	public static volatile SingularAttribute<Project, Language> baseLanguage;
	public static volatile SingularAttribute<Project, Long> id;
	public static volatile SingularAttribute<Project, String> slug;
	public static volatile SingularAttribute<Project, Organization> organizationOwner;

	public static final String AUTO_TRANSLATION_CONFIG = "autoTranslationConfig";
	public static final String LANGUAGES = "languages";
	public static final String KEYS = "keys";
	public static final String API_KEYS = "apiKeys";
	public static final String DESCRIPTION = "description";
	public static final String USER_OWNER = "userOwner";
	public static final String AVATAR_HASH = "avatarHash";
	public static final String PERMISSIONS = "permissions";
	public static final String NAME = "name";
	public static final String BASE_LANGUAGE = "baseLanguage";
	public static final String ID = "id";
	public static final String SLUG = "slug";
	public static final String ORGANIZATION_OWNER = "organizationOwner";

}

