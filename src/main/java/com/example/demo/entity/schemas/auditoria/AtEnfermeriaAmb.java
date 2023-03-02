package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "atenfermeriaamb")
public class AtEnfermeriaAmb {
    @EmbeddedId
    private AtEnfermeriaAmbPK id;
    private String operacion;

    public AtEnfermeriaAmbPK getId() {
        return id;
    }

    public void setId(AtEnfermeriaAmbPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
