package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AccidentadoEmergenciasDeletePK implements Serializable {
    @Column(name = "nrocon")
    private Integer nroCon;
    private String uniat;

    public Integer getNroCon() {
        return nroCon;
    }

    public void setNroCon(Integer nroCon) {
        this.nroCon = nroCon;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }
}
