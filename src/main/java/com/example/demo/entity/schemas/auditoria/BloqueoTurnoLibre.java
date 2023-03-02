package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "bloqueoturnolibre")
public class BloqueoTurnoLibre {
    @EmbeddedId
    private BloqueoTurnoLibrePK id;
    private String operacion;

    public BloqueoTurnoLibrePK getId() {
        return id;
    }

    public void setId(BloqueoTurnoLibrePK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
