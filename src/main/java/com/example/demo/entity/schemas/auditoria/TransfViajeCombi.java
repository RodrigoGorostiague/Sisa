package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "auditoria", name = "transfviajecombi")
public class TransfViajeCombi {
    @EmbeddedId
    private TransfViajeCombiPK id;
    @Column(name = "fechadesde")
    private Date fechaDesde;
    @Column(name = "fechahasta")
    private Date fechaHasta;

    public TransfViajeCombiPK getId() {
        return id;
    }

    public void setId(TransfViajeCombiPK id) {
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
