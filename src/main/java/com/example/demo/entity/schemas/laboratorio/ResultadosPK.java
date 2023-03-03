package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class ResultadosPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="nroprotocolo", referencedColumnName = "nroprotocolo"),
            @JoinColumn(name = "nroanalisis", referencedColumnName = "nroanalisis")
    })
    private Analisis analisis;
    @Column(name = "nrodeterminacion")
    private Integer nroDeTerminacion;

    public Analisis getAnalisis() {
        return analisis;
    }

    public void setAnalisis(Analisis analisis) {
        this.analisis = analisis;
    }

    public Integer getNroDeTerminacion() {
        return nroDeTerminacion;
    }

    public void setNroDeTerminacion(Integer nroDeTerminacion) {
        this.nroDeTerminacion = nroDeTerminacion;
    }
}
