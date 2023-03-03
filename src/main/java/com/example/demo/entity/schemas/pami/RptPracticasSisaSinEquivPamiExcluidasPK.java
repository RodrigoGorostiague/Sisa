package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RptPracticasSisaSinEquivPamiExcluidasPK implements Serializable {
    private String tipo;
    private String sector;
    private String codigoSisa;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCodigoSisa() {
        return codigoSisa;
    }

    public void setCodigoSisa(String codigoSisa) {
        this.codigoSisa = codigoSisa;
    }
}
