package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "cobros")
public class CobrosAud {
    @EmbeddedId
    private CobrosAudPK id;
    private String operacion;

    public CobrosAudPK getId() {
        return id;
    }

    public void setId(CobrosAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
