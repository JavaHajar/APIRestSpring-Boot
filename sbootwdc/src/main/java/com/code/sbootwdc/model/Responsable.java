package com.code.sbootwdc.model;

import javax.persistence.*;

@Entity
@Table(name = "responsables")
@PrimaryKeyJoinColumn(name = "responsableId")
public class Responsable extends User{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typofres_id")
    private Typeresponsable typofres;

    public Typeresponsable getTypofres() {
        return typofres;
    }

    public void setTypofres(Typeresponsable typofres) {
        this.typofres = typofres;
    }


}