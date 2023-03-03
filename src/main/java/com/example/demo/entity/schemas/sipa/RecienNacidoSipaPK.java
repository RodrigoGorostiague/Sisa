package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class RecienNacidoSipaPK implements Serializable {
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaingresoplanilla")
    private Date fechaIngresoPlanilla;
    @Column(name = "idpacientern")
    private Integer idPacienteRn;

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

    public Integer getIdPacienteRn() {
        return idPacienteRn;
    }

    public void setIdPacienteRn(Integer idPacienteRn) {
        this.idPacienteRn = idPacienteRn;
    }
}
