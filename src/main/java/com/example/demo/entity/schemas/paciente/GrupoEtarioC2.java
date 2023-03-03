package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupoetarioc2", schema = "paciente")
public class GrupoEtarioC2 {
    @EmbeddedId
    private GrupoEtarioC2PK id;
    private String descripcion;

    public GrupoEtarioC2PK getId() {
        return id;
    }

    public void setId(GrupoEtarioC2PK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
