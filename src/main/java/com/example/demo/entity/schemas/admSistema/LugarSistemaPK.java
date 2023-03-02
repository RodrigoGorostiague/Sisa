package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class LugarSistemaPK implements Serializable {
    @Column(name = "codigoprovincia")
    private Integer codigoProvincia;
    @Column(name = "codigopais")
    private Integer codigoPais;
    @Column(name = "codigolocalidad")
    private Integer codigoLocalidad;
    @Column(name = "codigopartido")
    private Integer codigoPartido;

    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public Integer getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

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
