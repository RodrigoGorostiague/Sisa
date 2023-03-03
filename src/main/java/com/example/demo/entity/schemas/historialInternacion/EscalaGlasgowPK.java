package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class EscalaGlasgowPK implements Serializable {
    @Column(name = "areaevaluada")
    private String areaEvaluada;
    private Integer puntuacion;
    @Column(name = "edaddesde")
    private Date edadDesde;
    @Column(name = "edadhasta")
    private Date edadHasta;

    public String getAreaEvaluada() {
        return areaEvaluada;
    }

    public void setAreaEvaluada(String areaEvaluada) {
        this.areaEvaluada = areaEvaluada;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getEdadDesde() {
        return edadDesde;
    }

    public void setEdadDesde(Date edadDesde) {
        this.edadDesde = edadDesde;
    }

    public Date getEdadHasta() {
        return edadHasta;
    }

    public void setEdadHasta(Date edadHasta) {
        this.edadHasta = edadHasta;
    }
}
