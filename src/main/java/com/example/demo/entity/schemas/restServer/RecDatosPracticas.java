package com.example.demo.entity.schemas.restServer;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "recdatospracticas", schema = "rest_server")
public class RecDatosPracticas {
    @EmbeddedId
    private RecDatosPracticasPK id;

    public RecDatosPracticasPK getId() {
        return id;
    }

    public void setId(RecDatosPracticasPK id) {
        this.id = id;
    }
}
