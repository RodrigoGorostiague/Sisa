package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "asistencia", name = "uniatserviciosala")
public class UniatServicioSala {
    @EmbeddedId
    private UniatServicioSalaPK id;

    public UniatServicioSalaPK getId() {
        return id;
    }

    public void setId(UniatServicioSalaPK id) {
        this.id = id;
    }
}
