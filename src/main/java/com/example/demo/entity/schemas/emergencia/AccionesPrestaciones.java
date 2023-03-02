package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "accionesprestaciones")
public class AccionesPrestaciones {
    @EmbeddedId
    private AccionesPrestacionesPK id;
    private String accion;

    public AccionesPrestacionesPK getId() {
        return id;
    }

    public void setId(AccionesPrestacionesPK id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
}
