package com.devcore.dao;

import java.util.Map;

/**
 *
 */
public interface GenericDao<T> {
  long countAll();

  T create(T t);

  void delete(Object id);

  T find(Object id);

  T update(T t);
}
