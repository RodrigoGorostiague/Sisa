package com.example.demo.entity.schemas.portalCiudadano;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro_confirmado", schema = "portal_ciudadano")
public class RegistroConfirmado {
    @Id
    private String dni;
    @Column(name = "cod_confirmacion")
    private String codConfirmacion;
    private String password;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodConfirmacion() {
        return codConfirmacion;
    }

    public void setCodConfirmacion(String codConfirmacion) {
        this.codConfirmacion = codConfirmacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
