package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RestriccionesCoberturaPracticaPK implements Serializable {
    @Column(name = "codigoobrasocial")
    private Integer codigoObraSocial;
    @Column(name = "codigopractica")
    private String codigoPractica;

    public Integer getCodigoObraSocial() {
        return codigoObraSocial;
    }

    public void setCodigoObraSocial(Integer codigoObraSocial) {
        this.codigoObraSocial = codigoObraSocial;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }
}
