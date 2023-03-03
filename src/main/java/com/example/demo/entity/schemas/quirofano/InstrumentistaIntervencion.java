package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "instrumentistaintervencion", schema = "quirofano")
public class InstrumentistaIntervencion {
    @EmbeddedId
    private InstrumentistaIntervencionPK id;

    public InstrumentistaIntervencionPK getId() {
        return id;
    }

    public void setId(InstrumentistaIntervencionPK id) {
        this.id = id;
    }
}
