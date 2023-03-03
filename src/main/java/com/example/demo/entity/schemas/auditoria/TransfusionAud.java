package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "transfusion")
public class TransfusionAud {
    @EmbeddedId
    private TransfusionAudPK id;
    private String operacion;

    public TransfusionAudPK getId() {
        return id;
    }

    public void setId(TransfusionAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
