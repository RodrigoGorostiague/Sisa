package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "historialinternacion", name = "evoluciondiariaobstetricia")
public class EvolucionDiariaObstetricia {
    @EmbeddedId
    private EvolucionDiariaObstetriciaPK id;
    @Column(name = "eg_semanas")
    private Integer egSemanas;
    @Column(name = "eg_dias")
    private Integer egDias;
    private String ecografias;
    private Date fum;
    @Column(name = "altura_uterina")
    private Integer alturaUterina;
    @Column(name = "fc_fetal")
    private Integer fcFetal;
    @Column(name = "movimientos_fetales")
    private String movimientosFetales;
    @Column(name = "tono_uterino")
    private String tonoUterino;
    @Column(name = "dinamica_uterina")
    private String dinamicaUterina;
    @Column(name = "tacto_vaginal")
    private String tactoVaginal;
    @Column(name = "perdida_gen_ext")
    private String perdidaGenExt;
    @Column(name = "puno_percusion")
    private String punoPercusion;
    private String tratamiento;
    private String pemdiente;

    public EvolucionDiariaObstetriciaPK getId() {
        return id;
    }

    public void setId(EvolucionDiariaObstetriciaPK id) {
        this.id = id;
    }

    public Integer getEgSemanas() {
        return egSemanas;
    }

    public void setEgSemanas(Integer egSemanas) {
        this.egSemanas = egSemanas;
    }

    public Integer getEgDias() {
        return egDias;
    }

    public void setEgDias(Integer egDias) {
        this.egDias = egDias;
    }

    public String getEcografias() {
        return ecografias;
    }

    public void setEcografias(String ecografias) {
        this.ecografias = ecografias;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public Integer getAlturaUterina() {
        return alturaUterina;
    }

    public void setAlturaUterina(Integer alturaUterina) {
        this.alturaUterina = alturaUterina;
    }

    public Integer getFcFetal() {
        return fcFetal;
    }

    public void setFcFetal(Integer fcFetal) {
        this.fcFetal = fcFetal;
    }

    public String getMovimientosFetales() {
        return movimientosFetales;
    }

    public void setMovimientosFetales(String movimientosFetales) {
        this.movimientosFetales = movimientosFetales;
    }

    public String getTonoUterino() {
        return tonoUterino;
    }

    public void setTonoUterino(String tonoUterino) {
        this.tonoUterino = tonoUterino;
    }

    public String getDinamicaUterina() {
        return dinamicaUterina;
    }

    public void setDinamicaUterina(String dinamicaUterina) {
        this.dinamicaUterina = dinamicaUterina;
    }

    public String getTactoVaginal() {
        return tactoVaginal;
    }

    public void setTactoVaginal(String tactoVaginal) {
        this.tactoVaginal = tactoVaginal;
    }

    public String getPerdidaGenExt() {
        return perdidaGenExt;
    }

    public void setPerdidaGenExt(String perdidaGenExt) {
        this.perdidaGenExt = perdidaGenExt;
    }

    public String getPunoPercusion() {
        return punoPercusion;
    }

    public void setPunoPercusion(String punoPercusion) {
        this.punoPercusion = punoPercusion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getPemdiente() {
        return pemdiente;
    }

    public void setPemdiente(String pemdiente) {
        this.pemdiente = pemdiente;
    }
}
