package com.devcore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

  @PersistenceContext
  protected EntityManager entityManager;

  private final Class<T> type;

  public GenericDaoImpl() {
    Type t = getClass().getGenericSuperclass();
    ParameterizedType parameterizedType = (ParameterizedType) t;
    type = (Class) parameterizedType.getActualTypeArguments()[0];
  }

  @Override
  public T create(T t) {
    entityManager.persist(t);
    entityManager.flush();
    return t;
  }

  @Override
  public void delete(Object id) {
    this.entityManager.remove(this.entityManager.getReference(type, id));
  }

  @Override
  public T find(Object id) {
    return (T) this.entityManager.find(type, id);
  }

  @Override
  public T update(T t) {
    return this.entityManager.merge(t);
  }

}
