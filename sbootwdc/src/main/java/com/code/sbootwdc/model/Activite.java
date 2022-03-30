package com.code.sbootwdc.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "activites")
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idactivite", nullable = false)
    private Integer id;

    @Column(name = "titre", length = 100)
    private String titre;

    @Column(name = "descriptif", length = 200)
    private String descriptif;

    @Column(name = "datedebut", length = 30)
    private String datedebut;

    @Column(name = "datefin", length = 30)
    private String datefin;

    @Column(name = "status")
    private Boolean status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeofactivite_id")
    private Typeofactivite typeofactivites;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercice_id")
    private Exercice exercices;

//    @ManyToMany
//    @JoinTable(name = "user_activites",
//            joinColumns = @JoinColumn(name = "activite_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id"))

    @OneToMany(mappedBy = "activite")
    Set<UserActivite> activituser;

//    private Set<User> users = new LinkedHashSet<>();
//
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }

    public Exercice getExercices() {
        return exercices;
    }

    public void setExercices(Exercice exercices) {
        this.exercices = exercices;
    }

    public Typeofactivite getTypeofactivites() {
        return typeofactivites;
    }

    public void setTypeofactivites(Typeofactivite typeofactivites) {
        this.typeofactivites = typeofactivites;
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