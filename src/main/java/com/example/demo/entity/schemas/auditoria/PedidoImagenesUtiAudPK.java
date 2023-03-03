package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class PedidoImagenesUtiAudPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "nrouti")
    private Integer nroUti;
    @Column(name = "fechapi")
    private Date fechaPi;
    @Column(name = "horapi")
    private LocalDateTime horaPi;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Integer getNroUti() {
        return nroUti;
    }

    public void setNroUti(Integer nroUti) {
        this.nroUti = nroUti;
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
