package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "devol_cobro")
public class DevolCobroAud {
    @EmbeddedId
    private DevolCobroAudPK id;
    private String operacion;

    public DevolCobroAudPK getId() {
        return id;
    }

    public void setId(DevolCobroAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
