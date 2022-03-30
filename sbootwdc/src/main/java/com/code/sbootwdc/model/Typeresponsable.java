package com.code.sbootwdc.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "typeresponsables")
public class Typeresponsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "typeofres", length = 90)
    private String typeofres;

    @OneToMany(mappedBy = "typofres")
    private Set<Responsable> responsables = new LinkedHashSet<>();

    public Set<Responsable> getResponsables() {
        return responsables;
    }

    public void setResponsables(Set<Responsable> responsables) {
        this.responsables = responsables;
    }

    public String getTypeofres() {
        return typeofres;
    }

    public void setTypeofres(String typeofres) {
        this.typeofres = typeofres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}