package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class ConsumoFarGuardiaPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    @Column(name = "nrocom")
    private String nroCom;
    @Column(name = "uniat")
    private String uniAt;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNroCom() {
        return nroCom;
    }

    public void setNroCom(String nroCom) {
        this.nroCom = nroCom;
    }

    public String getUniAt() {
        return uniAt;
    }

    public void setUniAt(String uniAt) {
        this.uniAt = uniAt;
    }
}
