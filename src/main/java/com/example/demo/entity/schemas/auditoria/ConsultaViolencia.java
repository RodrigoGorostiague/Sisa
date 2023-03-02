package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "auditoria", name = "consultaviolencia")
public class ConsultaViolencia {
    @EmbeddedId
    private ConsultaViolenciaPK id;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    private String operacion;

    public ConsultaViolenciaPK getId() {
        return id;
    }

    public void setId(ConsultaViolenciaPK id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
