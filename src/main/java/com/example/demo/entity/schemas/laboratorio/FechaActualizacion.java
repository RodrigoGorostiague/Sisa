package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "fechaactualizacion", schema = "laboratorio")
public class FechaActualizacion {
    @EmbeddedId
    private FechaActualizacionPK id;

    public FechaActualizacionPK getId() {
        return id;
    }

    public void setId(FechaActualizacionPK id) {
        this.id = id;
    }
}
