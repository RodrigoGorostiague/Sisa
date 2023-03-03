package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bajavacunas", schema = "vacunacion")
public class BajaVacunas {
    @EmbeddedId
    private BajaVacunasPK id;
    @Column(name = "motivobaja")
    private String motivoBaja;
    private Integer cantidad;
    private String observaciones;

    public BajaVacunasPK getId() {
        return id;
    }

    public void setId(BajaVacunasPK id) {
        this.id = id;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
