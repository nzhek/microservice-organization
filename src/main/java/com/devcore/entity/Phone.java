package com.devcore.entity;

import org.hibernate.search.annotations.*;

import javax.persistence.Entity;

/**
 * entity for phone
 * Created by e.novichenko on 12.04.2016.
 */
@Entity
@Indexed
public class Phone extends BaseEntity {
    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    public String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
