package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ExamenFisicoGralInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechaing")
    private Date fechaIng;
    @Column(name = "horaing")
    private LocalDateTime horaIng;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public LocalDateTime getHoraIng() {
        return horaIng;
    }

    public void setHoraIng(LocalDateTime horaIng) {
        this.horaIng = horaIng;
    }
}
