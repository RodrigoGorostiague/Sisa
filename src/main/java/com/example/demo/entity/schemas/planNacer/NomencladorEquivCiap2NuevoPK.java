package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NomencladorEquivCiap2NuevoPK implements Serializable {
    @Column(name = "codigoestudioplan")
    private String codigoEstudioPlan;
    @Column(name = "codigociap2")
    private String codigoCiap2;

    public String getCodigoEstudioPlan() {
        return codigoEstudioPlan;
    }

    public void setCodigoEstudioPlan(String codigoEstudioPlan) {
        this.codigoEstudioPlan = codigoEstudioPlan;
    }

    public String getCodigoCiap2() {
        return codigoCiap2;
    }

    public void setCodigoCiap2(String codigoCiap2) {
        this.codigoCiap2 = codigoCiap2;
    }
}
