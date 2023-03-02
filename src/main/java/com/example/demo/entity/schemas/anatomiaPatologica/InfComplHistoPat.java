package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "anatomiapatologica", name = "infcomplhistopat")
public class InfComplHistoPat {
    @EmbeddedId
    private InfComplHistoPatPK id;
    @Column(name = "descdiagnostico")
    private String escDiagnostico;
    private String diagnostico;

    public InfComplHistoPatPK getId() {
        return id;
    }

    public void setId(InfComplHistoPatPK id) {
        this.id = id;
    }

    public String getEscDiagnostico() {
        return escDiagnostico;
    }

    public void setEscDiagnostico(String escDiagnostico) {
        this.escDiagnostico = escDiagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
