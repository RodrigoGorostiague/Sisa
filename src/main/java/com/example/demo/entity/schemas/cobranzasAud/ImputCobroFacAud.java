package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "imput_cobro_fac")
public class ImputCobroFacAud {
    @EmbeddedId
    private ImputCobroFacAudPK id;
    private String operaciones;

    public ImputCobroFacAudPK getId() {
        return id;
    }

    public void setId(ImputCobroFacAudPK id) {
        this.id = id;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }
}
