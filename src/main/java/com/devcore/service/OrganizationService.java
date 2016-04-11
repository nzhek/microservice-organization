package com.devcore.service;

import com.devcore.entity.Organization;

import java.util.List;

public interface OrganizationService {
    Organization create(Organization organization);

    Boolean delete(Organization id);

    Organization update(Organization organization);

    Organization find(Organization organization);

    List<Organization> findAll(String paramName, int firstResult, int maxResult);

    Long countPagesByName(String paramName);
}
