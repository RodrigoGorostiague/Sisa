package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidad21", schema = "turnos")
public class Especialidad21 {
    @EmbeddedId
    private Especialidad21PK id;
    private Integer orden;
    private String nombre;

    public Especialidad21PK getId() {
        return id;
    }

    public void setId(Especialidad21PK id) {
        this.id = id;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
