package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MontajeInformePK implements Serializable {
    private String uniat;
    @Column(name = "nroinforme")
    private String nroInforme;
    @Column(name = "codigomontaje")
    private String codigoMontaje;

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(String nroInforme) {
        this.nroInforme = nroInforme;
    }

    public String getCodigoMontaje() {
        return codigoMontaje;
    }

    public void setCodigoMontaje(String codigoMontaje) {
        this.codigoMontaje = codigoMontaje;
    }
}
