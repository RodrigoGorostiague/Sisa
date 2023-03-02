package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LimCalMuestraInfPapPK implements Serializable {
    @Column(name = "nroinforme")
    private Integer nroInforme;
    @Column(name = "codigolim")
    private String codigoLim;

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }

    public String getCodigoLim() {
        return codigoLim;
    }

    public void setCodigoLim(String codigoLim) {
        this.codigoLim = codigoLim;
    }
}
