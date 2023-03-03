package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "practicaintervencion", schema = "quirofano")
public class PracticaIntervencion {
    @EmbeddedId
    private PracticaIntervencionPK id;
    private String titular;

    public PracticaIntervencionPK getId() {
        return id;
    }

    public void setId(PracticaIntervencionPK id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
