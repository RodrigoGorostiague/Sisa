package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "presentacion", schema = "farmacia_kairos")
public class Presentacion {
    @EmbeddedId
    private PresentacionPK id;
    private String descripcion;

    public PresentacionPK getId() {
        return id;
    }

    public void setId(PresentacionPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
