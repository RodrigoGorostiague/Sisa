package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "coberturaprestadora", schema = "turnos")
public class CoberturaPrestadora {
    @EmbeddedId
    private CoberturaPrestadoraPK id;

    public CoberturaPrestadoraPK getId() {
        return id;
    }

    public void setId(CoberturaPrestadoraPK id) {
        this.id = id;
    }
}
