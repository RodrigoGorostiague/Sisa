package com.example.demo.entity.schemas.rafam;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "recursos", schema = "rafam")
public class Recursos {
    @EmbeddedId
    private RecursosPK id;
    private String denominacion;

    public RecursosPK getId() {
        return id;
    }

    public void setId(RecursosPK id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
