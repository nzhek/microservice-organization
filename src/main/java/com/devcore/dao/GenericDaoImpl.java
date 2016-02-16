package com.devcore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

  @PersistenceContext
  protected EntityManager entityManager;

  private Class<T> type;

  public GenericDaoImpl() {
    Type t = getClass().getGenericSuperclass();
    ParameterizedType parameterizedType = (ParameterizedType) t;
    type = (Class) parameterizedType.getActualTypeArguments()[0];
  }

  @Override
  public long countAll() {
    final StringBuffer queryString = new StringBuffer("SELECT count(o) from ");
    queryString.append(type.getSimpleName()).append(" o ");
    final Query query = entityManager.createQuery(queryString.toString());
    return (Long) query.getSingleResult();
  }

  @Override
  public T create(T t) {
    entityManager.persist(t);
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

  @Override
  public List<T> getAll() {
    final StringBuffer queryString = new StringBuffer("select u from ");
    queryString.append(type.getSimpleName()).append(" u ");
    final Query query = entityManager.createQuery(queryString.toString());
    List<T> list = query.getResultList();
    if (list != null){
      return list;
    }
    return null;
  }
}
