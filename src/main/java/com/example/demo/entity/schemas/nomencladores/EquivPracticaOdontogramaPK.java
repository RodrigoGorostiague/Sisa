package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EquivPracticaOdontogramaPK implements Serializable {
    @Column(name = "codigoodontograma")
    private String codigoOdontograma;
    @Column(name = "codigopractica")
    private String codigoPractica;

    public String getCodigoOdontograma() {
        return codigoOdontograma;
    }

    public void setCodigoOdontograma(String codigoOdontograma) {
        this.codigoOdontograma = codigoOdontograma;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }
}
