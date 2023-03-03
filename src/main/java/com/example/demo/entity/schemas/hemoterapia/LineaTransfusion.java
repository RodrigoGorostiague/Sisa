package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity

@Table(schema = "hemoterapia", name = "LineaTransfusion")
public class LineaTransfusion {
    @EmbeddedId
    private LineaTransfusionPK id;
    @Column(name = "codigoProducto")
    private String codigoProducto;
    private Integer volumen;
    private String unidad;

    public LineaTransfusionPK getId() {
        return id;
    }

    public void setId(LineaTransfusionPK id) {
        this.id = id;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
