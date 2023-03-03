package com.example.demo.entity.schemas.portalCiudadano;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cambio_email", schema = "portal_ciudadano")
public class CambioEmail {
    @Id
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
