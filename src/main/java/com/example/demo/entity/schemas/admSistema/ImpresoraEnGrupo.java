package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "impresoraengrupo")
public class ImpresoraEnGrupo {
    @EmbeddedId
    private ImpresoraEnGrupoPK id;
    private String observaciones;
    private Integer orden;

    public ImpresoraEnGrupoPK getId() {
        return id;
    }

    public void setId(ImpresoraEnGrupoPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
