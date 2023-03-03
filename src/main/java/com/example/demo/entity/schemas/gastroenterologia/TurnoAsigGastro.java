package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "gastroenterologia", name = "turnoasiggastro")
public class TurnoAsigGastro {
    @EmbeddedId
    private TurnoAsigGastroPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
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
    @Column(name = "idestadoatencion")
    private String idEstadoAtencion;

    public TurnoAsigGastroPK getId() {
        return id;
    }

    public void setId(TurnoAsigGastroPK id) {
        this.id = id;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getIdEstadoAtencion() {
        return idEstadoAtencion;
    }

    public void setIdEstadoAtencion(String idEstadoAtencion) {
        this.idEstadoAtencion = idEstadoAtencion;
    }
}
