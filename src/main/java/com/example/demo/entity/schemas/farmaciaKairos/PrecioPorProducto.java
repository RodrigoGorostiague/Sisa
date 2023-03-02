package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "precioporproducto", schema = "farmacia_kairos")
public class PrecioPorProducto {
    @EmbeddedId
    private PrecioPorProductoPK id;
    private Integer precio;
    @Column(name = "fechavigencia")
    private Date fechaVigencia;

    public PrecioPorProductoPK getId() {
        return id;
    }

    public void setId(PrecioPorProductoPK id) {
        this.id = id;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }
}
