package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evoluciontiss28", schema = "historialuti")
public class EvolucionTiss28 {
    @EmbeddedId
    private EvolucionTiss28PK id;
    private String comentarios;

    public EvolucionTiss28PK getId() {
        return id;
    }

    public void setId(EvolucionTiss28PK id) {
        this.id = id;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
