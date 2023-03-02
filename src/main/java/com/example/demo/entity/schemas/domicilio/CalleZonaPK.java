package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class CalleZonaPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "calle", referencedColumnName = "nombre")
    private CalleBarrioParajeZona calleBarrioParajeZona;
    @ManyToOne
    @JoinColumn(name = "codigozona", referencedColumnName = "codigozona")
    private ZonasTandil zonasTandil;
    @Column(name = "nroini")
    private Integer nroIni;
    @Column(name = "nrofin")
    private Integer nroFin;
    private String vereda;

    public CalleBarrioParajeZona getCalleBarrioParajeZona() {
        return calleBarrioParajeZona;
    }

    public void setCalleBarrioParajeZona(CalleBarrioParajeZona calleBarrioParajeZona) {
        this.calleBarrioParajeZona = calleBarrioParajeZona;
    }

    public ZonasTandil getZonasTandil() {
        return zonasTandil;
    }

    public void setZonasTandil(ZonasTandil zonasTandil) {
        this.zonasTandil = zonasTandil;
    }

    public Integer getNroIni() {
        return nroIni;
    }

    public void setNroIni(Integer nroIni) {
        this.nroIni = nroIni;
    }

    public Integer getNroFin() {
        return nroFin;
    }

    public void setNroFin(Integer nroFin) {
        this.nroFin = nroFin;
    }

    public String getVereda() {
        return vereda;
    }

    public void setVereda(String vereda) {
        this.vereda = vereda;
    }
}
