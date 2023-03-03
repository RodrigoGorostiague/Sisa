package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EquivC2Cie10PK implements Serializable {
    @Column(name = "codigoc2")
    private String codigoC2;
    @Column(name = "codigocie10")
    private String codigoCie10;

    public String getCodigoC2() {
        return codigoC2;
    }

    public void setCodigoC2(String codigoC2) {
        this.codigoC2 = codigoC2;
    }

    public String getCodigoCie10() {
        return codigoCie10;
    }

    public void setCodigoCie10(String codigoCie10) {
        this.codigoCie10 = codigoCie10;
    }
}
