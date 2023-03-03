package com.example.demo.entity.schemas.pami;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "equivalencia_especialidad",schema = "pami")
public class EquivalenciaEspecialidad {
    @EmbeddedId
    private EquivalenciaEspecialidadPK id;
    private String descripcion;

    public EquivalenciaEspecialidadPK getId() {
        return id;
    }

    public void setId(EquivalenciaEspecialidadPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
