package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UniatServicioPK implements Serializable {
    @Column(name = "codigoservicio")
    private Integer codigoServicio;
    @Column(name = "codigouniat")
    private String codigoUniat;

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
