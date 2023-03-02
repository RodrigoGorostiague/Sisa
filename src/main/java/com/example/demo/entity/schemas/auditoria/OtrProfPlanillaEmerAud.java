package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "otrprofplanillaemer", schema = "auditoria")
public class OtrProfPlanillaEmerAud {
    @EmbeddedId
    private OtrProfPlanillaEmerAudPK id;
    private String operacion;

    public OtrProfPlanillaEmerAudPK getId() {
        return id;
    }

    public void setId(OtrProfPlanillaEmerAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
