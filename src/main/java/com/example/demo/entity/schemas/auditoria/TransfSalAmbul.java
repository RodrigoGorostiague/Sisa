package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "transfsalambul", schema = "auditoria")
public class TransfSalAmbul {
    @EmbeddedId
    private TransfSalAmbulPK id;
    @Column(name = "fechadesde")
    private Date fechaDesde;
    @Column(name = "fechahasta")
    private Date fechaHasta;

    public TransfSalAmbulPK getId() {
        return id;
    }

    public void setId(TransfSalAmbulPK id) {
        this.id = id;
    }

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
