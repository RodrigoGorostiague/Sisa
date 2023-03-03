package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RestriccionesPrestadoraSectorPK implements Serializable {
    @Column(name = "codigoprestadora")
    private String codigoPrestadora;
    @Column(name = "codigosector")
    private String codigoSector;

    public String getCodigoPrestadora() {
        return codigoPrestadora;
    }

    public void setCodigoPrestadora(String codigoPrestadora) {
        this.codigoPrestadora = codigoPrestadora;
    }

    public String getCodigoSector() {
        return codigoSector;
    }

    public void setCodigoSector(String codigoSector) {
        this.codigoSector = codigoSector;
    }
}
