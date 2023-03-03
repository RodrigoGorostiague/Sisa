package com.example.demo.entity.schemas.portalCiudadano;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro_pendiente", schema = "portal_ciudadano")
public class RegistroPendiente {
    @Id
    private String dni;
    private String email;
    @Column(name = "cod_confirmacion")
    private String codConfirmacion;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodConfirmacion() {
        return codConfirmacion;
    }

    public void setCodConfirmacion(String codConfirmacion) {
        this.codConfirmacion = codConfirmacion;
    }
}
