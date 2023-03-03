package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "agendaimg")
public class AgendaImgAud {
    @EmbeddedId
    private AgendaImgAudPK id;
    private String operacion;

    public AgendaImgAudPK getId() {
        return id;
    }

    public void setId(AgendaImgAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
