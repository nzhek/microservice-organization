package com.devcore.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.search.annotations.DocumentId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Base entity
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @DocumentId
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof BaseEntity)) return false;

        BaseEntity that = (BaseEntity) o;

        return new EqualsBuilder()
                .append(getUuid(), that.getUuid())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getUuid())
                .toHashCode();
    }

}
