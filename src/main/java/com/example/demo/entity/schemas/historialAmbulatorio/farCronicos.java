package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "farcronicos", schema = "historialambulatorio")
public class farCronicos {
    @EmbeddedId
    private farCronicosPK id;

    public farCronicosPK getId() {
        return id;
    }

    public void setId(farCronicosPK id) {
        this.id = id;
    }
}
