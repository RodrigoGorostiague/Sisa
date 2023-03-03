package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacuna", schema = "vacunacion")
public class Vacuna {
    @Id
    @Column(name = "codigovacuna")
    private String codigoVacuna;
    @Column(name = "nombrevacuna")
    private String nombreVacuna;
    private String composicion;
    @Column(name = "edadminima")
    private Integer edadMinima;
    @Column(name = "tipoedadminima")
    private String tipoEdadMinima;
    @Column(name = "edadmaxima")
    private Integer edadMaxima;
    @Column(name = "tipoedadmaxima")
    private String tipoEdadMaxima;
    @Column(name = "tiempoultimavacuna")
    private Integer tiempoUltimaVacuna;
    private String habilitada;
    @Column(name = "ctrlqryesquema")
    private String ctrlQuerryEsquema;

    public String getCodigoVacuna() {
        return codigoVacuna;
    }

    public void setCodigoVacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getTipoEdadMinima() {
        return tipoEdadMinima;
    }

    public void setTipoEdadMinima(String tipoEdadMinima) {
        this.tipoEdadMinima = tipoEdadMinima;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public String getTipoEdadMaxima() {
        return tipoEdadMaxima;
    }

    public void setTipoEdadMaxima(String tipoEdadMaxima) {
        this.tipoEdadMaxima = tipoEdadMaxima;
    }

    public Integer getTiempoUltimaVacuna() {
        return tiempoUltimaVacuna;
    }

    public void setTiempoUltimaVacuna(Integer tiempoUltimaVacuna) {
        this.tiempoUltimaVacuna = tiempoUltimaVacuna;
    }

    public String getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(String habilitada) {
        this.habilitada = habilitada;
    }

    public String getCtrlQuerryEsquema() {
        return ctrlQuerryEsquema;
    }

    public void setCtrlQuerryEsquema(String ctrlQuerryEsquema) {
        this.ctrlQuerryEsquema = ctrlQuerryEsquema;
    }
}
