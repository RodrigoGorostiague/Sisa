package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ResumenPracticasInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fecharp")
    private Date fechaRp;
    @Column(name = "horarp")
    private LocalDateTime horaRp;

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

    public Date getFechaRp() {
        return fechaRp;
    }

    public void setFechaRp(Date fechaRp) {
        this.fechaRp = fechaRp;
    }

    public LocalDateTime getHoraRp() {
        return horaRp;
    }

    public void setHoraRp(LocalDateTime horaRp) {
        this.horaRp = horaRp;
    }
}
