package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio", name = "permisosinturno")
public class PermisoSinTurno {
    @EmbeddedId
    private PermisoSinTurnoPK id;

    public PermisoSinTurnoPK getId() {
        return id;
    }

    public void setId(PermisoSinTurnoPK id) {
        this.id = id;
    }
}
