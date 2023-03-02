package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ConstantesVitalesInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechacv")
    private Date fechaCv;
    @Column(name = "horacv")
    private LocalDateTime horaCv;

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

    public Date getFechaCv() {
        return fechaCv;
    }

    public void setFechaCv(Date fechaCv) {
        this.fechaCv = fechaCv;
    }

    public LocalDateTime getHoraCv() {
        return horaCv;
    }

    public void setHoraCv(LocalDateTime horaCv) {
        this.horaCv = horaCv;
    }
}
