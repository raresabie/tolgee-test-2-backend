package io.tolgee.model.translation;

import io.tolgee.model.UserAccount;
import io.tolgee.model.enums.TranslationCommentState;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TranslationComment.class)
public abstract class TranslationComment_ extends io.tolgee.model.StandardAuditModel_ {

	public static volatile SingularAttribute<TranslationComment, UserAccount> author;
	public static volatile SingularAttribute<TranslationComment, Translation> translation;
	public static volatile SingularAttribute<TranslationComment, String> text;
	public static volatile SingularAttribute<TranslationComment, TranslationCommentState> state;

	public static final String AUTHOR = "author";
	public static final String TRANSLATION = "translation";
	public static final String TEXT = "text";
	public static final String STATE = "state";

}

