package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EvolHistEnfermeriaPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String usuario;
    @Column(name = "nrointernacion")
    private String nroInternacion;
    @Column(name = "fechaevol")
    private Date fechaEvol;
    @Column(name = "horaevol")
    private LocalDateTime horaEvol;

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

    public String getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(String nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Date getFechaEvol() {
        return fechaEvol;
    }

    public void setFechaEvol(Date fechaEvol) {
        this.fechaEvol = fechaEvol;
    }

    public LocalDateTime getHoraEvol() {
        return horaEvol;
    }

    public void setHoraEvol(LocalDateTime horaEvol) {
        this.horaEvol = horaEvol;
    }
}
