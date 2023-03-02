package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class InformeEegPK implements Serializable {
    @Column(name = "uniateeg")
    private String uniatEeg;
    @Column(name = "nroinforme")
    private String nroInforme;

    public String getUniatEeg() {
        return uniatEeg;
    }

    public void setUniatEeg(String uniatEeg) {
        this.uniatEeg = uniatEeg;
    }

    public String getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(String nroInforme) {
        this.nroInforme = nroInforme;
    }
}
