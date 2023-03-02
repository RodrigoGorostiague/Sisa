package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "anatomiapatologica", name = "informecitologia")
public class InformeCitologia {
    @Id
    @Column(name = "nroinforme")
    private Integer nroInforme;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fecha;
    @Column(name = "fechaorden")
    private Date fechaOrden;
    private String uniat;
    @Column(name = "codigoprocendencia")
    private String codigoProcendencia;
    @Column(name = "tipoprocendencia")
    private String tipoProcendencia;
    @Column(name = "profsolicitante")
    private String profSolicitante;
    @Column(name = "profactuante")
    private String profActuante;
    private String procedimiento;
    private String macroscopia;
    private String microscopia;
    private String diagnostico;
    @Column(name = "descdiagnostico")
    private String descDiagnostico;
    @Column(name = "desctopografia")
    private String descTopografia;
    private String resultado;
    private String topografia;
    private String estado;
    private String confirmado;

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
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

    public String getCodigoProcendencia() {
        return codigoProcendencia;
    }

    public void setCodigoProcendencia(String codigoProcendencia) {
        this.codigoProcendencia = codigoProcendencia;
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

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getMacroscopia() {
        return macroscopia;
    }

    public void setMacroscopia(String macroscopia) {
        this.macroscopia = macroscopia;
    }

    public String getMicroscopia() {
        return microscopia;
    }

    public void setMicroscopia(String microscopia) {
        this.microscopia = microscopia;
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

    public String getDescTopografia() {
        return descTopografia;
    }

    public void setDescTopografia(String descTopografia) {
        this.descTopografia = descTopografia;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getTopografia() {
        return topografia;
    }

    public void setTopografia(String topografia) {
        this.topografia = topografia;
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
}
