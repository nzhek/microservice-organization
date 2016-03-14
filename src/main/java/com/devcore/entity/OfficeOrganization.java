package com.devcore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Сущность для офиса
 */
@Entity
public class OfficeOrganization implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AddressOrganization addressOrganization;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Organization organization;
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AddressOrganization getAddressOrganization() {
        return addressOrganization;
    }

    public void setAddressOrganization(AddressOrganization addressOrganization) {
        this.addressOrganization = addressOrganization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
