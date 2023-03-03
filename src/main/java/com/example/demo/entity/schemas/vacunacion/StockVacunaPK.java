package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StockVacunaPK implements Serializable {
    private String uniat;
    @Column(name = "codigovacuna")
    private String codigoVacuna;
    @Column(name = "numlote")
    private String numLote;

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getCodigoVacuna() {
        return codigoVacuna;
    }

    public void setCodigoVacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }
}
