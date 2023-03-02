package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class PresentacionPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigoproducto",referencedColumnName = "codigo")
    private Producto producto;
    @Column(name = "codigopresentacion")
    private Integer codigoPresentacion;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCodigoPresentacion() {
        return codigoPresentacion;
    }

    public void setCodigoPresentacion(Integer codigoPresentacion) {
        this.codigoPresentacion = codigoPresentacion;
    }
}
