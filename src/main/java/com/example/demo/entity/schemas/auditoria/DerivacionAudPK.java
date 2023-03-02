package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class DerivacionAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    @Column(name = "nroplanilla")
    private Integer nroPlanilla;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getNroPlanilla() {
        return nroPlanilla;
    }

    public void setNroPlanilla(Integer nroPlanilla) {
        this.nroPlanilla = nroPlanilla;
    }
}
