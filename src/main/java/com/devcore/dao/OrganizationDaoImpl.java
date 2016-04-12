package com.devcore.dao;

import com.devcore.entity.Organization;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Component("organizationDao")
public class OrganizationDaoImpl extends GenericDaoImpl<Organization> implements OrganizationDao {

    @Override
    public List<Organization> findAll(String paramName, int firstResult, int maxResult) {
        TypedQuery<Organization> query;
        if (firstResult > maxResult || firstResult < 0 || maxResult < 0) return null;
        if (paramName == null || paramName.isEmpty()) {
            query = this.entityManager.createQuery("select o from Organization o", Organization.class);
            return query.setFirstResult(firstResult).setMaxResults(maxResult).getResultList();
        }
        query = this.entityManager.createQuery("select o from Organization o where organizationName like :paramName", Organization.class);
        query.setParameter("paramName", paramName);
        return query.setFirstResult(firstResult).setMaxResults(maxResult).getResultList();
    }

    @Override
    public Long countPages() {
        Query query = this.entityManager.createQuery("select count(o) from Organization o");
        return (Long) query.getSingleResult();
    }

    @Override
    public Long countPagesByName(String paramName) {
        Query query = this.entityManager.createQuery("select count(o) from Organization o where organizationName like :paramName");
        return (Long) query.setParameter("paramName", paramName).getSingleResult();
    }
}
