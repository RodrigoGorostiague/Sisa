package com.example.demo.entity.schemas.portalCiudadano;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reestablecer_password_confirm", schema = "portal_ciudadano")
public class ReestablecerPasswordConfirm {
    @Id
    private String dani;
    private String credencial;
    private String token;

    public String getDani() {
        return dani;
    }

    public void setDani(String dani) {
        this.dani = dani;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
