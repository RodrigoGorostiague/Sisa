package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "profhabilitadoturnorefcontraref", schema = "turnos")
public class ProfHabilitadoTurnoRefContraRef {
    @EmbeddedId
    private ProfHabilitadoTurnoRefContraRefPK id;

    public ProfHabilitadoTurnoRefContraRefPK getId() {
        return id;
    }

    public void setId(ProfHabilitadoTurnoRefContraRefPK id) {
        this.id = id;
    }
}
