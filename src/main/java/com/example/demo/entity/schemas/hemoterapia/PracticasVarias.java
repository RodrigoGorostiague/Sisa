package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "hemoterapia", name = "practicasvarias")
public class PracticasVarias {
    @EmbeddedId
    private PracticasVariasPK id;
    @Column(name = "tipopaciente")
    private String tipoPaciente;
    private String resultado;
    @Column(name = "medicosolicitante")
    private String medicoSolicitante;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    @Column(name = "codigoprocedencia")
    private Integer codigoProcedencia;
    private String observaciones;

    public PracticasVariasPK getId() {
        return id;
    }

    public void setId(PracticasVariasPK id) {
        this.id = id;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getMedicoSolicitante() {
        return medicoSolicitante;
    }

    public void setMedicoSolicitante(String medicoSolicitante) {
        this.medicoSolicitante = medicoSolicitante;
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

    public Integer getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(Integer codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
