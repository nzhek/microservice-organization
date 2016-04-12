package com.devcore.dto;

import com.devcore.entity.Email;
import com.devcore.entity.Phone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * Dto - office organization
 * Created by e.novichenko on 11.04.2016.
 */
public class OfficeOrganizationDto extends BaseDto {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private String officeName;
    private String description;
    private String addressOrganization;
    private List<Phone> phone;
    private List<Email> email;
    private String createDate;

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

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Date getSubmissionDateConverted(String timezone) throws ParseException {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        return dateFormat.parse(getCreateDate());
    }

    public void setSubmissionDate(Date date, String timezone) {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        setCreateDate(dateFormat.format(date));
    }

}
