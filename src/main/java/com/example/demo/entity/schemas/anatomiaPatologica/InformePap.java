package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "anatomiapatologica", name = "informepap")
public class InformePap {
    @Id
    @Column(name = "nroinforme")
    private String nroInforme;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fecha;
    @Column(name = "fechaorden")
    private Date fechaOrden;
    private String uniat;
    @Column(name = "tipoprocedencia")
    private String tipoProcendencia;
    @Column(name = "profsolicitante")
    private String profSolicitante;
    @Column(name = "profactuante")
    private String profActuante;
    @Column(name = "desccitologica")
    private String descCitologica;
    @Column(name = "evalhormonal")
    private String evalHormonal;
    private String diagnostico;
    @Column(name = "descdiagnostico")
    private String descDiagnostico;
    private String observaciones;
    @Column(name = "codigoprocendencia")
    private String codigoProcendencia;
    private String estado;
    private String confirmado;
    @Column(name = "calidadmuestra")
    private String calidadMuestra;
    @Column(name = "calmuestraobs")
    private String calMuestraObs;

    public String getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(String nroInforme) {
        this.nroInforme = nroInforme;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getTipoProcendencia() {
        return tipoProcendencia;
    }

    public void setTipoProcendencia(String tipoProcendencia) {
        this.tipoProcendencia = tipoProcendencia;
    }

    public String getProfSolicitante() {
        return profSolicitante;
    }

    public void setProfSolicitante(String profSolicitante) {
        this.profSolicitante = profSolicitante;
    }

    public String getProfActuante() {
        return profActuante;
    }

    public void setProfActuante(String profActuante) {
        this.profActuante = profActuante;
    }

    public String getDescCitologica() {
        return descCitologica;
    }

    public void setDescCitologica(String descCitologica) {
        this.descCitologica = descCitologica;
    }

    public String getEvalHormonal() {
        return evalHormonal;
    }

    public void setEvalHormonal(String evalHormonal) {
        this.evalHormonal = evalHormonal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescDiagnostico() {
        return descDiagnostico;
    }

    public void setDescDiagnostico(String descDiagnostico) {
        this.descDiagnostico = descDiagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCodigoProcendencia() {
        return codigoProcendencia;
    }

    public void setCodigoProcendencia(String codigoProcendencia) {
        this.codigoProcendencia = codigoProcendencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(String confirmado) {
        this.confirmado = confirmado;
    }

    public String getCalidadMuestra() {
        return calidadMuestra;
    }

    public void setCalidadMuestra(String calidadMuestra) {
        this.calidadMuestra = calidadMuestra;
    }

    public String getCalMuestraObs() {
        return calMuestraObs;
    }

    public void setCalMuestraObs(String calMuestraObs) {
        this.calMuestraObs = calMuestraObs;
    }
}
