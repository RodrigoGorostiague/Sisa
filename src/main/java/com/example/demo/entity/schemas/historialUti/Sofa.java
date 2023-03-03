package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sofa", schema = "historialuti")
public class Sofa {
    @EmbeddedId
    private SofaPK id;
    private Integer puntiacion;

    public SofaPK getId() {
        return id;
    }

    public void setId(SofaPK id) {
        this.id = id;
    }

    public Integer getPuntiacion() {
        return puntiacion;
    }

    public void setPuntiacion(Integer puntiacion) {
        this.puntiacion = puntiacion;
    }
}
