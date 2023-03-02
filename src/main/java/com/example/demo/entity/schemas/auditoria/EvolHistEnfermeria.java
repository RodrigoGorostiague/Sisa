package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "evolhistenfermeria")
public class EvolHistEnfermeria {
    @EmbeddedId
    private EvolHistEnfermeriaPK id;
    private String operacion;

    public EvolHistEnfermeriaPK getId() {
        return id;
    }

    public void setId(EvolHistEnfermeriaPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
