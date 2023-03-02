package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EvolDiariaHistInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechaevol")
    private Date fechaEvolucion;
    @Column(name = "horaevol")
    private LocalDateTime horaEvolucion;

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

    public Date getFechaEvolucion() {
        return fechaEvolucion;
    }

    public void setFechaEvolucion(Date fechaEvolucion) {
        this.fechaEvolucion = fechaEvolucion;
    }

    public LocalDateTime getHoraEvolucion() {
        return horaEvolucion;
    }

    public void setHoraEvolucion(LocalDateTime horaEvolucion) {
        this.horaEvolucion = horaEvolucion;
    }
}
