package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicestudioscema",schema = "paciente")
public class SolicEstudiosCema {
    @EmbeddedId
    private SolicEstudiosCemaPK id;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    private String estudio;
    @Column(name = "resumenhc")
    private String resumenHc;
    private String uniat;
    private String diagnostico;
    @Column(name = "est_men_compl_prev")
    private String estMenComplPrev;
    private String observaciones;

    public SolicEstudiosCemaPK getId() {
        return id;
    }

    public void setId(SolicEstudiosCemaPK id) {
        this.id = id;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getResumenHc() {
        return resumenHc;
    }

    public void setResumenHc(String resumenHc) {
        this.resumenHc = resumenHc;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getEstMenComplPrev() {
        return estMenComplPrev;
    }

    public void setEstMenComplPrev(String estMenComplPrev) {
        this.estMenComplPrev = estMenComplPrev;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
