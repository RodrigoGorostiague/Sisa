package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "epicrisispaseformato2", schema = "internacion")
public class EpicrisisPaseFormato2 {
    @Id
    @Column(name = "numerointernacion")
    private Integer numeroInternacion;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "tipomov")
    private String tipoMov;
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
    private String diagnosticosAlta;
    @Column(name = "indicacionesalta")
    private String indicacionesAlta;
    private String observaciones;

    public Integer getNumeroInternacion() {
        return numeroInternacion;
    }

    public void setNumeroInternacion(Integer numeroInternacion) {
        this.numeroInternacion = numeroInternacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
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

    public String getDiagnosticosAlta() {
        return diagnosticosAlta;
    }

    public void setDiagnosticosAlta(String diagnosticosAlta) {
        this.diagnosticosAlta = diagnosticosAlta;
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
}
