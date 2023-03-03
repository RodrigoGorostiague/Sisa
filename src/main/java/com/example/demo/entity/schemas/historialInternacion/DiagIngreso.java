package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "diagingreso")
public class DiagIngreso {
    @EmbeddedId
    private DiagIngresoPK id;

    public DiagIngresoPK getId() {
        return id;
    }

    public void setId(DiagIngresoPK id) {
        this.id = id;
    }
}
