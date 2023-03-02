package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class PedidoInterConsultaPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechapi")
    private Date fechaPi;
    @Column(name = "horapi")
    private LocalDateTime horaPi;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;

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

    public Date getFechaPi() {
        return fechaPi;
    }

    public void setFechaPi(Date fechaPi) {
        this.fechaPi = fechaPi;
    }

    public LocalDateTime getHoraPi() {
        return horaPi;
    }

    public void setHoraPi(LocalDateTime horaPi) {
        this.horaPi = horaPi;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }
}
