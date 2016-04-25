package com.devcore.dao;

import com.devcore.entity.Organization;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Dao для организаций
 */
public interface OrganizationDao extends GenericDao<Organization> {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    List<Organization> search(String searchString, int firstResult, int maxResult);
}
