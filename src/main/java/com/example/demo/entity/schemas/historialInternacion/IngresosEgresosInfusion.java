package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "ingresosegresosinfusion")
public class IngresosEgresosInfusion {
    @EmbeddedId
    private IngresosEgresosInfusionPK id;
    private Integer cantidad;

    public IngresosEgresosInfusionPK getId() {
        return id;
    }

    public void setId(IngresosEgresosInfusionPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
