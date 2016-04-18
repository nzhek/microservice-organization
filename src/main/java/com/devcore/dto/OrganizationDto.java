package com.devcore.dto;

import java.util.Collection;
import java.util.Date;

/**
 * Dto layer for organization
 * Created by e.novichenko
 */
public class OrganizationDto extends BaseDto {

    private String organizationName;
    private String description;
    private Collection<CategoryDto> category;
    private Collection<OfficeOrganizationDto> officeOrganizations;
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

    public Collection<CategoryDto> getCategory() {
        return category;
    }

    public void setCategory(Collection<CategoryDto> category) {
        this.category = category;
    }

    public Collection<OfficeOrganizationDto> getOfficeOrganizations() {
        return officeOrganizations;
    }

    public void setOfficeOrganizations(Collection<OfficeOrganizationDto> officeOrganizations) {
        this.officeOrganizations = officeOrganizations;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
