package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permisosinturno_back", schema = "historialambulatorio")
public class PermisoSinTurnoBack {
    @EmbeddedId
    private PermisoSinTurnoBackPK id;

    public PermisoSinTurnoBackPK getId() {
        return id;
    }

    public void setId(PermisoSinTurnoBackPK id) {
        this.id = id;
    }
}
