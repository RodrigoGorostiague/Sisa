package com.example.demo.entity.schemas.portalCiudadano;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cambio_contraseña", schema = "portal_ciudadano")
public class CambioContrasenia {
    @Id
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
