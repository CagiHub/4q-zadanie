package com.taskapp.taskapplication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Task.class)
public abstract class Task_ {

	public static volatile SingularAttribute<Task, String> note;
	public static volatile SingularAttribute<Task, String> name;
	public static volatile SingularAttribute<Task, Integer> id;

	public static final String NOTE = "note";
	public static final String NAME = "name";
	public static final String ID = "id";

}

