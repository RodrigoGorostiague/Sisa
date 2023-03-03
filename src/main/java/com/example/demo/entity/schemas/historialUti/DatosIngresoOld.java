package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.stream.Stream;

@Entity
@Table(schema = "historialuti", name = "datosingresoold")
public class DatosIngresoOld {
    @Id
    @Column(name = "nrouti")
    private String nroUti;
    @Column(name = "motivointernacion")
    private String motivoInternacion;
    @Column(name = "enfermedadactual")
    private String enfermedadActual;
    @Column(name = "antenfermedadactual")
    private String antEnfermedadActual;
    @Column(name = "otrantpatol")
    private String otrAntPatol;
    @Column(name = "antheredofliares")
    private String antHeredoFliares;
    private String habitos;
    private String alimentacion;
    private String diuresis;
    private String  catarsis;
    @Column(name = "alcoholdia")
    private String alcoholDia;
    private String medicamentos;
    private String residenacia;
    @Column(name = "residanterior")
    private String residAnterior;
    private String profesional;
    @Column(name = "fumadia")
    private Integer fumaDia;
    @Column(name = "tempaxilar")
    private Integer tempAxilar;
    @Column(name = "temprectal")
    private Integer tempRectal;
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

    public String getAntEnfermedadActual() {
        return antEnfermedadActual;
    }

    public void setAntEnfermedadActual(String antEnfermedadActual) {
        this.antEnfermedadActual = antEnfermedadActual;
    }

    public String getOtrAntPatol() {
        return otrAntPatol;
    }

    public void setOtrAntPatol(String otrAntPatol) {
        this.otrAntPatol = otrAntPatol;
    }

    public String getAntHeredoFliares() {
        return antHeredoFliares;
    }

    public void setAntHeredoFliares(String antHeredoFliares) {
        this.antHeredoFliares = antHeredoFliares;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDiuresis() {
        return diuresis;
    }

    public void setDiuresis(String diuresis) {
        this.diuresis = diuresis;
    }

    public String getCatarsis() {
        return catarsis;
    }

    public void setCatarsis(String catarsis) {
        this.catarsis = catarsis;
    }

    public String getAlcoholDia() {
        return alcoholDia;
    }

    public void setAlcoholDia(String alcoholDia) {
        this.alcoholDia = alcoholDia;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getResidenacia() {
        return residenacia;
    }

    public void setResidenacia(String residenacia) {
        this.residenacia = residenacia;
    }

    public String getResidAnterior() {
        return residAnterior;
    }

    public void setResidAnterior(String residAnterior) {
        this.residAnterior = residAnterior;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public Integer getFumaDia() {
        return fumaDia;
    }

    public void setFumaDia(Integer fumaDia) {
        this.fumaDia = fumaDia;
    }

    public Integer getTempAxilar() {
        return tempAxilar;
    }

    public void setTempAxilar(Integer tempAxilar) {
        this.tempAxilar = tempAxilar;
    }

    public Integer getTempRectal() {
        return tempRectal;
    }

    public void setTempRectal(Integer tempRectal) {
        this.tempRectal = tempRectal;
    }

    public Integer getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(Integer frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }
}
