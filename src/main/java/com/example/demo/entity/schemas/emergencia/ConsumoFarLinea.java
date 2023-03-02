package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "consumofarlinea")
public class ConsumoFarLinea {
    @EmbeddedId
    private ConsumoFarLineaPK id;
    private Integer cantidad;
    @Column(name = "ultpreciovta")
    private Integer ultPrecioVenta;
    private String dosis;

    public ConsumoFarLineaPK getIdç() {
        return id;
    }

    public void setId(ConsumoFarLineaPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getUltPrecioVenta() {
        return ultPrecioVenta;
    }

    public void setUltPrecioVenta(Integer ultPrecioVenta) {
        this.ultPrecioVenta = ultPrecioVenta;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}
