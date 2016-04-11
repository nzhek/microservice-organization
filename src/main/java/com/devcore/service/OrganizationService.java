package com.devcore.service;

import com.devcore.dto.OrganizationDto;

import java.util.List;

public interface OrganizationService {
    OrganizationDto create(OrganizationDto organization);

    Boolean delete(OrganizationDto id);

    OrganizationDto update(OrganizationDto organization);

    OrganizationDto find(OrganizationDto organization);

    List<OrganizationDto> findAll(String paramName, int firstResult, int maxResult);

    Long countPagesByName(String paramName);
}
