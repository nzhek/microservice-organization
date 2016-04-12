package com.devcore.service;

import com.devcore.dao.OfficeOrganizationDao;
import com.devcore.dto.OfficeOrganizationDto;
import com.devcore.entity.OfficeOrganization;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * service for office organization
 * Created by e.novichenko on 11.04.2016.
 */
@Service("officeOrganizationService")
public class OfficeOrganizationServiceImpl implements OfficeOrganizationService {

    @Autowired
    private OfficeOrganizationDao officeOrganizationDao;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<OfficeOrganizationDto> create(List<OfficeOrganizationDto> officeOrganizationDto) {

        //1 запись за одну транзакцию
        return officeOrganizationDto.stream().map(o -> modelMapper.map(officeOrganizationDao
                .create(modelMapper.map(o, OfficeOrganization.class)), OfficeOrganizationDto.class))
                .collect(Collectors.toList());

        //batch запись
//        List<OfficeOrganization> list = officeOrganizationDto.stream().map(o -> modelMapper.map(o, OfficeOrganization.class)).collect(Collectors.toList());
//        List<OfficeOrganization> createOfficeList = officeOrganizationDao.create(list);
//        return createOfficeList.stream().map(o -> modelMapper.map(o, OfficeOrganizationDto.class)).collect(Collectors.toList());
    }

    @Override
    public Boolean delete(OfficeOrganizationDto officeOrganizationDto) {
        return null;
    }
}
