package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "bajavacunas")
public class BajaVacuna {
    @EmbeddedId
    private BajaVacunaPK id;
    private String operaciones;

    public BajaVacunaPK getId() {
        return id;
    }

    public void setId(BajaVacunaPK id) {
        this.id = id;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }
}
