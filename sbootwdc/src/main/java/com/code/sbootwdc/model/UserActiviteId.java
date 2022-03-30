package com.code.sbootwdc.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserActiviteId implements Serializable {
    private static final long serialVersionUID = 7563668209945965322L;
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Column(name = "activite_id", nullable = false)
    private Integer activiteId;

    public Integer getActiviteId() {
        return activiteId;
    }

    public void setActiviteId(Integer activiteId) {
        this.activiteId = activiteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, activiteId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserActiviteId entity = (UserActiviteId) o;
        return Objects.equals(this.userId, entity.userId) &&
                Objects.equals(this.activiteId, entity.activiteId);
    }
}