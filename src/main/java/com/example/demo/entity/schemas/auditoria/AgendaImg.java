package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "agendaimg")
public class AgendaImg {
    @EmbeddedId
    private AgendaImgPK id;
    private String operacion;

    public AgendaImgPK getId() {
        return id;
    }

    public void setId(AgendaImgPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
