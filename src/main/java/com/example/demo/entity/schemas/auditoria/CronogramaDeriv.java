package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "cronogramaderiv")
public class CronogramaDeriv {
    @EmbeddedId
    private CronogramaDerivPK id;
    private String operacion;

    public CronogramaDerivPK getId() {
        return id;
    }

    public void setId(CronogramaDerivPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
