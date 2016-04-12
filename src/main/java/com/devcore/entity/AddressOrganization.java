package com.devcore.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Entity for address organization
 */
@Entity
public class AddressOrganization extends BaseEntity {

    private BigDecimal latitude;
    private BigDecimal longitude;
    private Long zoom;
    private String text;
    private Date createDate;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Long getZoom() {
        return zoom;
    }

    public void setZoom(Long zoom) {
        this.zoom = zoom;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
