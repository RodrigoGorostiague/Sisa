package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "riesgocardiovascular")
public class RiesgoCardiovascularAud {
    @EmbeddedId
    private RiesgoCardiovascularAudPK id;
    private String operacion;

    public RiesgoCardiovascularAudPK getId() {
        return id;
    }

    public void setId(RiesgoCardiovascularAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
