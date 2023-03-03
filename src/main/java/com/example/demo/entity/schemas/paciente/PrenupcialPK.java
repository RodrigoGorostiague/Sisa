package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PrenupcialPK implements Serializable {
    @Column(name = "idpaciente")
    private String idPaciente;
    @Column(name = "fechacasamiento")
    private Date fechaCasamiento;

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaCasamiento() {
        return fechaCasamiento;
    }

    public void setFechaCasamiento(Date fechaCasamiento) {
        this.fechaCasamiento = fechaCasamiento;
    }
}
