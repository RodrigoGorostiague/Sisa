package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "diaghistopat")
public class DiagHistoPat {
    @EmbeddedId
    private DiagHistoPatPK id;
    private String diagnostico;
    @Column(name = "descdiagnostico")
    private String descDiagnostico;

    public DiagHistoPatPK getId() {
        return id;
    }

    public void setId(DiagHistoPatPK id) {
        this.id = id;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDescDiagnostico() {
        return descDiagnostico;
    }

    public void setDescDiagnostico(String descDiagnostico) {
        this.descDiagnostico = descDiagnostico;
    }
}
