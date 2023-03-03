package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientoplacas", schema = "radiologia")
public class MovimientoPlacas {
    @EmbeddedId
    private MovimientoPlacasPK id;
    @Column(name = "motivobaja")
    private String motivoBaja;
    private Integer cantidad;

    public MovimientoPlacasPK getId() {
        return id;
    }

    public void setId(MovimientoPlacasPK id) {
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
}
