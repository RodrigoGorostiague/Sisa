package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class Especialidad21VigentePK implements Serializable {
    @Column(name = "numerovigencia")
    private Integer numeroVigencia;
    private Date fecha;

    public Integer getNumeroVigencia() {
        return numeroVigencia;
    }

    public void setNumeroVigencia(Integer numeroVigencia) {
        this.numeroVigencia = numeroVigencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
