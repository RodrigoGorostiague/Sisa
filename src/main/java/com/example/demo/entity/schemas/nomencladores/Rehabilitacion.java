package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rehabilitacion",schema = "nomencladores")
public class Rehabilitacion {
    @EmbeddedId
    private RehabilitacionPK id;
    @Column(name = "descripcionprac")
    private String descripcionPrac;

    public RehabilitacionPK getId() {
        return id;
    }

    public void setId(RehabilitacionPK id) {
        this.id = id;
    }

    public String getDescripcionPrac() {
        return descripcionPrac;
    }

    public void setDescripcionPrac(String descripcionPrac) {
        this.descripcionPrac = descripcionPrac;
    }
}
