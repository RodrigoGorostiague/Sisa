package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "maquinagrupo")
public class MaquinaGrupo {
    @EmbeddedId
    private MaquinaGrupoPK id;
    private String observaciones;

    public MaquinaGrupoPK getId() {
        return id;
    }

    public void setId(MaquinaGrupoPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
