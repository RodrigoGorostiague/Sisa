package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialuti", name = "apache2")
public class Apache2 {
    @EmbeddedId
    private Apache2PK id;
    private Integer puntuacion;

    public Apache2PK getId() {
        return id;
    }

    public void setId(Apache2PK id) {
        this.id = id;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
}
