package com.example.demo.entity.schemas.historialEnfermeria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialenfermeria", name = "entrevista")
public class Entrevista {
    @Id
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private String colabora;
    private String acitud;
    @Column(name = "nivelestudios")
    private Integer nivelEstudios;
    private Integer labolar;
    private String observaciones;
    @Column(name = "trastornoconciencia")
    private String trastornoConciencia;
    @Column(name = "desctrastornoconciencia")
    private String descTrastornoConciencia;
    @Column(name = "trastornoideacion")
    private String trastornoIdeacion;
    @Column(name = "desctrastornoideacion")
    private String descTrastornoIdeacion;
    @Column(name = "trastornoatencionymemoria")
    private String trastornoAtencionMemoria;
    @Column(name = "desctrastornoatencionymemoria")
    private String descTrastornoAtencionMemoria;
    @Column(name = "trastornosensopercepcion")
    private String trastornoSensopercepcion;
    @Column(name = "desctrastornosensopercepcion")
    private String descTrastornoSensopercepcion;
    @Column(name = "trastornopensamiento")
    private String trastornoPensamiento;
    @Column(name = "desctrastornopensamiento")
    private String descTrastornoPensamiento;
    @Column(name = "trastornoafectividad")
    private  String trastornoAfectividad;
    @Column(name = "desctrastornoafectividad")
    private String descTrastornoAfectividad;
    @Column(name = "trastornoconducta")
    private String trastornoconducta;
    @Column(name = "desctrastornoconducta")
    private String descTrastornoConducta;
    @Column(name = "trastornoconservacion")
    private String trastornoConservacion;
    @Column(name = "desctrastornoconservacion")
    private String descTrastornoConservacion;
    @Column(name = "trastornosuenio")
    private String trastornoSuenio;
    @Column(name = "desctrastornosuenio")
    private String descTrastornoSuenio;
    @Column(name = "otrostrastornos")
    private String otrosTrastornos;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getColabora() {
        return colabora;
    }

    public void setColabora(String colabora) {
        this.colabora = colabora;
    }

    public String getAcitud() {
        return acitud;
    }

    public void setAcitud(String acitud) {
        this.acitud = acitud;
    }

    public Integer getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(Integer nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public Integer getLabolar() {
        return labolar;
    }

    public void setLabolar(Integer labolar) {
        this.labolar = labolar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTrastornoConciencia() {
        return trastornoConciencia;
    }

    public void setTrastornoConciencia(String trastornoConciencia) {
        this.trastornoConciencia = trastornoConciencia;
    }

    public String getDescTrastornoConciencia() {
        return descTrastornoConciencia;
    }

    public void setDescTrastornoConciencia(String descTrastornoConciencia) {
        this.descTrastornoConciencia = descTrastornoConciencia;
    }

    public String getTrastornoIdeacion() {
        return trastornoIdeacion;
    }

    public void setTrastornoIdeacion(String trastornoIdeacion) {
        this.trastornoIdeacion = trastornoIdeacion;
    }

    public String getDescTrastornoIdeacion() {
        return descTrastornoIdeacion;
    }

    public void setDescTrastornoIdeacion(String descTrastornoIdeacion) {
        this.descTrastornoIdeacion = descTrastornoIdeacion;
    }

    public String getTrastornoAtencionMemoria() {
        return trastornoAtencionMemoria;
    }

    public void setTrastornoAtencionMemoria(String trastornoAtencionMemoria) {
        this.trastornoAtencionMemoria = trastornoAtencionMemoria;
    }

    public String getDescTrastornoAtencionMemoria() {
        return descTrastornoAtencionMemoria;
    }

    public void setDescTrastornoAtencionMemoria(String descTrastornoAtencionMemoria) {
        this.descTrastornoAtencionMemoria = descTrastornoAtencionMemoria;
    }

    public String getTrastornoSensopercepcion() {
        return trastornoSensopercepcion;
    }

    public void setTrastornoSensopercepcion(String trastornoSensopercepcion) {
        this.trastornoSensopercepcion = trastornoSensopercepcion;
    }

    public String getDescTrastornoSensopercepcion() {
        return descTrastornoSensopercepcion;
    }

    public void setDescTrastornoSensopercepcion(String descTrastornoSensopercepcion) {
        this.descTrastornoSensopercepcion = descTrastornoSensopercepcion;
    }

    public String getTrastornoPensamiento() {
        return trastornoPensamiento;
    }

    public void setTrastornoPensamiento(String trastornoPensamiento) {
        this.trastornoPensamiento = trastornoPensamiento;
    }

    public String getDescTrastornoPensamiento() {
        return descTrastornoPensamiento;
    }

    public void setDescTrastornoPensamiento(String descTrastornoPensamiento) {
        this.descTrastornoPensamiento = descTrastornoPensamiento;
    }

    public String getTrastornoAfectividad() {
        return trastornoAfectividad;
    }

    public void setTrastornoAfectividad(String trastornoAfectividad) {
        this.trastornoAfectividad = trastornoAfectividad;
    }

    public String getDescTrastornoAfectividad() {
        return descTrastornoAfectividad;
    }

    public void setDescTrastornoAfectividad(String descTrastornoAfectividad) {
        this.descTrastornoAfectividad = descTrastornoAfectividad;
    }

    public String getTrastornoconducta() {
        return trastornoconducta;
    }

    public void setTrastornoconducta(String trastornoconducta) {
        this.trastornoconducta = trastornoconducta;
    }

    public String getDescTrastornoConducta() {
        return descTrastornoConducta;
    }

    public void setDescTrastornoConducta(String descTrastornoConducta) {
        this.descTrastornoConducta = descTrastornoConducta;
    }

    public String getTrastornoConservacion() {
        return trastornoConservacion;
    }

    public void setTrastornoConservacion(String trastornoConservacion) {
        this.trastornoConservacion = trastornoConservacion;
    }

    public String getDescTrastornoConservacion() {
        return descTrastornoConservacion;
    }

    public void setDescTrastornoConservacion(String descTrastornoConservacion) {
        this.descTrastornoConservacion = descTrastornoConservacion;
    }

    public String getTrastornoSuenio() {
        return trastornoSuenio;
    }

    public void setTrastornoSuenio(String trastornoSuenio) {
        this.trastornoSuenio = trastornoSuenio;
    }

    public String getDescTrastornoSuenio() {
        return descTrastornoSuenio;
    }

    public void setDescTrastornoSuenio(String descTrastornoSuenio) {
        this.descTrastornoSuenio = descTrastornoSuenio;
    }

    public String getOtrosTrastornos() {
        return otrosTrastornos;
    }

    public void setOtrosTrastornos(String otrosTrastornos) {
        this.otrosTrastornos = otrosTrastornos;
    }
}
