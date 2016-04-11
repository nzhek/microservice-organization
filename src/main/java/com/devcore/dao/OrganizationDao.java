package com.devcore.dao;

import com.devcore.entity.Organization;

import java.util.List;

/**
 * Dao для организаций
 */
public interface OrganizationDao extends GenericDao<Organization> {

    List<Organization> findAll(String paramName, int firstResult, int maxResult);

    Long countPages();

    Long countPagesByName(String paramName);
}
