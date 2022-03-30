package com.code.sbootwdc.model;

import javax.persistence.*;

@Entity
@Table(name = "participants")
@PrimaryKeyJoinColumn(name = "participantId")
public class Participant extends User{

    @Column(name = "structure", length = 90)
    private String structure;

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

}