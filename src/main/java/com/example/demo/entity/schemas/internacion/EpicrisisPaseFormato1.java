package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "epicrisispaseformato1", schema = "internacion")
public class EpicrisisPaseFormato1 {
    @Id
    @Column(name = "numerointernacion")
    private Integer numeroInternacion;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "tipomov")
    private String tipoMov;
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
}
