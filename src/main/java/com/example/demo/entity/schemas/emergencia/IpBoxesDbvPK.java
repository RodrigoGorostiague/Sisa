package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class IpBoxesDbvPK implements Serializable {
    @Column(name = "nrocon")
    private Integer nroCon;
    @Column(name = "codigouniat")
    private String codigoUniat;

    public Integer getNroCon() {
        return nroCon;
    }

    public void setNroCon(Integer nroCon) {
        this.nroCon = nroCon;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
