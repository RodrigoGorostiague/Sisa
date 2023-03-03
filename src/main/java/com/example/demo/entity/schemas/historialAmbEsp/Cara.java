package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "cara")
public class Cara {
    @EmbeddedId
    private CaraPK id;
    private String descripcion;
    @Column(name = "trapezoide")
    private String trapezoide;
    private String observaciones;

    public CaraPK getId() {
        return id;
    }

    public void setId(CaraPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTrapezoide() {
        return trapezoide;
    }

    public void setTrapezoide(String trapezoide) {
        this.trapezoide = trapezoide;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
