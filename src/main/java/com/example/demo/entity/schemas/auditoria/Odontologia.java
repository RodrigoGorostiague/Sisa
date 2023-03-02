package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "odontologia")
public class Odontologia {
    @EmbeddedId
    private OdontologiaPK id;
    private String operacion;

    public OdontologiaPK getId() {
        return id;
    }

    public void setId(OdontologiaPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
