package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "perfil")
public class PerfilAud {
    @EmbeddedId
    private PerfilPK id;
    private String operacion;

    public PerfilPK getId() {
        return id;
    }

    public void setId(PerfilPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
