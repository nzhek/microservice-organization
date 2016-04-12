package com.devcore.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity for category
 */
@Entity
public class Category extends BaseEntity {

    private String name;
    private String description;
    @OneToOne
    private Category category;
    private Date createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
