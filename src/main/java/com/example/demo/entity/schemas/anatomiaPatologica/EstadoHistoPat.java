package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anaomiapatologica", name = "estadhistopat")
public class EstadoHistoPat {
    @EmbeddedId
    private EstadoHistoPatPK id;
    private String estadificacion;

    public EstadoHistoPatPK getId() {
        return id;
    }

    public void setId(EstadoHistoPatPK id) {
        this.id = id;
    }

    public String getEstadificacion() {
        return estadificacion;
    }

    public void setEstadificacion(String estadificacion) {
        this.estadificacion = estadificacion;
    }
}
