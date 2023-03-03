package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PatologiaApsVelaPK implements Serializable {
    private String uniat;
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @Column(name = "codigopatologia")
    private Integer codigoPatologia;

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public Integer getCodigoPatologia() {
        return codigoPatologia;
    }

    public void setCodigoPatologia(Integer codigoPatologia) {
        this.codigoPatologia = codigoPatologia;
    }
}
