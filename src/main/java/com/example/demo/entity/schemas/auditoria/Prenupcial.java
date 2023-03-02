package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "auditoria", name = "prenupcial")
public class Prenupcial {
    @EmbeddedId
    private PrenupcialPK id;
    @Column(name = "fechacasamiento")
    private Date fechaCasamiento;
    private String operacion;

    public PrenupcialPK getId() {
        return id;
    }

    public void setId(PrenupcialPK id) {
        this.id = id;
    }

    public Date getFechaCasamiento() {
        return fechaCasamiento;
    }

    public void setFechaCasamiento(Date fechaCasamiento) {
        this.fechaCasamiento = fechaCasamiento;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
