package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipodestino", schema = "farmacia")
public class TipoDestino {
    @EmbeddedId
    private TipoDestinoPK id;
    private String descripcion;

    public TipoDestinoPK getId() {
        return id;
    }

    public void setId(TipoDestinoPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
