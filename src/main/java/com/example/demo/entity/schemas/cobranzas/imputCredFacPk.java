package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class imputCredFacPk implements Serializable {
    private Date fecha;
    private String sucursal;
    private Integer factura;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
