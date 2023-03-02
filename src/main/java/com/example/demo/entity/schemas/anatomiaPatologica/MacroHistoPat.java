package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "macrohistopat")
public class MacroHistoPat {
    @EmbeddedId
    private MacroHistoPatPK id;
    private String macroscopia;

    public MacroHistoPatPK getId() {
        return id;
    }

    public void setId(MacroHistoPatPK id) {
        this.id = id;
    }

    public String getMacroscopia() {
        return macroscopia;
    }

    public void setMacroscopia(String macroscopia) {
        this.macroscopia = macroscopia;
    }
}
