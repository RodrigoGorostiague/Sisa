package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "anatomiapatologica", name = "informebiopsypap")
public class InformeBiopsyPap {
    @Id
    private String protocolo;
    private Date fecha;
    private String medico;
    @Column(name = "apynopaciente")
    private String ApellidoNombrePaciente;
    private String hc;
    private Integer edad;
    private String sexo;
    private String procendencia;
    @Column(name = "idcalificacion")
    private String idCalificacion;
    private String descripcion;
    private String hormonal;
    private String flora;
    @Column(name = "iddiagnostico")
    private String idDiagnostico;
    private String diagnostico;
    private String observaciones;

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getApellidoNombrePaciente() {
        return ApellidoNombrePaciente;
    }

    public void setApellidoNombrePaciente(String apellidoNombrePaciente) {
        ApellidoNombrePaciente = apellidoNombrePaciente;
    }

    public String getHc() {
        return hc;
    }

    public void setHc(String hc) {
        this.hc = hc;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProcendencia() {
        return procendencia;
    }

    public void setProcendencia(String procendencia) {
        this.procendencia = procendencia;
    }

    public String getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(String idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHormonal() {
        return hormonal;
    }

    public void setHormonal(String hormonal) {
        this.hormonal = hormonal;
    }

    public String getFlora() {
        return flora;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public String getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(String idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
