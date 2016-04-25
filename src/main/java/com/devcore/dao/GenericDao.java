package com.devcore.dao;


import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public interface GenericDao<T> {

    @Transactional
    T create(T t);

    @Transactional
    List<T> create(List<T> t);

    @Transactional
    void delete(T id);

    T find(Serializable id);

    @Transactional
    T update(T t);

    void updateFullTextIndex();
}
