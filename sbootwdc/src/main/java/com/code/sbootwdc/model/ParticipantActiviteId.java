package com.code.sbootwdc.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ParticipantActiviteId implements Serializable {
    private static final long serialVersionUID = -1388005143362024735L;
    @Column(name = "participant_id", nullable = false)
    private Integer participantId;
    @Column(name = "activite_id", nullable = false)
    private Integer activiteId;

    public Integer getActiviteId() {
        return activiteId;
    }

    public void setActiviteId(Integer activiteId) {
        this.activiteId = activiteId;
    }

    public Integer getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantId, activiteId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ParticipantActiviteId entity = (ParticipantActiviteId) o;
        return Objects.equals(this.participantId, entity.participantId) &&
                Objects.equals(this.activiteId, entity.activiteId);
    }
}