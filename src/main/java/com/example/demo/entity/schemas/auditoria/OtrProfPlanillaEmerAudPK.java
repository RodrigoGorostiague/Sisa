package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class OtrProfPlanillaEmerAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    @Column(name = "nrocon")
    private Integer nroCon;
    private String uniat;
    private String medico;
    private String usuario;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getNroCon() {
        return nroCon;
    }

    public void setNroCon(Integer nroCon) {
        this.nroCon = nroCon;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
