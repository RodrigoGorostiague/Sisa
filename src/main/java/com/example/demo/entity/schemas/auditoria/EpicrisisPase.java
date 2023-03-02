package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "epicrisispase")
public class EpicrisisPase {
    @EmbeddedId
    private EpicrisisPasePK id;
    private String operacion;

    public EpicrisisPasePK getId() {
        return id;
    }

    public void setId(EpicrisisPasePK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
