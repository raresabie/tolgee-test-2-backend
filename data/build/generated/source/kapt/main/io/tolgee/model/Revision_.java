package io.tolgee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Revision.class)
public abstract class Revision_ {

	public static volatile SingularAttribute<Revision, Long> id;
	public static volatile SingularAttribute<Revision, Long> authorId;
	public static volatile SingularAttribute<Revision, Long> timestamp;

	public static final String ID = "id";
	public static final String AUTHOR_ID = "authorId";
	public static final String TIMESTAMP = "timestamp";

}

