package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ayudantepracticaintervencion", schema = "quirofano")
public class AyudantePracticaIntervencion {
    @EmbeddedId
    private AyudantePracticaIntervencionPK id;
    private Integer orden;

    public AyudantePracticaIntervencionPK getId() {
        return id;
    }

    public void setId(AyudantePracticaIntervencionPK id) {
        this.id = id;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
