package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ComposicionAnalisisPK implements Serializable {
    private Integer analisis;
    @Column(name = "analisisdeterminacion")
    private Integer analisisDeterminacion;
    private String destino;

    public Integer getAnalisis() {
        return analisis;
    }

    public void setAnalisis(Integer analisis) {
        this.analisis = analisis;
    }

    public Integer getAnalisisDeterminacion() {
        return analisisDeterminacion;
    }

    public void setAnalisisDeterminacion(Integer analisisDeterminacion) {
        this.analisisDeterminacion = analisisDeterminacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
