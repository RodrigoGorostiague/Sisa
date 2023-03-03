package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidad21vigente", schema = "turnos")
public class Especialidad21Vigente {
    @EmbeddedId
    private Especialidad21VigentePK id;

    public Especialidad21VigentePK getId() {
        return id;
    }

    public void setId(Especialidad21VigentePK id) {
        this.id = id;
    }
}
