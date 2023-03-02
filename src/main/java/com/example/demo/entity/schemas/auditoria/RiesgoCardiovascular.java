package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "riesgocardiovascular")
public class RiesgoCardiovascular {
    @EmbeddedId
    private RiesgoCardiovascularPK id;
    private String operacion;

    public RiesgoCardiovascularPK getId() {
        return id;
    }

    public void setId(RiesgoCardiovascularPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
