package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "epicrisispasecabecera", schema = "internacion")
public class EpicrisisPaseCabecera {
    @EmbeddedId
    private EpicrisisPaseCabeceraPK id;
    @Column(name = "profesionalepicrisis")
    private String profesionalEpicrisis;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "servicioepicrisis")
    private Integer servicioEpicrisis;
    private Integer formato;
    @Column(name = "fechaepicrisis")
    private Date fechaEpicrisis;
    private String impresa;

    public EpicrisisPaseCabeceraPK getId() {
        return id;
    }

    public void setId(EpicrisisPaseCabeceraPK id) {
        this.id = id;
    }

    public String getProfesionalEpicrisis() {
        return profesionalEpicrisis;
    }

    public void setProfesionalEpicrisis(String profesionalEpicrisis) {
        this.profesionalEpicrisis = profesionalEpicrisis;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getServicioEpicrisis() {
        return servicioEpicrisis;
    }

    public void setServicioEpicrisis(Integer servicioEpicrisis) {
        this.servicioEpicrisis = servicioEpicrisis;
    }

    public Integer getFormato() {
        return formato;
    }

    public void setFormato(Integer formato) {
        this.formato = formato;
    }

    public Date getFechaEpicrisis() {
        return fechaEpicrisis;
    }

    public void setFechaEpicrisis(Date fechaEpicrisis) {
        this.fechaEpicrisis = fechaEpicrisis;
    }

    public String getImpresa() {
        return impresa;
    }

    public void setImpresa(String impresa) {
        this.impresa = impresa;
    }
}
