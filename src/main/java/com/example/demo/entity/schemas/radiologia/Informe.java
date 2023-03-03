package com.example.demo.entity.schemas.radiologia;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Informe {
    @EmbeddedId
    private InformePK id;
    @Column(name = "fechaatencion")
    private Date fechaAtencion;
    @Column(name = "fechaorden")
    private Date fechaOrden;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "profesionalsolicitante")
    private String profesionalSolicitante;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    @Column(name = "codigoobrasocial")
    private Integer codigoObraSocial;
    @Column(name = "numeroafiliadoos")
    private String numeroAfiliadoos;
    @Column(name = "codigoseguro")
    private Integer codigoSeguro;
    @Column(name = "numeroPoliza")
    private String numeropoliza;
    @Column(name = "codigoart")
    private Integer codigoArt;
    @Column(name = "textoinforme")
    private String textoInforme;
    @Column(name = "radiologoactuante")
    private String radiologoActuante;
    private String estado;
    private String observaciones;
    @Column(name = "nropacienteviejo")
    private Integer nroPacienteViejo;
    @Column(name = "codigoprocedencia")
    private String codigoProcedencia;
    @Column(name = "trajorecibo")
    private Boolean trajoRecibo;
    @Column(name = "trajocarne")
    private Boolean trajoCarne;
    @Column(name = "trajodni")
    private Boolean trajoDni;
    @Column(name = "trajootr")
    private Boolean trajoOtr;
    @Column(name = "creadopor")
    private String creadoPor;
    @Column(name = "fechainforme")
    private Date fechaInforme;
    private String tecnico;
    @Column(name = "bi_rads")
    private String biRads;
    @Column(name = "tipoinforme")
    private String tipoInforme;
    @Column(name = "uniatprocedencia")
    private String uniatProcedencia;

    public InformePK getId() {
        return id;
    }

    public void setId(InformePK id) {
        this.id = id;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getProfesionalSolicitante() {
        return profesionalSolicitante;
    }

    public void setProfesionalSolicitante(String profesionalSolicitante) {
        this.profesionalSolicitante = profesionalSolicitante;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
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

    public String getNumeroAfiliadoos() {
        return numeroAfiliadoos;
    }

    public void setNumeroAfiliadoos(String numeroAfiliadoos) {
        this.numeroAfiliadoos = numeroAfiliadoos;
    }

    public Integer getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(Integer codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getNumeropoliza() {
        return numeropoliza;
    }

    public void setNumeropoliza(String numeropoliza) {
        this.numeropoliza = numeropoliza;
    }

    public Integer getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(Integer codigoArt) {
        this.codigoArt = codigoArt;
    }

    public String getTextoInforme() {
        return textoInforme;
    }

    public void setTextoInforme(String textoInforme) {
        this.textoInforme = textoInforme;
    }

    public String getRadiologoActuante() {
        return radiologoActuante;
    }

    public void setRadiologoActuante(String radiologoActuante) {
        this.radiologoActuante = radiologoActuante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getNroPacienteViejo() {
        return nroPacienteViejo;
    }

    public void setNroPacienteViejo(Integer nroPacienteViejo) {
        this.nroPacienteViejo = nroPacienteViejo;
    }

    public String getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(String codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public Boolean getTrajoRecibo() {
        return trajoRecibo;
    }

    public void setTrajoRecibo(Boolean trajoRecibo) {
        this.trajoRecibo = trajoRecibo;
    }

    public Boolean getTrajoCarne() {
        return trajoCarne;
    }

    public void setTrajoCarne(Boolean trajoCarne) {
        this.trajoCarne = trajoCarne;
    }

    public Boolean getTrajoDni() {
        return trajoDni;
    }

    public void setTrajoDni(Boolean trajoDni) {
        this.trajoDni = trajoDni;
    }

    public Boolean getTrajoOtr() {
        return trajoOtr;
    }

    public void setTrajoOtr(Boolean trajoOtr) {
        this.trajoOtr = trajoOtr;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getBiRads() {
        return biRads;
    }

    public void setBiRads(String biRads) {
        this.biRads = biRads;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }

    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public String getUniatProcedencia() {
        return uniatProcedencia;
    }

    public void setUniatProcedencia(String uniatProcedencia) {
        this.uniatProcedencia = uniatProcedencia;
    }
}
