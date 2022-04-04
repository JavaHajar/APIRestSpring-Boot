package com.code.sbootwdc.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "participants")
public class Participant extends User{

    @Column(name = "structure", length = 80)
    private String structure;

    @ManyToMany(mappedBy = "participants")
    private Set<Activite> activites = new LinkedHashSet<>();


    public Participant() {
    }

    public Participant(Integer id, String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine, String structure, Set<Activite> activites) {
        super(id, nom, prenom, tele, email, password, etat, roles, domaine);
        this.structure = structure;
        this.activites = activites;
    }

    public Participant(String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine, String structure, Set<Activite> activites) {
        super(nom, prenom, tele, email, password, etat, roles, domaine);
        this.structure = structure;
        this.activites = activites;
    }

    public Set<Activite> getActivites() {
        return activites;
    }

    public void setActivites(Set<Activite> activites) {
        this.activites = activites;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }


}