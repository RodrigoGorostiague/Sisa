package com.example.demo.entity.schemas.infectologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "laboratoriomov", schema = "infectologia")
public class LaboratorioMov {
    @EmbeddedId
    private LaboratorioMovPK id;
    @Column(name = "fechaextraccion")
    private Date fechaExtraccion;
    @Column(name = "cargaviral")
    private Integer cargaViral;
    private Integer cd4;
    private Integer hematocrito;
    private Integer hemoglobina;
    @Column(name = "globulosblancos")
    private Integer globulosBlancos;
    private Integer colesterol;
    private Integer trigliceridos;
    private String cmv;
    private String toxoplasmosis;
    private String chagas;
    private String sifilis;
    @Column(name = "hepatitisb")
    private String hepatitisB;
    @Column(name = "hepatitisc")
    private String hepatitisC;

    public LaboratorioMovPK getId() {
        return id;
    }

    public void setId(LaboratorioMovPK id) {
        this.id = id;
    }

    public Date getFechaExtraccion() {
        return fechaExtraccion;
    }

    public void setFechaExtraccion(Date fechaExtraccion) {
        this.fechaExtraccion = fechaExtraccion;
    }

    public Integer getCargaViral() {
        return cargaViral;
    }

    public void setCargaViral(Integer cargaViral) {
        this.cargaViral = cargaViral;
    }

    public Integer getCd4() {
        return cd4;
    }

    public void setCd4(Integer cd4) {
        this.cd4 = cd4;
    }

    public Integer getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(Integer hematocrito) {
        this.hematocrito = hematocrito;
    }

    public Integer getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(Integer hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public Integer getGlobulosBlancos() {
        return globulosBlancos;
    }

    public void setGlobulosBlancos(Integer globulosBlancos) {
        this.globulosBlancos = globulosBlancos;
    }

    public Integer getColesterol() {
        return colesterol;
    }

    public void setColesterol(Integer colesterol) {
        this.colesterol = colesterol;
    }

    public Integer getTrigliceridos() {
        return trigliceridos;
    }

    public void setTrigliceridos(Integer trigliceridos) {
        this.trigliceridos = trigliceridos;
    }

    public String getCmv() {
        return cmv;
    }

    public void setCmv(String cmv) {
        this.cmv = cmv;
    }

    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }

    public String getChagas() {
        return chagas;
    }

    public void setChagas(String chagas) {
        this.chagas = chagas;
    }

    public String getSifilis() {
        return sifilis;
    }

    public void setSifilis(String sifilis) {
        this.sifilis = sifilis;
    }

    public String getHepatitisB() {
        return hepatitisB;
    }

    public void setHepatitisB(String hepatitisB) {
        this.hepatitisB = hepatitisB;
    }

    public String getHepatitisC() {
        return hepatitisC;
    }

    public void setHepatitisC(String hepatitisC) {
        this.hepatitisC = hepatitisC;
    }
}
