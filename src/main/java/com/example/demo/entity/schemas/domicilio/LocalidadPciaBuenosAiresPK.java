package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class LocalidadPciaBuenosAiresPK implements Serializable {
    @Column(name = "codigolocalidad")
    private Integer codigoLocalidad;
    @ManyToOne
    @JoinColumn(name = "codigopartido", referencedColumnName = "codigopartido")
    private PartidoPciaBuenosAires partidoPciaBuenosAires;

    public Integer getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(Integer codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public PartidoPciaBuenosAires getPartidoPciaBuenosAires() {
        return partidoPciaBuenosAires;
    }

    public void setPartidoPciaBuenosAires(PartidoPciaBuenosAires partidoPciaBuenosAires) {
        this.partidoPciaBuenosAires = partidoPciaBuenosAires;
    }
}
