package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "insumosprestaciones")
public class InsumosPrestaciones {
    @EmbeddedId
    private InsumosPrestacionesPK id;
    private Integer clase;
    private String  insumo;
    private Integer item;
    private Integer cantidad;

    public InsumosPrestacionesPK getId() {
        return id;
    }

    public void setId(InsumosPrestacionesPK id) {
        this.id = id;
    }

    public Integer getClase() {
        return clase;
    }

    public void setClase(Integer clase) {
        this.clase = clase;
    }

    public String getInsumo() {
        return insumo;
    }

    public void setInsumo(String insumo) {
        this.insumo = insumo;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
