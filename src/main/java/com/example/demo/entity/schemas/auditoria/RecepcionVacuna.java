package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "recepcionvacuna", schema = "auditoria")
public class RecepcionVacuna {
    @EmbeddedId
    private RecepcionVacunaPK id;
    private String operacion;

    public RecepcionVacunaPK getId() {
        return id;
    }

    public void setId(RecepcionVacunaPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
