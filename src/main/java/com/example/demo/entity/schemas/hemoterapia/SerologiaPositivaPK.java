package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SerologiaPositivaPK implements Serializable {
    @Column(name = "nrodonacion")
    private String nroDonacion;
    @Column(name = "codigoserologia")
    private String codigoSerologia;

    public String getNroDonacion() {
        return nroDonacion;
    }

    public void setNroDonacion(String nroDonacion) {
        this.nroDonacion = nroDonacion;
    }

    public String getCodigoSerologia() {
        return codigoSerologia;
    }

    public void setCodigoSerologia(String codigoSerologia) {
        this.codigoSerologia = codigoSerologia;
    }
}
