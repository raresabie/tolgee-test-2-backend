package io.tolgee.model.translation;

import io.tolgee.constants.MtServiceType;
import io.tolgee.model.Language;
import io.tolgee.model.enums.TranslationState;
import io.tolgee.model.key.Key;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Translation.class)
public abstract class Translation_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<Translation, Boolean> auto;
	public static volatile ListAttribute<Translation, TranslationComment> comments;
	public static volatile SingularAttribute<Translation, Language> language;
	public static volatile SingularAttribute<Translation, String> text;
	public static volatile SingularAttribute<Translation, TranslationState> state;
	public static volatile SingularAttribute<Translation, MtServiceType> mtProvider;
	public static volatile SingularAttribute<Translation, Key> key;

	public static final String AUTO = "auto";
	public static final String COMMENTS = "comments";
	public static final String LANGUAGE = "language";
	public static final String TEXT = "text";
	public static final String STATE = "state";
	public static final String MT_PROVIDER = "mtProvider";
	public static final String KEY = "key";

}

