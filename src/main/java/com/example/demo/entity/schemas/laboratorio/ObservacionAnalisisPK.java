package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ObservacionAnalisisPK implements Serializable {
    @Column(name = "numeroorden")
    private Integer numeroOrden;
    private Integer analisis;

    public Integer getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(Integer numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Integer getAnalisis() {
        return analisis;
    }

    public void setAnalisis(Integer analisis) {
        this.analisis = analisis;
    }
}
