package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UniatServicioSalaPK  implements Serializable {
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoservicio")
    private Integer codigoServicio;
    @Column(name = "codigosala")
    private String codigoSala;

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }
}
