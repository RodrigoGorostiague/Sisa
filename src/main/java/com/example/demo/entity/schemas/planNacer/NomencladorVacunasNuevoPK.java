package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NomencladorVacunasNuevoPK implements Serializable {
    @Column(name = "codigoestudioplan")
    private String codigoEstudioPlan;
    @Column(name = "codigodosis")
    private String codigoDosis;

    public String getCodigoEstudioPlan() {
        return codigoEstudioPlan;
    }

    public void setCodigoEstudioPlan(String codigoEstudioPlan) {
        this.codigoEstudioPlan = codigoEstudioPlan;
    }

    public String getCodigoDosis() {
        return codigoDosis;
    }

    public void setCodigoDosis(String codigoDosis) {
        this.codigoDosis = codigoDosis;
    }
}
