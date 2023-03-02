package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "anatomiapatologica", name = "informenecropsia")
public class InformeNecropsia {
    @Id
    @Column(name = "nroinforme")
    private Integer nroInforme;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fecha;
    @Column(name = "fechaorden")
    private Date fechaOrden;
    private String uniat;
    @Column(name = "codigoprocedencia")
    private String codigoProcedencia;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    @Column(name = "profsolicitante")
    private String profSolicitante;
    @Column(name = "profactuante")
    private String profActuante;
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

    public String getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(String codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
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
