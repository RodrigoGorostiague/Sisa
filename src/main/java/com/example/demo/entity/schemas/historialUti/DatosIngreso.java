package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialuti", name = "datosingreso")
public class DatosIngreso {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    @Column(name = "motivointernacion")
    private String motivoInternacion;
    @Column(name = "enfermedadactual")
    private String enfermedadActual;
    @Column(name = "antenfermedadactual")
    private String antenFermedAdactual;
    @Column(name = "otrantpatol")
    private String otraAntPatol;
    private String alcohol;
    private String medicamentos;
    private String residencia;
    private String profesional;
    private String comentarios;
    private String fuma;
    @Column(name = "frecrespiratoria")
    private Integer frecRespiratoria;

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public String getMotivoInternacion() {
        return motivoInternacion;
    }

    public void setMotivoInternacion(String motivoInternacion) {
        this.motivoInternacion = motivoInternacion;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getAntenFermedAdactual() {
        return antenFermedAdactual;
    }

    public void setAntenFermedAdactual(String antenFermedAdactual) {
        this.antenFermedAdactual = antenFermedAdactual;
    }

    public String getOtraAntPatol() {
        return otraAntPatol;
    }

    public void setOtraAntPatol(String otraAntPatol) {
        this.otraAntPatol = otraAntPatol;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getFuma() {
        return fuma;
    }

    public void setFuma(String fuma) {
        this.fuma = fuma;
    }

    public Integer getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(Integer frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }
}
