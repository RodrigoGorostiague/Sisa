package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class TurnoLibresEmiAuditoriaPK implements Serializable {
    @Column(name = "fechageneracion")
    private Date fechaGeneracion;
    private String usuario;
    @Column(name = "horageneracion")
    private LocalDateTime horaGeneracion;

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getHoraGeneracion() {
        return horaGeneracion;
    }

    public void setHoraGeneracion(LocalDateTime horaGeneracion) {
        this.horaGeneracion = horaGeneracion;
    }
}
