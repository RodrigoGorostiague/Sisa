package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "informepat")
public class InformePat {
    @EmbeddedId
    private InformePatPK id;
    private String operacion;

    public InformePatPK getId() {
        return id;
    }

    public void setId(InformePatPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
