package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "protesisintervencion", schema = "quirofano")
public class ProtesisIntervencion {
    @EmbeddedId
    private ProtesisIntervencionPK id;
    private String observaciones;

    public ProtesisIntervencionPK getId() {
        return id;
    }

    public void setId(ProtesisIntervencionPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
