package com.devcore.service;

import com.devcore.dto.OrganizationDto;
import com.devcore.entity.Organization;

import java.util.List;

public interface OrganizationService {
    OrganizationDto create(Organization organization);

    Boolean delete(OrganizationDto id);

    OrganizationDto update(OrganizationDto organization);

    OrganizationDto find(OrganizationDto organization);

    List<OrganizationDto> search(String paramName, int firstResult, int maxResult);
}
