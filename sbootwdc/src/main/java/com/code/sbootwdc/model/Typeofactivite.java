package com.code.sbootwdc.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "typeofactivites")
public class Typeofactivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nameofactivite", length = 100)
    private String nameofactivite;

    @OneToMany(mappedBy = "typeofactivites")
    private Set<Activite> activites = new LinkedHashSet<>();

    public Set<Activite> getActivites() {
        return activites;
    }

    public void setActivites(Set<Activite> activites) {
        this.activites = activites;
    }

    public String getNameofactivite() {
        return nameofactivite;
    }

    public void setNameofactivite(String nameofactivite) {
        this.nameofactivite = nameofactivite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}