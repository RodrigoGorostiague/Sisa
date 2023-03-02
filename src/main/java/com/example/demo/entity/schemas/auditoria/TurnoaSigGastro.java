package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "turnoasiggastro", schema = "auditoria")
public class TurnoaSigGastro {
    @EmbeddedId
    private TurnoaSigGastroPK id;
    private String operacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public TurnoaSigGastroPK getId() {
        return id;
    }

    public void setId(TurnoaSigGastroPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
