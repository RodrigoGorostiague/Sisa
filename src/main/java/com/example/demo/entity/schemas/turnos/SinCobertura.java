package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sincobertura", schema = "turnos")
public class SinCobertura {
    @EmbeddedId
    private SinCoberturaPK id;

    public SinCoberturaPK getId() {
        return id;
    }

    public void setId(SinCoberturaPK id) {
        this.id = id;
    }
}
