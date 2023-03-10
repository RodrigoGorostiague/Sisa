package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "epicrisis")
public class Epicrisis {
    @EmbeddedId
    private EpicrisisPK id;
    private String operacion;

    public EpicrisisPK getId() {
        return id;
    }

    public void setId(EpicrisisPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
