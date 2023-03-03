package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio", name = "imcnormales")
public class ImcNormales {
    @EmbeddedId
    private ImcNormalesPK id;
    private String resultado;

    public ImcNormalesPK getId() {
        return id;
    }

    public void setId(ImcNormalesPK id) {
        this.id = id;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
