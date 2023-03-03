package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "constantesvitalesinfancia")
public class ConstantesVitalesInfancia {
    @EmbeddedId
    private ConstantesVitalesInfanciaPK id;
    @Column(name = "ingresos_php")
    private Integer ingresosPhp;
    @Column(name = "ingresos_vo")
    private Integer ingresosVo;
    @Column(name = "egresos_diuresis")
    private Integer egresosDiureis;
    @Column(name = "egresos_vom")
    private Integer egresosVom;
    @Column(name = "egresos_cat")
    private Integer egresosCat;

    public ConstantesVitalesInfanciaPK getId() {
        return id;
    }

    public void setId(ConstantesVitalesInfanciaPK id) {
        this.id = id;
    }

    public Integer getIngresosPhp() {
        return ingresosPhp;
    }

    public void setIngresosPhp(Integer ingresosPhp) {
        this.ingresosPhp = ingresosPhp;
    }

    public Integer getIngresosVo() {
        return ingresosVo;
    }

    public void setIngresosVo(Integer ingresosVo) {
        this.ingresosVo = ingresosVo;
    }

    public Integer getEgresosDiureis() {
        return egresosDiureis;
    }

    public void setEgresosDiureis(Integer egresosDiureis) {
        this.egresosDiureis = egresosDiureis;
    }

    public Integer getEgresosVom() {
        return egresosVom;
    }

    public void setEgresosVom(Integer egresosVom) {
        this.egresosVom = egresosVom;
    }

    public Integer getEgresosCat() {
        return egresosCat;
    }

    public void setEgresosCat(Integer egresosCat) {
        this.egresosCat = egresosCat;
    }
}

