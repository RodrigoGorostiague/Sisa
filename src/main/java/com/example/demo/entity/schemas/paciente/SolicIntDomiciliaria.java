package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicintdomiciliaria", schema = "paciente")
public class SolicIntDomiciliaria {
    @EmbeddedId
    private SolicIntDomiciliariaPK id;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    private String diagnostico;
    @Column(name = "motivoingreso")
    private String motivoIngreso;
    @Column(name = "indicacionesalta")
    private String indicacionesAlta;
    @Column(name = "criteriostratonc")
    private String criteriosTratOnc;
    private String uniat;

    public SolicIntDomiciliariaPK getId() {
        return id;
    }

    public void setId(SolicIntDomiciliariaPK id) {
        this.id = id;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMotivoIngreso() {
        return motivoIngreso;
    }

    public void setMotivoIngreso(String motivoIngreso) {
        this.motivoIngreso = motivoIngreso;
    }

    public String getIndicacionesAlta() {
        return indicacionesAlta;
    }

    public void setIndicacionesAlta(String indicacionesAlta) {
        this.indicacionesAlta = indicacionesAlta;
    }

    public String getCriteriosTratOnc() {
        return criteriosTratOnc;
    }

    public void setCriteriosTratOnc(String criteriosTratOnc) {
        this.criteriosTratOnc = criteriosTratOnc;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }
}
