package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EquinomquiPrestintPK implements Serializable {
    @Column(name = "codigonomqui")
    private String codigoNomqui;
    @Column(name = "codigopretint")
    private String codigoPretint;

    public String getCodigoNomqui() {
        return codigoNomqui;
    }

    public void setCodigoNomqui(String codigoNomqui) {
        this.codigoNomqui = codigoNomqui;
    }

    public String getCodigoPretint() {
        return codigoPretint;
    }

    public void setCodigoPretint(String codigoPretint) {
        this.codigoPretint = codigoPretint;
    }
}
