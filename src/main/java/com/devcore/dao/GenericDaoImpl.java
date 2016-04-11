package com.devcore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

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
        if (t == null) return null;
        entityManager.persist(t);
        entityManager.flush();
        return t;
    }

    @Override
    public void delete(T t) {
        entityManager.remove(entityManager.merge(t));
    }

    @Override
    public T find(Object id) {
        return entityManager.find(type, id);
    }

    @Override
    public T update(T t) {
        return entityManager.merge(t);
    }

}
