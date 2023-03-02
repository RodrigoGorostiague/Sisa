package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "emergencia", name = "triage_hallazgos_intervenfermeria")
public class TriageHallazgosIntervEnfermeria {
    @EmbeddedId
    private TriageHallazgosIntervEnfermeriaPK id;

    public TriageHallazgosIntervEnfermeriaPK getId() {
        return id;
    }

    public void setId(TriageHallazgosIntervEnfermeriaPK id) {
        this.id = id;
    }
}
