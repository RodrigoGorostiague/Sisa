package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mapeoprocedencias", schema = "laboratorio_2009")
public class MapeoProcedencias {
    @EmbeddedId
    private MapeoProcedenciasPK id;
    private String origen;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "tipoproc")
    private String tipoProc;
    @Column(name = "tipoorigenestadistica")
    private String tipoOrigenEstadistica;
    @Column(name = "habilitadoconsultas")
    private String habilitadoConsultas;

    public MapeoProcedenciasPK getId() {
        return id;
    }

    public void setId(MapeoProcedenciasPK id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public String getTipoProc() {
        return tipoProc;
    }

    public void setTipoProc(String tipoProc) {
        this.tipoProc = tipoProc;
    }

    public String getTipoOrigenEstadistica() {
        return tipoOrigenEstadistica;
    }

    public void setTipoOrigenEstadistica(String tipoOrigenEstadistica) {
        this.tipoOrigenEstadistica = tipoOrigenEstadistica;
    }

    public String getHabilitadoConsultas() {
        return habilitadoConsultas;
    }

    public void setHabilitadoConsultas(String habilitadoConsultas) {
        this.habilitadoConsultas = habilitadoConsultas;
    }
}
