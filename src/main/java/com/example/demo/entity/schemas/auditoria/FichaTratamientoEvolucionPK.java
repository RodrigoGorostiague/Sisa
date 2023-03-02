package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class FichaTratamientoEvolucionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
