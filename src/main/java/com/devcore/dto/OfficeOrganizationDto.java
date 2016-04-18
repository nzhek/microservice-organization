package com.devcore.dto;

import java.util.Date;
import java.util.List;

/**
 * Dto - office organization
 * Created by e.novichenko on 11.04.2016.
 */
public class OfficeOrganizationDto extends BaseDto {

    private String officeName;
    private String description;
    private String addressOrganization;
    private List<PhoneDto> phone;
    private List<EmailDto> email;
    private Date createDate;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddressOrganization() {
        return addressOrganization;
    }

    public void setAddressOrganization(String addressOrganization) {
        this.addressOrganization = addressOrganization;
    }

    public List<PhoneDto> getPhone() {
        return phone;
    }

    public void setPhone(List<PhoneDto> phone) {
        this.phone = phone;
    }

    public List<EmailDto> getEmail() {
        return email;
    }

    public void setEmail(List<EmailDto> email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
