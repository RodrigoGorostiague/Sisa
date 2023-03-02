package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EstadoHistoPatPK implements Serializable {
    @Column(name = "nroinforme")
    private Integer nroInforme;
    @Column(name = "nrolinea")
    private Integer nroLinea;

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }
}
