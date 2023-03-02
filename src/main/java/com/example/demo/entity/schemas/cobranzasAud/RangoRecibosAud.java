package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "rangorecibos")
public class RangoRecibosAud {
    @EmbeddedId
    private RangoRecibosAudPK id;
    private String operacion;

    public RangoRecibosAudPK getId() {
        return id;
    }

    public void setId(RangoRecibosAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
