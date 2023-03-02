package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "evolhistuti")
public class EvolHistUti {
    @EmbeddedId
    private EvolHistUtiPK id;
    private String operacion;

    public EvolHistUtiPK getId() {
        return id;
    }

    public void setId(EvolHistUtiPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
