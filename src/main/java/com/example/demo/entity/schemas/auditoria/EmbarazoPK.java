package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EmbarazoPK implements Serializable {
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaingresoplanilla")
    private Date fechaIngresoPlanilla;

    public LocalDateTime getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(LocalDateTime fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

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
}
