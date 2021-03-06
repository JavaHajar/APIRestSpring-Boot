package com.code.sbootwdc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.ToString;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@ToString
@Entity
@Table(name = "exercices")
public class Exercice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idexercice", nullable = false)
    private Integer id;

    @Column(name = "titre", length = 100)
    private String titre;

    @Column(name = "descriptif", length = 200)
    private String descriptif;

    @Column(name = "annee", length = 20)
    private String annee;

    @Column(name = "datedebut", length = 20)
    private String datedebut;

    @Column(name = "datefin", length = 20)
    private String datefin;

    @Column(name = "status")
    private Boolean status;

    @JsonBackReference
    @OneToMany(mappedBy = "exercices")
    private Set<Activite> activites = new LinkedHashSet<>();

    public Exercice() {
    }

    public Exercice(Integer id, String titre, String descriptif, String annee, String datedebut, String datefin, Boolean status, Set<Activite> activites) {
        this.id = id;
        this.titre = titre;
        this.descriptif = descriptif;
        this.annee = annee;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.status = status;
        this.activites = activites;
    }

    public Set<Activite> getActivites() {
        return activites;
    }

    public void setActivites(Set<Activite> activites) {
        this.activites = activites;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}