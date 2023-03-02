package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "reimput_cobro")
public class ReImputCobro {
    @EmbeddedId
    private ReImputCobroPK id;
    private Double cobrado;
    private String observaciones;

    public ReImputCobroPK getId() {
        return id;
    }

    public void setId(ReImputCobroPK id) {
        this.id = id;
    }

    public Double getCobrado() {
        return cobrado;
    }

    public void setCobrado(Double cobrado) {
        this.cobrado = cobrado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
