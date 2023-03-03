package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LesionInterPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "codigolesion")
    private String codigoLesion;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getCodigoLesion() {
        return codigoLesion;
    }

    public void setCodigoLesion(String codigoLesion) {
        this.codigoLesion = codigoLesion;
    }
}
