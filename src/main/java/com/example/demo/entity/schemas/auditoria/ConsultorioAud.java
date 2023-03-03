package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "consultorio")
public class ConsultorioAud {
    @EmbeddedId
    private ConsultorioAudPK id;
    private String operacion;

    public ConsultorioAudPK getId() {
        return id;
    }

    public void setId(ConsultorioAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
