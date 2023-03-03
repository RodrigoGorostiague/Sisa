package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NomencladorImagenesNuevoPK implements Serializable {
    @Column(name = "codigoestudioplan")
    private String codigoEstudioPlan;
    @Column(name = "codigopractica")
    private String codigoPractica;

    public String getCodigoEstudioPlan() {
        return codigoEstudioPlan;
    }

    public void setCodigoEstudioPlan(String codigoEstudioPlan) {
        this.codigoEstudioPlan = codigoEstudioPlan;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }
}
