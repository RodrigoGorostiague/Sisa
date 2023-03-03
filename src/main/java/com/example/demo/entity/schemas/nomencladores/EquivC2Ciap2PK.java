package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EquivC2Ciap2PK implements Serializable {
    @Column(name = "codigoc2")
    private String codigoC2;
    @Column(name = "codigociap2")
    private String codigoCiap2;

    public String getCodigoC2() {
        return codigoC2;
    }

    public void setCodigoC2(String codigoC2) {
        this.codigoC2 = codigoC2;
    }

    public String getCodigoCiap2() {
        return codigoCiap2;
    }

    public void setCodigoCiap2(String codigoCiap2) {
        this.codigoCiap2 = codigoCiap2;
    }
}
