package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class IngresosEgresosInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechaie")
    private Date fechaIe;
    @Column(name = "horaie")
    private LocalDateTime horaIe;

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

    public Date getFechaIe() {
        return fechaIe;
    }

    public void setFechaIe(Date fechaIe) {
        this.fechaIe = fechaIe;
    }

    public LocalDateTime getHoraIe() {
        return horaIe;
    }

    public void setHoraIe(LocalDateTime horaIe) {
        this.horaIe = horaIe;
    }
}
