package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class PedidoImagenesInternacionPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "fechapi")
    private Date fechaPi;
    @Column(name = "harapi")
    private LocalDateTime horaPi;

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
}
