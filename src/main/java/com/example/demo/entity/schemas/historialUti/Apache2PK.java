package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Apache2PK implements Serializable {
    private String parametro;
    @Column(name = "valordesde")
    private Integer valorDesde;
    @Column(name = "valorhasta")
    private Integer valorHasta;

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public Integer getValorDesde() {
        return valorDesde;
    }

    public void setValorDesde(Integer valorDesde) {
        this.valorDesde = valorDesde;
    }

    public Integer getValorHasta() {
        return valorHasta;
    }

    public void setValorHasta(Integer valorHasta) {
        this.valorHasta = valorHasta;
    }
}
