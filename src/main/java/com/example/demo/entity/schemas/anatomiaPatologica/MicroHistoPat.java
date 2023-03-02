package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "microhistopat")
public class MicroHistoPat {
    @EmbeddedId
    private MacroHistoPatPK id;
    private String microscopia;

    public MacroHistoPatPK getId() {
        return id;
    }

    public void setId(MacroHistoPatPK id) {
        this.id = id;
    }

    public String getMicroscopia() {
        return microscopia;
    }

    public void setMicroscopia(String microscopia) {
        this.microscopia = microscopia;
    }
}
