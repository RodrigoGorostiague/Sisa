package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "conexionagrupo")
public class ConexionaGrupo {
    @EmbeddedId
    private ConexionaGrupoPK id;
    private String observaciones;

    public ConexionaGrupoPK getId() {
        return id;
    }

    public void setId(ConexionaGrupoPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
