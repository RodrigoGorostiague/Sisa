package com.example.demo.entity.schemas.historialEnfermeria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "lineasevolucion", schema = "historialenfermeria")
public class LineasEvolucion {
    @EmbeddedId
    private LineasEvolucionPK id;

    public LineasEvolucionPK getId() {
        return id;
    }

    public void setId(LineasEvolucionPK id) {
        this.id = id;
    }
}
