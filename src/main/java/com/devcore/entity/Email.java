package com.devcore.entity;

import org.hibernate.search.annotations.*;

import javax.persistence.Entity;

/**
 * entity for phone
 * Created by e.novichenko on 12.04.2016.
 */
@Entity
@Indexed
public class Email extends BaseEntity {
    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
