package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NomencladorEquivCie10NuevoPK implements Serializable {
    @Column(name = "codigoestudioplan")
    private String codigoEstudioPlan;
    @Column(name = "codigocie10")
    private String codigoCie10;
    @Column(name = "codigociap2")
    private String codigoCiap2;

    public String getCodigoEstudioPlan() {
        return codigoEstudioPlan;
    }

    public void setCodigoEstudioPlan(String codigoEstudioPlan) {
        this.codigoEstudioPlan = codigoEstudioPlan;
    }

    public String getCodigoCie10() {
        return codigoCie10;
    }

    public void setCodigoCie10(String codigoCie10) {
        this.codigoCie10 = codigoCie10;
    }

    public String getCodigoCiap2() {
        return codigoCiap2;
    }

    public void setCodigoCiap2(String codigoCiap2) {
        this.codigoCiap2 = codigoCiap2;
    }
}
