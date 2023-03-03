package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CorrespondenciasIhosPK implements Serializable {
    @Column(name = "idpacientesihos")
    private Integer idPacientesIhos;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public Integer getIdPacientesIhos() {
        return idPacientesIhos;
    }

    public void setIdPacientesIhos(Integer idPacientesIhos) {
        this.idPacientesIhos = idPacientesIhos;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
