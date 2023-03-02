package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(schema = "auditoria", name = "infusioninternacion")
public class InfusionInternacion {
    @EmbeddedId
    private InfusionInternacionPK id;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private String usuario;
    private String operacion;
    private Integer volumen;
    private Integer volumen2;
    private Integer volumen3;
    private Integer volumen4;

    @Column(name = "cantgoteo")
    private Integer cantGoteo;
    @Column(name = "tipogoteo")
    private String tipoGoteo;
    @Column(name = "dosisfarmaco1")
    private String dosisFarmaco1;
    @Column(name = "dosisfarmaco2")
    private String dosisFarmaco2;
    @Column(name = "dosisfarmaco3")
    private String dosisFarmaco3;
    @Column(name = "dosisfarmaco4")
    private String dosisFarmaco4;
    @Column(name = "dosisfarmaco5")
    private String dosisFarmaco5;
    @Column(name = "dosisfarmaco6")
    private String dosisFarmaco6;
    private String observaciones;
    @Column(name = "cantgoteofarmaco")
    private Integer cantGoteoFarmaco;
    @Column(name = "tipogoteofarmaco")
    private Integer tipoGoteoFarmaco;
    @Column(name = "fecha_fin")
    private LocalDateTime fechaFin;

    public InfusionInternacionPK getId() {
        return id;
    }

    public void setId(InfusionInternacionPK id) {
        this.id = id;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getVolumen2() {
        return volumen2;
    }

    public void setVolumen2(Integer volumen2) {
        this.volumen2 = volumen2;
    }

    public Integer getVolumen3() {
        return volumen3;
    }

    public void setVolumen3(Integer volumen3) {
        this.volumen3 = volumen3;
    }

    public Integer getVolumen4() {
        return volumen4;
    }

    public void setVolumen4(Integer volumen4) {
        this.volumen4 = volumen4;
    }

    public Integer getCantGoteo() {
        return cantGoteo;
    }

    public void setCantGoteo(Integer cantGoteo) {
        this.cantGoteo = cantGoteo;
    }

    public String getTipoGoteo() {
        return tipoGoteo;
    }

    public void setTipoGoteo(String tipoGoteo) {
        this.tipoGoteo = tipoGoteo;
    }

    public String getDosisFarmaco1() {
        return dosisFarmaco1;
    }

    public void setDosisFarmaco1(String dosisFarmaco1) {
        this.dosisFarmaco1 = dosisFarmaco1;
    }

    public String getDosisFarmaco2() {
        return dosisFarmaco2;
    }

    public void setDosisFarmaco2(String dosisFarmaco2) {
        this.dosisFarmaco2 = dosisFarmaco2;
    }

    public String getDosisFarmaco3() {
        return dosisFarmaco3;
    }

    public void setDosisFarmaco3(String dosisFarmaco3) {
        this.dosisFarmaco3 = dosisFarmaco3;
    }

    public String getDosisFarmaco4() {
        return dosisFarmaco4;
    }

    public void setDosisFarmaco4(String dosisFarmaco4) {
        this.dosisFarmaco4 = dosisFarmaco4;
    }

    public String getDosisFarmaco5() {
        return dosisFarmaco5;
    }

    public void setDosisFarmaco5(String dosisFarmaco5) {
        this.dosisFarmaco5 = dosisFarmaco5;
    }

    public String getDosisFarmaco6() {
        return dosisFarmaco6;
    }

    public void setDosisFarmaco6(String dosisFarmaco6) {
        this.dosisFarmaco6 = dosisFarmaco6;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getCantGoteoFarmaco() {
        return cantGoteoFarmaco;
    }

    public void setCantGoteoFarmaco(Integer cantGoteoFarmaco) {
        this.cantGoteoFarmaco = cantGoteoFarmaco;
    }

    public Integer getTipoGoteoFarmaco() {
        return tipoGoteoFarmaco;
    }

    public void setTipoGoteoFarmaco(Integer tipoGoteoFarmaco) {
        this.tipoGoteoFarmaco = tipoGoteoFarmaco;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}
