package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NomencladorEquivOdontoPK implements Serializable {
    @Column(name = "codigoestudioplan")
    private String codigoEstudioPlan;
    @Column(name = "codigoodonto")
    private String codigoOdonto;

    public String getCodigoEstudioPlan() {
        return codigoEstudioPlan;
    }

    public void setCodigoEstudioPlan(String codigoEstudioPlan) {
        this.codigoEstudioPlan = codigoEstudioPlan;
    }

    public String getCodigoOdonto() {
        return codigoOdonto;
    }

    public void setCodigoOdonto(String codigoOdonto) {
        this.codigoOdonto = codigoOdonto;
    }
}
