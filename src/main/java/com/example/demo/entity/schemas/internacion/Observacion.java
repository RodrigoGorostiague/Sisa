package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "observacion",schema = "internacion")
public class Observacion {
    @EmbeddedId
    private ObservacionPK id;
    private String observacion;

    public ObservacionPK getId() {
        return id;
    }

    public void setId(ObservacionPK id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
