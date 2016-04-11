package com.devcore.entity;

import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Index;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Сущность для организаций
 */
@Entity
@Indexed
public class Organization implements Serializable {

    @Id
    @DocumentId
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    private String name;
    @Field(index = Index.YES, analyze = Analyze.NO, store = Store.NO)
    private String description;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Category> category;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
