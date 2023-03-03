package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ImcSobrepeso2a15aniosPK implements Serializable {
    @Column(name = "edadmesesini")
    private Integer edadMesesIni;
    @Column(name = "edadmesesfin")
    private Integer edadMesesFin;

    public Integer getEdadMesesIni() {
        return edadMesesIni;
    }

    public void setEdadMesesIni(Integer edadMesesIni) {
        this.edadMesesIni = edadMesesIni;
    }

    public Integer getEdadMesesFin() {
        return edadMesesFin;
    }

    public void setEdadMesesFin(Integer edadMesesFin) {
        this.edadMesesFin = edadMesesFin;
    }
}
