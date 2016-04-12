package com.devcore.service;

import com.devcore.dto.OfficeOrganizationDto;

import java.util.List;

/**
 * service - interface for office organization
 * Created by e.novichenko on 11.04.2016.
 */
public interface OfficeOrganizationService {
    List<OfficeOrganizationDto> create(List<OfficeOrganizationDto> officeOrganizationDto);

    Boolean delete(OfficeOrganizationDto officeOrganizationDto);
}
