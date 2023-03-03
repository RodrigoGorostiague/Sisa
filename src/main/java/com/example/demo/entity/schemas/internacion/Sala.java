package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sala", schema = "internacion")
public class Sala {
    @EmbeddedId
    private SalaPK id;
    private String nombre;
    private String habilitado;

    public SalaPK getId() {
        return id;
    }

    public void setId(SalaPK id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }
}
