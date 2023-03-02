package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "partido")
public class Partido {
    @EmbeddedId
    private PartidoPK id;
    private String nombre;

    public PartidoPK getId() {
        return id;
    }

    public void setId(PartidoPK id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
