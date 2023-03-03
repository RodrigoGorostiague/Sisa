package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "epicrisisformato2", schema = "internacion")
public class EpicrisisFormato2 {
    @Id
    @Column(name = "numerointernacion")
    private Integer numeroInternacion;
    @Column(name = "motivointernacion")
    private String motivoInternacion;
    @Column(name = "antecedentespersonales")
    private String antecedentesPersonales;
    @Column(name = "medicacionhabitual")
    private String medicacionHabitual;
    @Column(name = "internaciondatospositivos")
    private String internacionDatosPositivos;
    @Column(name = "estudioscomplementarios")
    private String estudiosComplementarios;
    @Column(name = "diagnosticosalta")
    private String diagnosticoSalta;
    @Column(name = "indicacionesalta")
    private String indicacionesAlta;
    private String observaciones;
    @Column(name = "diagnosticocie10")
    private String diagnosticoCie10;
    @Column(name = "diagnosticocie10sec")
    private String diagnosticoCie10sec;

    public Integer getNumeroInternacion() {
        return numeroInternacion;
    }

    public void setNumeroInternacion(Integer numeroInternacion) {
        this.numeroInternacion = numeroInternacion;
    }

    public String getMotivoInternacion() {
        return motivoInternacion;
    }

    public void setMotivoInternacion(String motivoInternacion) {
        this.motivoInternacion = motivoInternacion;
    }

    public String getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    public void setAntecedentesPersonales(String antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    public String getMedicacionHabitual() {
        return medicacionHabitual;
    }

    public void setMedicacionHabitual(String medicacionHabitual) {
        this.medicacionHabitual = medicacionHabitual;
    }

    public String getInternacionDatosPositivos() {
        return internacionDatosPositivos;
    }

    public void setInternacionDatosPositivos(String internacionDatosPositivos) {
        this.internacionDatosPositivos = internacionDatosPositivos;
    }

    public String getEstudiosComplementarios() {
        return estudiosComplementarios;
    }

    public void setEstudiosComplementarios(String estudiosComplementarios) {
        this.estudiosComplementarios = estudiosComplementarios;
    }

    public String getDiagnosticoSalta() {
        return diagnosticoSalta;
    }

    public void setDiagnosticoSalta(String diagnosticoSalta) {
        this.diagnosticoSalta = diagnosticoSalta;
    }

    public String getIndicacionesAlta() {
        return indicacionesAlta;
    }

    public void setIndicacionesAlta(String indicacionesAlta) {
        this.indicacionesAlta = indicacionesAlta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDiagnosticoCie10() {
        return diagnosticoCie10;
    }

    public void setDiagnosticoCie10(String diagnosticoCie10) {
        this.diagnosticoCie10 = diagnosticoCie10;
    }

    public String getDiagnosticoCie10sec() {
        return diagnosticoCie10sec;
    }

    public void setDiagnosticoCie10sec(String diagnosticoCie10sec) {
        this.diagnosticoCie10sec = diagnosticoCie10sec;
    }
}
