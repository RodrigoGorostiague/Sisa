package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EvolHistUtiEnfPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String usuario;
    @Column(name = "nrouti")
    private String nroUti;
    @Column(name = "fechaevol")
    private Date fechaEvol;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNroUti() {
        return nroUti;
    }

    public void setNroUti(String nroUti) {
        this.nroUti = nroUti;
    }

    public Date getFechaEvol() {
        return fechaEvol;
    }

    public void setFechaEvol(Date fechaEvol) {
        this.fechaEvol = fechaEvol;
    }
}
