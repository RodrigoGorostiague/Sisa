package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "evolhistutienf")
public class EvolHistUtiEnf {
    @EmbeddedId
    private EvolHistUtiEnfPK id;
    private String operacion;

    public EvolHistUtiEnfPK getId() {
        return id;
    }

    public void setId(EvolHistUtiEnfPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
