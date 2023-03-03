package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class VelaHcPacPK implements Serializable {
    @Column(name = "historiaclinica")
    private Integer historiaClinica;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public Integer getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(Integer historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
