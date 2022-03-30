package com.code.sbootwdc.model;

import javax.persistence.*;

@Entity
@Table(name = "user_activites")
public class UserActivite {
    @EmbeddedId
    private UserActiviteId id;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserActiviteId getId() {
        return id;
    }

    public void setId(UserActiviteId id) {
        this.id = id;
    }
}