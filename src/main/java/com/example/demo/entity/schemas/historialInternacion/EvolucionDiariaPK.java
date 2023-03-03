package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EvolucionDiariaPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer norInternacion;
    @Column(name = "fechaevol")
    private Date fechaEvol;
    @Column(name = "horaevol")
    private LocalDateTime horaEvol;
    private String codigopersonal;

    public Integer getNorInternacion() {
        return norInternacion;
    }

    public void setNorInternacion(Integer norInternacion) {
        this.norInternacion = norInternacion;
    }

    public Date getFechaEvol() {
        return fechaEvol;
    }

    public void setFechaEvol(Date fechaEvol) {
        this.fechaEvol = fechaEvol;
    }

    public LocalDateTime getHoraEvol() {
        return horaEvol;
    }

    public void setHoraEvol(LocalDateTime horaEvol) {
        this.horaEvol = horaEvol;
    }

    public String getCodigopersonal() {
        return codigopersonal;
    }

    public void setCodigopersonal(String codigopersonal) {
        this.codigopersonal = codigopersonal;
    }
}
