package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class PerfilPK implements Serializable {
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String usuario;
    @Column(name = "idpaciente")
    private String idPaciente;

    public LocalDateTime getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(LocalDateTime fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }
}
