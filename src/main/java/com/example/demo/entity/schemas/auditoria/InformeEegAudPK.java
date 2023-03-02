package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class InformeEegAudPK implements Serializable {
    private LocalDateTime fecha;
    private String usuario;
    @Column(name = "nroinforme")
    private String nroInforme;
    @Column(name = "uniateeg")
    private String uniatEeg;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(String nroInforme) {
        this.nroInforme = nroInforme;
    }

    public String getUniatEeg() {
        return uniatEeg;
    }

    public void setUniatEeg(String uniatEeg) {
        this.uniatEeg = uniatEeg;
    }
}
