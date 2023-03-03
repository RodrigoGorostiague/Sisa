package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "piezadentaria")
public class PiezaDentaria {
    @Id
    @Column(name = "nropieza")
    private Integer nroPieza;
    private Integer x;
    private Integer y;
    private String observaciones;

    public Integer getNroPieza() {
        return nroPieza;
    }

    public void setNroPieza(Integer nroPieza) {
        this.nroPieza = nroPieza;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
