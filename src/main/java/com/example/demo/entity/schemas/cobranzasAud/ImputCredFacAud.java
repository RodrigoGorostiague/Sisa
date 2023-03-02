package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "imput_cred_fac")
public class ImputCredFacAud {
    @EmbeddedId
    private ImputCredFacAudPK id;
    private String operacion;

    public ImputCredFacAudPK getId() {
        return id;
    }

    public void setId(ImputCredFacAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
