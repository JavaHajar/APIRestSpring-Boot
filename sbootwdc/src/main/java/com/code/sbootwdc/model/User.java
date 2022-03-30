package com.code.sbootwdc.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role roles;

    @Lob
    @Column(name = "domaine")
    private String domaine;

//    @ManyToMany
//    @JoinTable(name = "user_activites",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "activite_id"))
//    private Set<Activite> activites = new LinkedHashSet<>();

    @OneToMany(mappedBy = "user")
    Set<UserActivite> activituser;

    public User() {
    }

    public User(Integer id, String nom, String prenom, String tele, String email, String password, Boolean etat, String domaine, Role roles) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tele = tele;
        this.email = email;
        this.password = password;
        this.etat = etat;
        this.domaine = domaine;
        this.roles = roles;
    }

//    public Set<Activite> getActivites() {
//        return activites;
//    }
//
//    public void setActivites(Set<Activite> activites) {
//        this.activites = activites;
//    }


    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}