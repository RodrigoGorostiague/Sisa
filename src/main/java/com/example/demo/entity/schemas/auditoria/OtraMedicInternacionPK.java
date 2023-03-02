package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class OtraMedicInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechamed")
    private Date fechaMed;
    @Column(name = "horamed")
    private LocalDateTime horaMed;

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

    public Date getFechaMed() {
        return fechaMed;
    }

    public void setFechaMed(Date fechaMed) {
        this.fechaMed = fechaMed;
    }

    public LocalDateTime getHoraMed() {
        return horaMed;
    }

    public void setHoraMed(LocalDateTime horaMed) {
        this.horaMed = horaMed;
    }
}
