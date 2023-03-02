package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "accidentado_involucra_planilla")
public class AccidentadoInvolucraPlanilla {
    @EmbeddedId
    private AccidentadoInvolucraPlanillaPK id;

    public AccidentadoInvolucraPlanillaPK getId() {
        return id;
    }

    public void setId(AccidentadoInvolucraPlanillaPK id) {
        this.id = id;
    }
}
