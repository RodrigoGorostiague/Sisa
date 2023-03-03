package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "placasinforme", schema = "radiologia")
public class PlacasInforme {
    @EmbeddedId
    private PlacasInformePK id;
    private Integer cantidad;

    public PlacasInformePK getId() {
        return id;
    }

    public void setId(PlacasInformePK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
