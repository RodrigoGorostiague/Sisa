package com.example.demo.entity.schemas.historico;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class CarpetaHcPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "historiaclinica")
    private Integer historiaclinica;
    @Column(name = "codigouniat")
    private String codigoUniat;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getHistoriaclinica() {
        return historiaclinica;
    }

    public void setHistoriaclinica(Integer historiaclinica) {
        this.historiaclinica = historiaclinica;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
