package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "piediabetico", schema = "historalambesp")
public class PieDiabetico {
    @EmbeddedId
    private PieDiabeticoPK id;
    private String color;

    public PieDiabeticoPK getId() {
        return id;
    }

    public void setId(PieDiabeticoPK id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
