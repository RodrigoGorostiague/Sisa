package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LocalidadPK implements Serializable {
    @Column(name = "codigolocalidad")
    private Integer codigoLocalidad;
    @Column(name = "codigopartido")
    private Integer codigoPartido;

    public Integer getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(Integer codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public Integer getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(Integer codigoPartido) {
        this.codigoPartido = codigoPartido;
    }
}
