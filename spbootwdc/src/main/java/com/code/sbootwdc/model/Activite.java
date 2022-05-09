package com.code.sbootwdc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.ToString;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@ToString
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

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "typeofactivite_id")
    private Typeofactivite typeofactivites;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "exercice_id")
    private Exercice exercices;

//    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "responsable_id", nullable = false, referencedColumnName = "id")
    private Responsable responsables;


    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable(name = "participant_activites",
            joinColumns = @JoinColumn(name = "activite_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id"))
    @JsonIgnoreProperties("activites")
    private Set<Participant> participants = new LinkedHashSet<>();

    public Activite() {
    }
    public Activite(Integer id) {
        this.id = id;
    }

    public Activite(Integer id, String titre, String descriptif, String datedebut, String datefin, Boolean status, Typeofactivite typeofactivites, Exercice exercices, Responsable responsables, Set<Participant> participants) {
        this.id = id;
        this.titre = titre;
        this.descriptif = descriptif;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.status = status;
        this.typeofactivites = typeofactivites;
        this.exercices = exercices;
        this.responsables = responsables;
        this.participants = participants;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    public Responsable getResponsables() {
        return responsables;
    }

    public void setResponsables(Responsable responsables) {
        this.responsables = responsables;
    }

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