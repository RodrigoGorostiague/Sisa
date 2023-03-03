package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class TurnoLibreAudPK implements Serializable {
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
