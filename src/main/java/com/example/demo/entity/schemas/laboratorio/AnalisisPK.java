package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class AnalisisPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nroprotocolo", referencedColumnName = "nroprotocolo")
    private Orden orden;
    @Column(name = "nroanalisis")
    private Integer nroAnalisis;

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Integer getNroAnalisis() {
        return nroAnalisis;
    }

    public void setNroAnalisis(Integer nroAnalisis) {
        this.nroAnalisis = nroAnalisis;
    }
}
