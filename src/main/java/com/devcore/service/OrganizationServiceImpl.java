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
    public OrganizationDto create(OrganizationDto organization) {
        return convertToDto(organizationDao.create(modelMapper.map(organization, Organization.class)));
    }

    /**
     * @param uuid
     * @return false if organization not deleted and exists, true is organization deleted
     */
    @Override
    public Boolean delete(String uuid) {
        organizationDao.delete(UUID.fromString(uuid));
        //if (organizationDao.find(id) != null){ return false;}
        return true;
    }

    @Override
    public OrganizationDto update(OrganizationDto organization) {
        return convertToDto(organizationDao.update(modelMapper.map(organization, Organization.class)));
    }

    @Override
    public OrganizationDto find(String uuid) {
        return convertToDto(organizationDao.find(UUID.fromString(uuid)));
    }

    @Override
    public List<OrganizationDto> search(String paramName, int firstResult, int maxResult) {
        List<Organization> list = organizationDao.search(paramName, firstResult, maxResult);
        if (list != null)
            return list.stream().map(
                    organization -> convertToDto(organization)).collect(Collectors.toList());
        return null;
    }

    private OrganizationDto convertToDto(Organization post) {
        return modelMapper.map(post, OrganizationDto.class);
    }
}
