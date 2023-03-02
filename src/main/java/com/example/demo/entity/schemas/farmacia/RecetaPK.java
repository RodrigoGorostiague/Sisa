package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class RecetaPK implements Serializable {
    @Column(name = "nroreceta")
    private String nroReceta;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;

    public String getNroReceta() {
        return nroReceta;
    }

    public void setNroReceta(String nroReceta) {
        this.nroReceta = nroReceta;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
