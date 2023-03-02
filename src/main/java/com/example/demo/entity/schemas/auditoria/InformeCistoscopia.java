package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "informecistoscopia")
public class InformeCistoscopia {
    @EmbeddedId
    private InformeCistoscopiaPK id;
    private String operacion;

    public InformeCistoscopiaPK getId() {
        return id;
    }

    public void setId(InformeCistoscopiaPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
