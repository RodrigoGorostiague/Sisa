package com.example.demo.entity.schemas.organizacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TelefonoInternoPK implements Serializable  {
    private Integer numero;
    @Column(name = "unidad_atencion")
    private String unidadAtencion;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(String unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }
}
