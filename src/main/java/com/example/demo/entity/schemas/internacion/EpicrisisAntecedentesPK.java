package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EpicrisisAntecedentesPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private String codigoantecedente;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getCodigoantecedente() {
        return codigoantecedente;
    }

    public void setCodigoantecedente(String codigoantecedente) {
        this.codigoantecedente = codigoantecedente;
    }
}
