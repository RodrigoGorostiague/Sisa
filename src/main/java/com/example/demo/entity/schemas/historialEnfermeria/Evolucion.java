package com.example.demo.entity.schemas.historialEnfermeria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialenfermeria", name = "evolucion")
public class Evolucion {
    @EmbeddedId
    private EvolucionPK id;
    private String comentario;

    public EvolucionPK getId() {
        return id;
    }

    public void setId(EvolucionPK id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
