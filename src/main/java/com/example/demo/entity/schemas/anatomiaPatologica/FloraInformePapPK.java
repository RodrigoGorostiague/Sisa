package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FloraInformePapPK implements Serializable {
    @Column(name = "nroinforme")
    private Integer nroInforme;
    @Column(name = "codigoflora")
    private String codigoFlora;

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }

    public String getCodigoFlora() {
        return codigoFlora;
    }

    public void setCodigoFlora(String codigoFlora) {
        this.codigoFlora = codigoFlora;
    }
}
