package com.devcore.dao;

import com.devcore.entity.OfficeOrganization;
import org.springframework.stereotype.Component;

/**
 * реализация DAO для оффиса
 */
@Component("officeOrganizationDao")
public class OfficeOrganizationDaoImpl extends GenericDaoImpl<OfficeOrganization> implements OfficeOrganizationDao {
}
