package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ResultadoPK implements Serializable {
    @Column(name = "numeroorden")
    private Integer numeroOrden;
    private Integer analisis;
    private Integer determinacion;
    private Integer categoria;
    private Integer version;

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

    public Integer getDeterminacion() {
        return determinacion;
    }

    public void setDeterminacion(Integer determinacion) {
        this.determinacion = determinacion;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
