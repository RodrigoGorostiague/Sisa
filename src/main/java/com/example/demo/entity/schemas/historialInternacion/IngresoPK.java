package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class IngresoPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechaing")
    private Date fechaIng;
    @Column(name = "horaing")
    private LocalDateTime horaIng;

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
