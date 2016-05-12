package com.devcore.service;

import com.devcore.dto.OrganizationDto;

import java.util.List;
import java.util.UUID;

public interface OrganizationService {
    OrganizationDto create(OrganizationDto organization);

    Boolean delete(UUID uuid);

    OrganizationDto update(OrganizationDto organization);

    OrganizationDto find(OrganizationDto organization);

    List<OrganizationDto> search(String paramName, int firstResult, int maxResult);
}
