package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "practicasturno", schema = "radiologia")
public class PracticasTurno {
    @EmbeddedId
    private PracticasTurnoPK id;
    private String observaqciones;

    public PracticasTurnoPK getId() {
        return id;
    }

    public void setId(PracticasTurnoPK id) {
        this.id = id;
    }

    public String getObservaqciones() {
        return observaqciones;
    }

    public void setObservaqciones(String observaqciones) {
        this.observaqciones = observaqciones;
    }
}
