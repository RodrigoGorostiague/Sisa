package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "imput_deb_fac")
public class ImputDebFacAud {
    @EmbeddedId
    private ImputDebFacAudPK id;
    private String operacion;

    public ImputDebFacAudPK getId() {
        return id;
    }

    public void setId(ImputDebFacAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
