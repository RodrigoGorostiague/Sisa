package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "transfusion")
public class Transfusion {
    @EmbeddedId
    private TransfusionPK id;
    private String operacion;

    public TransfusionPK getId() {
        return id;
    }

    public void setId(TransfusionPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
