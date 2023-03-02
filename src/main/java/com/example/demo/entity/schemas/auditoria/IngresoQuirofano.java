package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "ingresoquirofano")
public class IngresoQuirofano {
    @EmbeddedId
    private IngresoQuirofanoPK id;
    private String operacion;

    public IngresoQuirofanoPK getId() {
        return id;
    }

    public void setId(IngresoQuirofanoPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
