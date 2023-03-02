package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RangoRecibosPK implements Serializable {
    private Integer anio;
    private String sucursal;
    @Column(name = "n_comprob_desde")
    private Integer NComprobDesde;
    @Column(name = "n_comprob_hasta")
    private Integer NComprobHasta;

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getNComprobDesde() {
        return NComprobDesde;
    }

    public void setNComprobDesde(Integer NComprobDesde) {
        this.NComprobDesde = NComprobDesde;
    }

    public Integer getNComprobHasta() {
        return NComprobHasta;
    }

    public void setNComprobHasta(Integer NComprobHasta) {
        this.NComprobHasta = NComprobHasta;
    }
}
