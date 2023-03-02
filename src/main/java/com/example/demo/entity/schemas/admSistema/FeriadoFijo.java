package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "feriadofijo")
public class FeriadoFijo {
    @EmbeddedId
    private FeriadoFijoPK id;
    private String descripcion;

    public FeriadoFijoPK getId() {
        return id;
    }

    public void setId(FeriadoFijoPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
