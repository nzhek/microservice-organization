package com.devcore.service;

import com.devcore.dao.OrganizationDao;
import com.devcore.dto.OrganizationDto;
import com.devcore.entity.Organization;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationDao organizationDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OrganizationDto create(Organization organization) {
        return convertToDto(organizationDao.create(organization));
    }

    /**
     * @param organizationDto
     * @return false if organization not deleted and exists, true is organization deleted
     */
    @Override
    public Boolean delete(OrganizationDto organizationDto) {
        organizationDao.delete(modelMapper.map(organizationDto, Organization.class));
        //if (organizationDao.find(id) != null){ return false;}
        return true;
    }

    @Override
    public OrganizationDto update(OrganizationDto organization) {
        return convertToDto(organizationDao.update(modelMapper.map(organization, Organization.class)));
    }

    @Override
    public OrganizationDto find(OrganizationDto organization) {
        return convertToDto(organizationDao.find(UUID.fromString(organization.getUuid())));
    }

    @Override
    public List<OrganizationDto> search(String paramName, int firstResult, int maxResult) {
        return organizationDao.search(paramName, firstResult, maxResult).stream().map(
                organization -> convertToDto(organization)).collect(Collectors.toList());
    }

    private OrganizationDto convertToDto(Organization post) {
        return modelMapper.map(post, OrganizationDto.class);
    }
}
