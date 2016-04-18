package com.devcore.entity;

import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Index;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Сущность для организаций
 */
@Entity
@Indexed
public class Organization extends BaseEntity {

    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    private String organizationName;
    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    private String description;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<Category> category;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<OfficeOrganization> officeOrganizations;
    private Date createDate;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Category> getCategory() {
        return category;
    }

    public void setCategory(Collection<Category> category) {
        this.category = category;
    }

    public Collection<OfficeOrganization> getOfficeOrganizations() {
        return officeOrganizations;
    }

    public void setOfficeOrganizations(Collection<OfficeOrganization> officeOrganizations) {
        this.officeOrganizations = officeOrganizations;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
