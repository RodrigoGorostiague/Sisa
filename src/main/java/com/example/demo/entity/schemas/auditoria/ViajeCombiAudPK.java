package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ViajeCombiAudPK implements Serializable {
    private LocalDateTime fechaHora;
    private String chofer;
    private Date fecha;
    private LocalDateTime hora;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
