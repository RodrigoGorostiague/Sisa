package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ImputCobroFacPK implements Serializable {
    @Column(name = "nro_cobro")
    private Integer nroCobro;
    private String sucursal;
    private Integer factura;

    public Integer getNroCobro() {
        return nroCobro;
    }

    public void setNroCobro(Integer nroCobro) {
        this.nroCobro = nroCobro;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getFactura() {
        return factura;
    }

    public void setFactura(Integer factura) {
        this.factura = factura;
    }
}
