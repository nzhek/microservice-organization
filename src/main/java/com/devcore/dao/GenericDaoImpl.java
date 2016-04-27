package com.devcore.dao;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    @PersistenceContext(type = PersistenceContextType.EXTENDED, name = "firstPersistenceUnit")
    protected EntityManager entityManager;

    private FullTextEntityManager fullTextEntityManager;

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
    public List<T> create(List<T> t) {
        t.stream().forEach(o -> entityManager.persist(o));
        entityManager.flush();
        return t;
    }

    @Override
    public void delete(T t) {
        entityManager.remove(entityManager.merge(t));
        entityManager.flush();
    }

    @Override
    public void delete(Serializable uuid) {
        entityManager.remove(entityManager.find(type, uuid));
        entityManager.flush();
    }

    @Override
    public T find(Serializable uuid) {
        return entityManager.find(type, uuid);
    }

    @Override
    public T update(T t) {
        T result = entityManager.merge(t);
        entityManager.flush();
        return result;
    }

    @Override
    public void updateFullTextIndex() {
        try {
            getFullTextEntityManager().createIndexer().startAndWait();
        } catch (Exception e) {

        }
    }

    protected FullTextEntityManager getFullTextEntityManager() {
        if (fullTextEntityManager == null) {
            fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
        }
        return fullTextEntityManager;
    }

}
