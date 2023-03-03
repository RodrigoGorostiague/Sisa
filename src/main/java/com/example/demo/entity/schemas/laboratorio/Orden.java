package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "orden", schema = "laboratorio")
public class Orden {
    @Id
    @Column(name = "numeroorden")
    private Integer numeroOrden;
    @Column(name = "obrasocial")
    private Integer obraSocial;
    private String profesional;
    @Column(name = "codigoarea")
    private Integer codigoArea;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    private Integer embarazada;
    @Column(name = "numeropaciente")
    private Integer numeroPaciente;
    @Column(name = "tipopaciente")
    private String tipoPaciente;
    @Column(name = "areaprocedencia")
    private Integer areaProcedencia;

    public Integer getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(Integer numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Integer getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Integer obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public Integer getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(Integer codigoArea) {
        this.codigoArea = codigoArea;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getEmbarazada() {
        return embarazada;
    }

    public void setEmbarazada(Integer embarazada) {
        this.embarazada = embarazada;
    }

    public Integer getNumeroPaciente() {
        return numeroPaciente;
    }

    public void setNumeroPaciente(Integer numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public Integer getAreaProcedencia() {
        return areaProcedencia;
    }

    public void setAreaProcedencia(Integer areaProcedencia) {
        this.areaProcedencia = areaProcedencia;
    }
}
