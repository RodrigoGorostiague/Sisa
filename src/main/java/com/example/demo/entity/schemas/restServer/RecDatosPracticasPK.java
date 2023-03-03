package com.example.demo.entity.schemas.restServer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RecDatosPracticasPK implements Serializable {
    @Column(name = "codigopractica")
    private String codigoPractica;
    private String descripcion;
    private String sector;
    @Column(name = "codigooms")
    private Integer codigoOms;
    @Column(name = "unidadesrad")
    private Integer unidadEsRad;
    private String habilitado;
    @Column(name = "usaplaca")
    private String usaPlaca;
    private String recomendaciones;
    @Column(name = "derutinaguardia")
    private String derUtinaGuardia;

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getCodigoOms() {
        return codigoOms;
    }

    public void setCodigoOms(Integer codigoOms) {
        this.codigoOms = codigoOms;
    }

    public Integer getUnidadEsRad() {
        return unidadEsRad;
    }

    public void setUnidadEsRad(Integer unidadEsRad) {
        this.unidadEsRad = unidadEsRad;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public String getUsaPlaca() {
        return usaPlaca;
    }

    public void setUsaPlaca(String usaPlaca) {
        this.usaPlaca = usaPlaca;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getDerUtinaGuardia() {
        return derUtinaGuardia;
    }

    public void setDerUtinaGuardia(String derUtinaGuardia) {
        this.derUtinaGuardia = derUtinaGuardia;
    }
}
