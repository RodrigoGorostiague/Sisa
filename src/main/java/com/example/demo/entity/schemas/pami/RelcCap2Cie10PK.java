package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RelcCap2Cie10PK implements Serializable {
    @Column(name = "codigociap")
    private String codigoCiap;
    @Column(name = "codigocie10")
    private String codigoCie10;

    public String getCodigoCiap() {
        return codigoCiap;
    }

    public void setCodigoCiap(String codigoCiap) {
        this.codigoCiap = codigoCiap;
    }

    public String getCodigoCie10() {
        return codigoCie10;
    }

    public void setCodigoCie10(String codigoCie10) {
        this.codigoCie10 = codigoCie10;
    }
}
