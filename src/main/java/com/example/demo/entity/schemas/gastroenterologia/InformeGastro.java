package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "gastroenterologia", name = "informegastro")
public class InformeGastro {
    @Id
    @Column(name = "nroprotocolo")
    private Integer nroProtocolo;
    private Date fecha;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private String profesional;
    @Column(name = "fechaorden")
    private Date fechaOrden;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    @Column(name = "codigoobrasocial")
    private Integer codigoObraSocial;
    @Column(name = "codigoseguro")
    private Integer codigoSeguro;
    @Column(name = "numeropoliza")
    private Integer numeroPoliza;
    @Column(name = "codigoart")
    private Integer codigoArt;
    @Column(name = "profesionalsolicitante")
    private String profesionalSolicitante;
    @Column(name = "codigopractica")
    private String codigoPractica;
    @Column(name = "textoinforme")
    private String textoInforme;

    public Integer getNroProtocolo() {
        return nroProtocolo;
    }

    public void setNroProtocolo(Integer nroProtocolo) {
        this.nroProtocolo = nroProtocolo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
    }

    public Integer getCodigoObraSocial() {
        return codigoObraSocial;
    }

    public void setCodigoObraSocial(Integer codigoObraSocial) {
        this.codigoObraSocial = codigoObraSocial;
    }

    public Integer getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(Integer codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Integer getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(Integer codigoArt) {
        this.codigoArt = codigoArt;
    }

    public String getProfesionalSolicitante() {
        return profesionalSolicitante;
    }

    public void setProfesionalSolicitante(String profesionalSolicitante) {
        this.profesionalSolicitante = profesionalSolicitante;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getTextoInforme() {
        return textoInforme;
    }

    public void setTextoInforme(String textoInforme) {
        this.textoInforme = textoInforme;
    }
}
