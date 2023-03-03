package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagnostico", schema = "turnos")
public class Diagnostico {
    @EmbeddedId
    private DiagnosticoPK id;
    private String diagnostico;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "profactuante")
    private String profActuante;

    public DiagnosticoPK getId() {
        return id;
    }

    public void setId(DiagnosticoPK id) {
        this.id = id;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getProfActuante() {
        return profActuante;
    }

    public void setProfActuante(String profActuante) {
        this.profActuante = profActuante;
    }
}
