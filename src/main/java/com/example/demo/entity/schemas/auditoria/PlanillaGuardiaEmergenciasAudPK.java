package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class PlanillaGuardiaEmergenciasAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    @Column(name = "nrocon")
    private String nroCon;
    private String uniat;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNroCon() {
        return nroCon;
    }

    public void setNroCon(String nroCon) {
        this.nroCon = nroCon;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }
}
