package com.devcore.entity;

import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Index;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Сущность для офиса
 */
@Entity
@Indexed
public class OfficeOrganization extends BaseEntity {

    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    private String officeName;
    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    private String description;
    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    private String addressOrganization;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Phone> phone;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Email> email;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
