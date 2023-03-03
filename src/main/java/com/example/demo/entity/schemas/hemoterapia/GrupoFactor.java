package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "hemoterapia", name = "grupofactor")
public class GrupoFactor {
    @EmbeddedId
    private GrupoFactorPK id;
    private String motivo;
    private String abo;
    private String rh;
    @Column(name = "fenotipo")
    private String fenoTipo;
    private String observaciones;

    public GrupoFactorPK getId() {
        return id;
    }

    public void setId(GrupoFactorPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getFenoTipo() {
        return fenoTipo;
    }

    public void setFenoTipo(String fenoTipo) {
        this.fenoTipo = fenoTipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
