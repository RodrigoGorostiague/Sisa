package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class PrestacionInterPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "codigoprestacion")
    private String codigoPrestacion;
    private Date fecha;
    private LocalDateTime hora;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getCodigoPrestacion() {
        return codigoPrestacion;
    }

    public void setCodigoPrestacion(String codigoPrestacion) {
        this.codigoPrestacion = codigoPrestacion;
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
