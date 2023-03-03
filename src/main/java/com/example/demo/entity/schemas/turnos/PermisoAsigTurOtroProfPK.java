package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PermisoAsigTurOtroProfPK implements Serializable {
    @Column(name = "profasigna")
    private String profAsigna;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "profturno")
    private String profTurno;

    public String getProfAsigna() {
        return profAsigna;
    }

    public void setProfAsigna(String profAsigna) {
        this.profAsigna = profAsigna;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getProfTurno() {
        return profTurno;
    }

    public void setProfTurno(String profTurno) {
        this.profTurno = profTurno;
    }
}
