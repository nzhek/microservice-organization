package com.devcore.dao;


import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
public interface GenericDao<T> {

  @Transactional
  T create(T t);

  @Transactional
  void delete(Object id);

  T find(Object id);

  @Transactional
  T update(T t);
}
