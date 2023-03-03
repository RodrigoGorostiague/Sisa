package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiosypracticas", schema = "historialambulatorio")
public class EstudiosPracticas {
    @EmbeddedId
    private EstudiosPracticasPK id;
    private String observacion;

    public EstudiosPracticasPK getId() {
        return id;
    }

    public void setId(EstudiosPracticasPK id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
