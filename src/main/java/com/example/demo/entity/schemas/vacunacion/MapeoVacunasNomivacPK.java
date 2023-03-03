package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MapeoVacunasNomivacPK implements Serializable {
    @Column(name = "idsnivacuna")
    private String idSniVacuna;
    @Column(name = "snidosisorden")
    private String sniDosisOrden;

    public String getIdSniVacuna() {
        return idSniVacuna;
    }

    public void setIdSniVacuna(String idSniVacuna) {
        this.idSniVacuna = idSniVacuna;
    }

    public String getSniDosisOrden() {
        return sniDosisOrden;
    }

    public void setSniDosisOrden(String sniDosisOrden) {
        this.sniDosisOrden = sniDosisOrden;
    }
}
