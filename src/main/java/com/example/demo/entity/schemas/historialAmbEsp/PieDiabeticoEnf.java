package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "piediabeticoenf", schema = "historialambesp")
public class PieDiabeticoEnf {
    @EmbeddedId
    private PieDiabeticoEnfPK id;
    private String color;

    public PieDiabeticoEnfPK getId() {
        return id;
    }

    public void setId(PieDiabeticoEnfPK id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
