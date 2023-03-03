package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SinCoberturaPK implements Serializable {
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "codigoobrasocial")
    private Integer codigoObraSocial;

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public Integer getCodigoObraSocial() {
        return codigoObraSocial;
    }

    public void setCodigoObraSocial(Integer codigoObraSocial) {
        this.codigoObraSocial = codigoObraSocial;
    }
}

