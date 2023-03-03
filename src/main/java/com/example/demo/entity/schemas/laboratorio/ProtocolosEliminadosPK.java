package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ProtocolosEliminadosPK implements Serializable {
    private Integer anio;
    @Column(name = "nroprotocolo")
    private Integer nroProtocolo;

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNroProtocolo() {
        return nroProtocolo;
    }

    public void setNroProtocolo(Integer nroProtocolo) {
        this.nroProtocolo = nroProtocolo;
    }
}
