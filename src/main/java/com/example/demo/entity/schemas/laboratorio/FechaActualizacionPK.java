package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class FechaActualizacionPK implements Serializable {
    @Column(name = "fechadesde")
    private Date fechaDesde;
    @Column(name = "fechahasta")
    private Date fechaHasta;

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
}
