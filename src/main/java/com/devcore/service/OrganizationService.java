package com.devcore.service;

import com.devcore.dto.OrganizationDto;

import java.util.List;

public interface OrganizationService {
    OrganizationDto create(OrganizationDto organization);

    Boolean delete(String id);

    OrganizationDto update(OrganizationDto organization);

    OrganizationDto find(String uuid);

    List<OrganizationDto> search(String paramName, int firstResult, int maxResult);
}
