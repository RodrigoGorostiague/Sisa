package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dosisvacuna", schema = "vacunacion")
public class DosisVacuna {
    @Id
    @Column(name = "codigodosis")
    private String codigoDosis;
    @Column(name = "nombredosis")
    private String nombreDosis;
    @Column(name = "edadenesquema")
    private Integer edadEnEsquema;
    @Column(name = "tipoedadenesquema")
    private String tipoEdadEnEsquema;
    private String observaciones;
    private String habilitada;
    @Column(name = "encalendario")
    private String enCalendario;
    @Column(name = "edadencal")
    private Integer edadEnCal;
    @Column(name = "tipoedadencal")
    private String tipoEdadEnCal;

    public String getCodigoDosis() {
        return codigoDosis;
    }

    public void setCodigoDosis(String codigoDosis) {
        this.codigoDosis = codigoDosis;
    }

    public String getNombreDosis() {
        return nombreDosis;
    }

    public void setNombreDosis(String nombreDosis) {
        this.nombreDosis = nombreDosis;
    }

    public Integer getEdadEnEsquema() {
        return edadEnEsquema;
    }

    public void setEdadEnEsquema(Integer edadEnEsquema) {
        this.edadEnEsquema = edadEnEsquema;
    }

    public String getTipoEdadEnEsquema() {
        return tipoEdadEnEsquema;
    }

    public void setTipoEdadEnEsquema(String tipoEdadEnEsquema) {
        this.tipoEdadEnEsquema = tipoEdadEnEsquema;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(String habilitada) {
        this.habilitada = habilitada;
    }

    public String getEnCalendario() {
        return enCalendario;
    }

    public void setEnCalendario(String enCalendario) {
        this.enCalendario = enCalendario;
    }

    public Integer getEdadEnCal() {
        return edadEnCal;
    }

    public void setEdadEnCal(Integer edadEnCal) {
        this.edadEnCal = edadEnCal;
    }

    public String getTipoEdadEnCal() {
        return tipoEdadEnCal;
    }

    public void setTipoEdadEnCal(String tipoEdadEnCal) {
        this.tipoEdadEnCal = tipoEdadEnCal;
    }
}
