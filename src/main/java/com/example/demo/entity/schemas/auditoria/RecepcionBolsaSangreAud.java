package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "recepcionbolsasangre")
public class RecepcionBolsaSangreAud {
    @EmbeddedId
    private RecepcionBolsaSangreAudPK id;
    private String operacion;

    public RecepcionBolsaSangreAudPK getId() {
        return id;
    }

    public void setId(RecepcionBolsaSangreAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
