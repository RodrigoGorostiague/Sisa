package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "intervencionquirurgica")
public class IntervencionQuirurgica {
    @EmbeddedId
    private IntervencionQuirurgicaPK id;
    private String operacion;

    public IntervencionQuirurgicaPK getId() {
        return id;
    }

    public void setId(IntervencionQuirurgicaPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
