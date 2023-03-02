package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AccionesPrestacionesPK implements Serializable {
    private String prestacion;
    private Integer nroOrden;
    @Column(name = "codigouniat")
    private String codigoUniat;

    public String getPrestacion() {
        return prestacion;
    }

    public void setPrestacion(String prestacion) {
        this.prestacion = prestacion;
    }

    public Integer getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(Integer nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
