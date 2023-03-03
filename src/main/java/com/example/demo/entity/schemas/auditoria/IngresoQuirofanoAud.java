package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "ingresoquirofano")
public class IngresoQuirofanoAud {
    @EmbeddedId
    private IngresoQuirofanoAudPK id;
    private String operacion;

    public IngresoQuirofanoAudPK getId() {
        return id;
    }

    public void setId(IngresoQuirofanoAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
