package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "historialambulatorio", name = "historialambulatorio")
public class Problema {
    @EmbeddedId
    private ProblemaPK id;
    private String estado;
    @Column(name = "fechaproblemaanterior")
    private Date fechaProblemaAnterior;

    public ProblemaPK getId() {
        return id;
    }

    public void setId(ProblemaPK id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaProblemaAnterior() {
        return fechaProblemaAnterior;
    }

    public void setFechaProblemaAnterior(Date fechaProblemaAnterior) {
        this.fechaProblemaAnterior = fechaProblemaAnterior;
    }
}
