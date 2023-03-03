package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AcumuladoEstadisticoAuxPK implements Serializable {
    private Integer anio;
    private Integer mes;
    @Column(name = "codigouniat")
    private String codigoUniat;
    private Integer servicio;
    private Integer indicador;

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public Integer getIndicador() {
        return indicador;
    }

    public void setIndicador(Integer indicador) {
        this.indicador = indicador;
    }
}
