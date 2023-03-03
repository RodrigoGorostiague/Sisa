package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class TrabajoPartoPK implements Serializable {
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaingresoplanilla")
    private Date fechaIngresoPlanilla;
    private LocalDateTime hora;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaIngresoPlanilla() {
        return fechaIngresoPlanilla;
    }

    public void setFechaIngresoPlanilla(Date fechaIngresoPlanilla) {
        this.fechaIngresoPlanilla = fechaIngresoPlanilla;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
