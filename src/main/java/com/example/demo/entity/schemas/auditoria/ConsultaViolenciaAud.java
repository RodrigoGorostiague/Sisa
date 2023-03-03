package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "auditoria", name = "consultaviolencia")
public class ConsultaViolenciaAud {
    @EmbeddedId
    private ConsultaViolenciaAudPK id;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    private String operacion;

    public ConsultaViolenciaAudPK getId() {
        return id;
    }

    public void setId(ConsultaViolenciaAudPK id) {
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
