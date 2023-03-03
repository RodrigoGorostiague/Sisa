package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EvalPreanesItemSotrPK implements Serializable {
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @Column(name = "codigoitotr")
    private Integer codigoItotr;

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public Integer getCodigoItotr() {
        return codigoItotr;
    }

    public void setCodigoItotr(Integer codigoItotr) {
        this.codigoItotr = codigoItotr;
    }
}
