package com.code.sbootwdc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false, length = 90)
    private String nom;

    @Column(name = "prenom", length = 90)
    private String prenom;

    @Column(name = "tele", length = 90)
    private String tele;

    @Column(name = "email", nullable = false, length = 90)
    private String email;

    @Column(name = "password", nullable = false, length = 90)
    private String password;

    @Column(name = "etat")
    private Boolean etat;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role roles;

//    @Lob
    @Column(name = "domaine")
    private String domaine;

    public User() {
    }

    public User(Integer id, String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
        this.email = email;
        this.password = password;
        this.etat = etat;
        this.roles = roles;
        this.domaine = domaine;
    }

    public User(String nom, String prenom, String tele, String email, String password, Boolean etat, Role roles, String domaine) {
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
        this.email = email;
        this.password = password;
        this.etat = etat;
        this.roles = roles;
        this.domaine = domaine;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }
    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tele='" + tele + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", etat=" + etat +
                ", roles=" + roles +
                ", domaine='" + domaine + '\'' +
                '}';
    }
}