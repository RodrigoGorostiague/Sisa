package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class MovimientoDadorPK implements Serializable {
    private LocalDateTime fecha;
    private String usuario;
    @Column(name = "nrodonacion")
    private String nroDonacion;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNroDonacion() {
        return nroDonacion;
    }

    public void setNroDonacion(String nroDonacion) {
        this.nroDonacion = nroDonacion;
    }
}
