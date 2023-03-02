package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class IndicInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechaind")
    private Date fechaInd;
    @Column(name = "horaind")
    private LocalDateTime horaInd;

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

    public Date getFechaInd() {
        return fechaInd;
    }

    public void setFechaInd(Date fechaInd) {
        this.fechaInd = fechaInd;
    }

    public LocalDateTime getHoraInd() {
        return horaInd;
    }

    public void setHoraInd(LocalDateTime horaInd) {
        this.horaInd = horaInd;
    }
}
