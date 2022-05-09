package com.code.sbootwdc.model;

import javax.persistence.*;

@Entity
@Table(name = "participant_activites")
public class ParticipantActivite {
    @EmbeddedId
    private ParticipantActiviteId id;

    @MapsId("participantId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "participant_id", nullable = false, referencedColumnName = "id")
    private Participant participant;

    @MapsId("activiteId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activite_id", nullable = false)
    private Activite activite;

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public ParticipantActiviteId getId() {
        return id;
    }

    public void setId(ParticipantActiviteId id) {
        this.id = id;
    }
}