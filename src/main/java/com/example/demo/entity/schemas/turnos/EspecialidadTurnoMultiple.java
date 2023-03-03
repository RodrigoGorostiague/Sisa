package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidadturnomultiple", schema = "turnos")
public class EspecialidadTurnoMultiple {
    @EmbeddedId
    private EspecialidadTurnoMultiplePK id;

    public EspecialidadTurnoMultiplePK getId() {
        return id;
    }

    public void setId(EspecialidadTurnoMultiplePK id) {
        this.id = id;
    }
}
