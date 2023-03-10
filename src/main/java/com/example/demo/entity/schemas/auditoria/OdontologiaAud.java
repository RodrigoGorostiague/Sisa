package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "odontologia")
public class OdontologiaAud {
    @EmbeddedId
    private OdontologiaAudPK id;
    private String operacion;

    public OdontologiaAudPK getId() {
        return id;
    }

    public void setId(OdontologiaAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
