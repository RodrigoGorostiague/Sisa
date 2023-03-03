package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "analisis", schema = "laboratorio_2009")
public class Analisis {
    @EmbeddedId
    private AnalisisPK id;
    @Column(name = "codigonroanalisis")
    private Integer codigoNroAnalisis;
    @Column(name = "codigotextoanalisis")
    private String codigoTextoAnalisis;
    @Column(name = "nombreanalisis")
    private String nombreAnalisis;
    private String estado;
    @Column(name = "unidadlab")
    private Integer unidadLab;

    public AnalisisPK getId() {
        return id;
    }

    public void setId(AnalisisPK id) {
        this.id = id;
    }

    public Integer getCodigoNroAnalisis() {
        return codigoNroAnalisis;
    }

    public void setCodigoNroAnalisis(Integer codigoNroAnalisis) {
        this.codigoNroAnalisis = codigoNroAnalisis;
    }

    public String getCodigoTextoAnalisis() {
        return codigoTextoAnalisis;
    }

    public void setCodigoTextoAnalisis(String codigoTextoAnalisis) {
        this.codigoTextoAnalisis = codigoTextoAnalisis;
    }

    public String getNombreAnalisis() {
        return nombreAnalisis;
    }

    public void setNombreAnalisis(String nombreAnalisis) {
        this.nombreAnalisis = nombreAnalisis;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getUnidadLab() {
        return unidadLab;
    }

    public void setUnidadLab(Integer unidadLab) {
        this.unidadLab = unidadLab;
    }
}
