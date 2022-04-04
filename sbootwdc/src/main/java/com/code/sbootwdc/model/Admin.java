package com.code.sbootwdc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "admins")
public class Admin extends User {

    public Admin() {
    }

    public Admin(Integer id, String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine) {
        super(id, nom, prenom, tele, email, password, etat, roles, domaine);
    }

    public Admin(String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine) {
        super(nom, prenom, tele, email, password, etat, roles, domaine);
    }



}