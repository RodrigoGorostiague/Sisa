package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "epicrisisformato1")
public class EpicrisisFormato1 {
    @Id
    @Column(name = "numerointernacion")
    private Integer numeroInternacion;
    @Column(name = "motivointernacion")
    private String motivoInternacion;
    @Column(name = "resumensemiologico")
    private String resumenSemiologico;
    @Column(name = "estudioscompl")
    private String estudiosCompl;
    private String diagnostico;
    private String practicas;
    private String evolucion;
    private String seguimiento;
    @Column(name = "diagnosticocie10")
    private String diagnosticoCie10;
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

    public String getResumenSemiologico() {
        return resumenSemiologico;
    }

    public void setResumenSemiologico(String resumenSemiologico) {
        this.resumenSemiologico = resumenSemiologico;
    }

    public String getEstudiosCompl() {
        return estudiosCompl;
    }

    public void setEstudiosCompl(String estudiosCompl) {
        this.estudiosCompl = estudiosCompl;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPracticas() {
        return practicas;
    }

    public void setPracticas(String practicas) {
        this.practicas = practicas;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(String seguimiento) {
        this.seguimiento = seguimiento;
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
