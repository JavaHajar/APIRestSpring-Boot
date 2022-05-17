package com.code.sbootwdc.model;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank
    private String nom;

    @NotBlank
    private String password;

    private String email;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
}

