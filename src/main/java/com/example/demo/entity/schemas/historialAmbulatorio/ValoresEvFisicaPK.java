package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ValoresEvFisicaPK implements Serializable {
    @Column(name = "edadini")
    private Integer edadIni;
    @Column(name = "edadfin")
    private Integer edadFin;
    private String sexo;

    public Integer getEdadIni() {
        return edadIni;
    }

    public void setEdadIni(Integer edadIni) {
        this.edadIni = edadIni;
    }

    public Integer getEdadFin() {
        return edadFin;
    }

    public void setEdadFin(Integer edadFin) {
        this.edadFin = edadFin;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
