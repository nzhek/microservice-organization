package com.devcore.dao;

import com.devcore.entity.Organization;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Component;

import javax.persistence.Query;

import java.util.List;

@Component("organizationDao")
public class OrganizationDaoImpl extends GenericDaoImpl<Organization> implements OrganizationDao {

    @Override
    public List<Organization> search(String searchString, int firstResult, int maxResult) {

//        try {
//            getFullTextEntityManager().createIndexer().startAndWait();
//        } catch (Exception e) {
//
//        }

        QueryBuilder qb = getFullTextEntityManager().getSearchFactory().buildQueryBuilder().forEntity(Organization.class).get();

        org.apache.lucene.search.Query luceneQuery = qb.keyword().fuzzy()
                .onFields("organizationName", "description").matching(searchString).createQuery();

        Query fullTextQuery = getFullTextEntityManager().createFullTextQuery(luceneQuery, Organization.class);

        fullTextQuery.setFirstResult(firstResult);
        fullTextQuery.setMaxResults(maxResult);

        return (List<Organization>) fullTextQuery.getResultList();
    }
}
