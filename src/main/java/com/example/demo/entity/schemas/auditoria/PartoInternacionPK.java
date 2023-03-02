package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class PartoInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
