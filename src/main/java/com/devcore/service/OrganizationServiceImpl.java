package com.devcore.service;

import com.devcore.dao.OrganizationDao;
import com.devcore.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationDao organizationDao;

    @Override
    public Organization create(Organization organization) {
        return organizationDao.create(organization);
    }

    /**
     * @param  id
     * @return false if organization not deleted and exists, true is organization deleted
     */
    @Override
    public Boolean delete(Organization id) {
        organizationDao.delete(id);
        //if (organizationDao.find(id) != null){ return false;}
        return true;
    }

    @Override
    public Organization update(Organization organization) {
        return organizationDao.update(organization);
    }

    @Override
    public Organization find(Organization organization) {
        return organizationDao.find(organization);
    }

    @Override
    public List<Organization> findAll(String paramName, int firstResult, int maxResult) {
        return organizationDao.findAll(paramName, firstResult, maxResult);
    }

    @Override
    public Long countPagesByName(String paramName) {
        return organizationDao.countPagesByName(paramName);
    }
}
