package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ConsultaApsCleoPK implements Serializable {
    private String uniat;
    @Column(name = "nroConsulta")
    private Integer nroconsulta;

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public Integer getNroconsulta() {
        return nroconsulta;
    }

    public void setNroconsulta(Integer nroconsulta) {
        this.nroconsulta = nroconsulta;
    }
}
