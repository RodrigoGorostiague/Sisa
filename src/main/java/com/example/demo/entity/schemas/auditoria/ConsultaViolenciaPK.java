package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class ConsultaViolenciaPK implements Serializable {
    private LocalDateTime fechas;
    private String usuario;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public LocalDateTime getFechas() {
        return fechas;
    }

    public void setFechas(LocalDateTime fechas) {
        this.fechas = fechas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
