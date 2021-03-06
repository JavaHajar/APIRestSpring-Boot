package com.code.sbootwdc.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "typeofuser", nullable = false, length = 90)
    private String typeofuser;

    @JsonManagedReference
    @OneToMany(mappedBy = "roles")
    private Set<User> users = new LinkedHashSet<>();

    public Role(Integer id) {
        this.id = id;
    }

    public Role() {
    }

    public Role(Integer id, String typeofuser, Set<User> users) {
        this.id = id;
        this.typeofuser = typeofuser;
        this.users = users;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getTypeofuser() {
        return typeofuser;
    }

    public void setTypeofuser(String typeofuser) {
        this.typeofuser = typeofuser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}