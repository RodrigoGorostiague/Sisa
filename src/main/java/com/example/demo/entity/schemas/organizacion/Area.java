package com.example.demo.entity.schemas.organizacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "area", schema = "organizacion")
public class Area {
    @Id
    @Column(name = "codigoarea")
    private Integer codigoArea;
    private String descripcion;
    @Column(name = "descripcioncorta")
    private String descripcionCorta;
    @Column(name = "descripcionabreviada")
    private String descripcionAbreviada;
    @Column(name = "codigoorganismo")
    private String codigoOrganismo;
    @Column(name = "codigoareapadre")
    private Integer codigoAreaPadre;
    private Integer agrupamiento;
    @Column(name = "agrupamientotexto")
    private String agrupamientoTexto;
    private String tipo;
    @Column(name = "sectorfarmacia")
    private String sectorFarmacia;

    public Integer getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(Integer codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getDescripcionAbreviada() {
        return descripcionAbreviada;
    }

    public void setDescripcionAbreviada(String descripcionAbreviada) {
        this.descripcionAbreviada = descripcionAbreviada;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public Integer getCodigoAreaPadre() {
        return codigoAreaPadre;
    }

    public void setCodigoAreaPadre(Integer codigoAreaPadre) {
        this.codigoAreaPadre = codigoAreaPadre;
    }

    public Integer getAgrupamiento() {
        return agrupamiento;
    }

    public void setAgrupamiento(Integer agrupamiento) {
        this.agrupamiento = agrupamiento;
    }

    public String getAgrupamientoTexto() {
        return agrupamientoTexto;
    }

    public void setAgrupamientoTexto(String agrupamientoTexto) {
        this.agrupamientoTexto = agrupamientoTexto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSectorFarmacia() {
        return sectorFarmacia;
    }

    public void setSectorFarmacia(String sectorFarmacia) {
        this.sectorFarmacia = sectorFarmacia;
    }
}
