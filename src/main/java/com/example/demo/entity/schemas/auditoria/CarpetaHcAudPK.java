package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class CarpetaHcAudPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "historiaclinica")
    private Integer historiaClinica;
    private String codigouniat;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(Integer historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getCodigouniat() {
        return codigouniat;
    }

    public void setCodigouniat(String codigouniat) {
        this.codigouniat = codigouniat;
    }
}
