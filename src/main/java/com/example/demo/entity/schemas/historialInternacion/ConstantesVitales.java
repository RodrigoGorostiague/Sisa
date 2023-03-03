package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "constantesvitales", schema = "historialinternacion")
public class ConstantesVitales {
    @EmbeddedId
    private ConstantesVitalesPK id;
    @Column(name = "tasistolica")
    private String taSistolica;
    @Column(name = "tadiastolica")
    private String taDiastolica;
    @Column(name = "frecrespiratoria")
    private String frecRespiratoria;
    @Column(name = "freccardiaca")
    private String frecCardiaca;
    private String temperatura;
    private String diuresis;
    private String drenajes;
    private String observaciones;
    private Integer peso;
    private Integer talla;
    private Integer imc;
    private String saturometria;
    @Column(name = "tiposaturacion")
    private String tipoSaturacion;
    private Integer servicio;
    @ManyToOne
    @JoinColumn(name = "asistenciarespiratoria", referencedColumnName = "codigo")
    private AsistenciaRespiratoria asistenciaRespiratoria;
    @Column(name = "saturacioncon_o2")
    private Integer saturacionconO2;
    @Column(name = "glucemia_tira")
    private Integer glucemiaTira;
    @Column(name = "glucemia_lab")
    private Integer glucemiaLab;

    public ConstantesVitalesPK getId() {
        return id;
    }

    public void setId(ConstantesVitalesPK id) {
        this.id = id;
    }

    public String getTaSistolica() {
        return taSistolica;
    }

    public void setTaSistolica(String taSistolica) {
        this.taSistolica = taSistolica;
    }

    public String getTaDiastolica() {
        return taDiastolica;
    }

    public void setTaDiastolica(String taDiastolica) {
        this.taDiastolica = taDiastolica;
    }

    public String getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(String frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public String getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(String frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getDiuresis() {
        return diuresis;
    }

    public void setDiuresis(String diuresis) {
        this.diuresis = diuresis;
    }

    public String getDrenajes() {
        return drenajes;
    }

    public void setDrenajes(String drenajes) {
        this.drenajes = drenajes;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public Integer getImc() {
        return imc;
    }

    public void setImc(Integer imc) {
        this.imc = imc;
    }

    public String getSaturometria() {
        return saturometria;
    }

    public void setSaturometria(String saturometria) {
        this.saturometria = saturometria;
    }

    public String getTipoSaturacion() {
        return tipoSaturacion;
    }

    public void setTipoSaturacion(String tipoSaturacion) {
        this.tipoSaturacion = tipoSaturacion;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public AsistenciaRespiratoria getAsistenciaRespiratoria() {
        return asistenciaRespiratoria;
    }

    public void setAsistenciaRespiratoria(AsistenciaRespiratoria asistenciaRespiratoria) {
        this.asistenciaRespiratoria = asistenciaRespiratoria;
    }

    public Integer getSaturacionconO2() {
        return saturacionconO2;
    }

    public void setSaturacionconO2(Integer saturacionconO2) {
        this.saturacionconO2 = saturacionconO2;
    }

    public Integer getGlucemiaTira() {
        return glucemiaTira;
    }

    public void setGlucemiaTira(Integer glucemiaTira) {
        this.glucemiaTira = glucemiaTira;
    }

    public Integer getGlucemiaLab() {
        return glucemiaLab;
    }

    public void setGlucemiaLab(Integer glucemiaLab) {
        this.glucemiaLab = glucemiaLab;
    }
}
