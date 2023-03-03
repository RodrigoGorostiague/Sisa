package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "escalaglasgow")
public class EscalaGlasgow {
    @EmbeddedId
    private EscalaGlasgowPK id;
    private String decripcion;

    public EscalaGlasgowPK getId() {
        return id;
    }

    public void setId(EscalaGlasgowPK id) {
        this.id = id;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
}
