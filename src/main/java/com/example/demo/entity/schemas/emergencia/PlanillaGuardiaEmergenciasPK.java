package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PlanillaGuardiaEmergenciasPK implements Serializable {
    @Column(name = "nrocon")
    private Integer nrocon;
    private String uniat;

    public Integer getNrocon() {
        return nrocon;
    }

    public void setNrocon(Integer nrocon) {
        this.nrocon = nrocon;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }
}
