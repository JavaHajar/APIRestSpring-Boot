package com.code.sbootwdc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "responsables")
public class Responsable  extends User{


//    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "typeofres_id")
    private Typeresponsable typeofres;

//    @JsonManagedReference
    @JsonBackReference
    @OneToMany(mappedBy = "responsables")
    private Set<Activite> activites = new LinkedHashSet<>();

    public Responsable() {
    }

    public Responsable(Integer id, String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine, Typeresponsable typeofres, Set<Activite> activites) {
        super(id, nom, prenom, tele, email, password, etat, roles, domaine);
        this.typeofres = typeofres;
        this.activites = activites;
    }

    public Responsable(String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine, Typeresponsable typeofres, Set<Activite> activites) {
        super(nom, prenom, tele, email, password, etat, roles, domaine);
        this.typeofres = typeofres;
        this.activites = activites;
    }

    public Set<Activite> getActivites() {
        return activites;
    }

    public void setActivites(Set<Activite> activites) {
        this.activites = activites;
    }

    public Typeresponsable getTypeofres() {
        return typeofres;
    }

    public void setTypeofres(Typeresponsable typeofres) {
        this.typeofres = typeofres;
    }


}