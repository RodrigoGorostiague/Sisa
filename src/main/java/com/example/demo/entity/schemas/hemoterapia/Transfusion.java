package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "hemoterapia")
public class Transfusion {
    @EmbeddedId
    private TransfusionPK id;
    private String abo;
    private String rh;
    private String diagnostico;
    @Column(name = "medicosolicitante")
    private String medicoSolicitante;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoprocedencia")
    private Integer codigoProcedencia;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;

    public TransfusionPK getId() {
        return id;
    }

    public void setId(TransfusionPK id) {
        this.id = id;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
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

    public Integer getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(Integer codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
    }
}
